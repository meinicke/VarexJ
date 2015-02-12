/* FeatureIDE - A Framework for Feature-Oriented Software Development
 * Copyright (C) 2005-2013  FeatureIDE team, University of Magdeburg, Germany
 *
 * This file is part of FeatureIDE.
 * 
 * FeatureIDE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * FeatureIDE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with FeatureIDE.  If not, see <http://www.gnu.org/licenses/>.
 *
 * See http://www.fosd.de/featureide/ for further information.
 */
package coverplugin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationModelEvent;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModelExtension;
import org.eclipse.jface.text.source.IAnnotationModelListener;
import org.eclipse.jface.text.source.IAnnotationModelListenerExtension;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;
import org.xml.sax.SAXException;

import coverage.Coverage;
import coverage.Interaction;
import coverage.UnsupportedCoverageException;
import coverage.XMLReader;
import coverplugin.LOGGER.COLOR;

/**
 * Assigns color annotations to the editor.
 * 
 * @author Jens Meinicke
 */
public final class ColorAnnotationModel implements IAnnotationModel {

	/** Key used to piggyback the model to the editors model. */
	private static final Object KEY = new Object();

	private static boolean highlighting = true;

	/** List of current ColorAnnotations */
	private List<ColorAnnotation> annotations = new ArrayList<ColorAnnotation>(32);
	private HashMap<Integer, Position> annotatedPositions = new HashMap<Integer, Position>();

	// private HashMap<Integer, FSTDirective> directiveMap = new
	// HashMap<Integer, FSTDirective>();
	// private LinkedList<FSTDirective> validDirectiveList = new
	// LinkedList<FSTDirective>();

	/** List of registered IAnnotationModelListener */
	private Set<IAnnotationModelListener> annotationModelListeners = new HashSet<IAnnotationModelListener>(2);

	private final IDocument document;
	private final IFile file;

	private int openConnections = 0;
	private int docLines, docLength;

	private IDocumentListener documentListener = new IDocumentListener() {
		@Override
		public void documentChanged(DocumentEvent event) {
			IDocument newDoc = event.getDocument();
			if (docLines != newDoc.getNumberOfLines()) {
				updateAnnotations(false);
				docLines = newDoc.getNumberOfLines();
				docLength = newDoc.getLength();
			} else {
				changeAnnotations(event.getOffset(), newDoc.getLength());
			}
		}

		@Override
		public void documentAboutToBeChanged(DocumentEvent event) {
		}
	};

	private ColorAnnotationModel(IDocument document, IFile file, ITextEditor editor) {
		this.document = document;
		this.file = file;
		docLines = document.getNumberOfLines();
		docLength = document.getLength();

		updateAnnotations(true);

		editor.addPropertyListener(new IPropertyListener() {
			@Override
			public void propertyChanged(Object source, int propId) {
				if (propId == IEditorPart.PROP_DIRTY && !((ITextEditor) source).isDirty()) {
					updateAnnotations(true);
				}
			}
		});
	}

	/**
	 * Attaches a coverage annotation model for the given editor if the editor
	 * can be annotated. Does nothing if the model is already attached.
	 * 
	 * @param editor
	 *            Editor to attach a annotation model to
	 */
	public static boolean attach(ITextEditor editor) {
		IDocumentProvider provider = editor.getDocumentProvider();
		IEditorInput input = editor.getEditorInput();

		if (provider != null && (input instanceof FileEditorInput)) {
			IAnnotationModel model = provider.getAnnotationModel(input);

			if (model instanceof IAnnotationModelExtension) {
				IAnnotationModelExtension modelex = (IAnnotationModelExtension) model;

				ColorAnnotationModel colormodel = (ColorAnnotationModel) modelex.getAnnotationModel(KEY);

				if (colormodel == null) {
					IFile file = ((FileEditorInput) input).getFile();
					IDocument document = provider.getDocument(input);
					colormodel = new ColorAnnotationModel(document, file, editor);
					modelex.addAnnotationModel(KEY, colormodel);
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Detaches the coverage annotation model from the given editor. If the
	 * editor does not have a model attached, this method does nothing.
	 * 
	 * @param editor
	 *            Editor to detach the annotation model from
	 */
	public static void detach(ITextEditor editor) {
		IDocumentProvider provider = editor.getDocumentProvider();
		if (provider != null) {
			IAnnotationModel model = provider.getAnnotationModel(editor.getEditorInput());

			if (model instanceof IAnnotationModelExtension) {
				IAnnotationModelExtension modelex = (IAnnotationModelExtension) model;

				modelex.removeAnnotationModel(KEY);
			}
		}
	}

	/**
	 * Changes the whether the editor highlights the directives or not.
	 * 
	 * Updates the annotations if the value changed.
	 * 
	 * @param highlighting
	 *            true: highlights directives in the editor
	 */
	public static void setHighlighting(boolean highlighting, ITextEditor editor) {
		if (ColorAnnotationModel.highlighting != highlighting) {
			ColorAnnotationModel.highlighting = highlighting;
			attach(editor);
		}
	}

	/**
	 * This method is called, when the document is changed, but the number of
	 * lines stays the same.
	 * 
	 * It updates the offset and length of annotations, with an offset greater
	 * than the "change offset".
	 * 
	 * @param offset
	 *            the change offset
	 * @param newLength
	 *            the length of the changed document
	 */
	private void changeAnnotations(int offset, int newLength) {
		AnnotationModelEvent modelEvent = new AnnotationModelEvent(this);

		for (ColorAnnotation annotation : annotations) {
			Position pos = annotation.getPosition();
			if (pos.getOffset() > offset) {
				annotation.updateOffset(newLength - docLength);
				modelEvent.annotationChanged(annotation);
			} else if (pos.includes(offset)) {
				annotation.updateLength(newLength - docLength);
				modelEvent.annotationChanged(annotation);
			}
		}
		docLength = newLength;

		fireModelChanged(modelEvent);
	}

	/**
	 * This method is called, when the document is saved or when the document
	 * and the number of lines are changed.
	 * 
	 * It removes all annotations and creates new.
	 * 
	 * @param createNew
	 *            true: builds new FSTModel false: only gets new FSTDirectives
	 */
	private void updateAnnotations(boolean createNew) {
		if (!annotations.isEmpty()) {
			clear();
		}
		// if (createNew) {
		annotatedPositions = new HashMap<Integer, Position>(docLines);
		// createDirectiveList();
		createAnnotations();
		// } else if (!directiveMap.isEmpty()) {
		// annotatedPositions.clear();
		// // updateDirectives();
		// createAnnotations();
		// }
	}

	/**
	 * Removes all annotations.
	 */
	private void clear() {
		AnnotationModelEvent event = new AnnotationModelEvent(this);
		for (final ColorAnnotation ca : annotations) {
			event.annotationRemoved(ca, ca.getPosition());
		}
		annotations.clear();

		fireModelChanged(event);
	}

	IFile coveragIFile;

	/**
	 * Creates the color annotations from the FSTDirectives.
	 */
	private void createAnnotations() {
		LOGGER.log(COLOR.BLUE, "ColorAnnotationModel.createAnnotations for " + file);

		List<Integer> lineLength = new LinkedList<Integer>();
		try {
			InputStream inputStream = new FileInputStream(file.getRawLocation().makeAbsolute().toFile());
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
				String line;
				while ((line = reader.readLine()) != null) {
					lineLength.add(line.length());
				}

			}

			AnnotationModelEvent event = new AnnotationModelEvent(this);

			IFile newCoveragIFile = file.getProject().getFile("coverage.xml");
			if (newCoveragIFile.exists()) {
				coveragIFile = newCoveragIFile;

			}
			if (coveragIFile == null) {
				return;
			}
			LOGGER.log(COLOR.MAGENTA, coveragIFile.getFullPath());

			File coveragFile = coveragIFile.getRawLocation().makeAbsolute().toFile();
			Coverage coverage;
			coverage = new XMLReader().readFromFile(coveragFile);

			Collection<Interaction> coveredLines = coverage.getCoverage(file.getName());
			if (coveredLines.isEmpty()) {
				return;
			}
			int i = 0;
			int from = Integer.MIN_VALUE;
			int length = 0;
			int current = Integer.MIN_VALUE;
			int lastInteraction = Integer.MIN_VALUE;
			ColorAnnotation.base = coverage.getBaseValue();
			String text = "";
			for (Interaction interaction : coveredLines) {
				int covered = interaction.getLine();
				int lineNr = covered == 0 ? 0 : covered - 1;
				if (from == Integer.MIN_VALUE) {
					from = covered;
					current = covered;
					lastInteraction = interaction.getInteraction();
					text = interaction.getText();
					length = document.getLineLength(lineNr);
					continue;
				}
				if (covered == current + 1 && lastInteraction == interaction.getInteraction() && text.equals(interaction.getText())) {
					current = covered;
					length += document.getLineLength(lineNr);
					continue;
				}
				// paint last
				int offset = document.getLineOffset(from == 0 ? 0 : from - 1);
				Position newPos = new Position(offset, length);
				final ColorAnnotation ca;
				ca = new ColorAnnotation(lastInteraction, newPos, coverage.getType(), text);

				annotations.add(ca);
				event.annotationAdded(ca);
				annotatedPositions.put(i++, newPos);

				// set new start
				from = covered;
				current = covered;
				lastInteraction = interaction.getInteraction();
				text = interaction.getText();
				length = document.getLineLength(lineNr);
			}

			int offset = document.getLineOffset(from <= 0 ? 0 : from - 1);
			Position newPos = new Position(offset, length);

			ColorAnnotation ca = new ColorAnnotation(lastInteraction, newPos, coverage.getType(), text);
			annotations.add(ca);
			event.annotationAdded(ca);
			annotatedPositions.put(i++, newPos);

			fireModelChanged(event);
		} catch (IOException | BadLocationException | ParserConfigurationException | TransformerException | SAXException e) {
			e.printStackTrace();
		} catch (UnsupportedCoverageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void fireModelChanged(AnnotationModelEvent event) {
		event.markSealed();
		if (!event.isEmpty()) {
			for (final IAnnotationModelListener l : annotationModelListeners) {
				if (l instanceof IAnnotationModelListenerExtension) {
					((IAnnotationModelListenerExtension) l).modelChanged(event);
				} else {
					l.modelChanged(this);
				}
			}
		}
	}

	@Override
	public void addAnnotationModelListener(IAnnotationModelListener listener) {
		if (!annotationModelListeners.contains(listener)) {
			annotationModelListeners.add(listener);
			fireModelChanged(new AnnotationModelEvent(this, true));
		}
	}

	@Override
	public void removeAnnotationModelListener(IAnnotationModelListener listener) {
		annotationModelListeners.remove(listener);
	}

	@Override
	public void connect(IDocument document) {
		if (this.document != document)
			throw new RuntimeException("Can't connect to different document.");
		for (final ColorAnnotation ca : annotations) {
			try {
				document.addPosition(ca.getPosition());
			} catch (BadLocationException ex) {
			}
		}
		if (openConnections++ == 0) {
			document.addDocumentListener(documentListener);
		}
	}

	@Override
	public void disconnect(IDocument document) {
		if (this.document != document)
			throw new RuntimeException("Can't disconnect from different document.");
		for (final ColorAnnotation ca : annotations) {
			document.removePosition(ca.getPosition());
		}
		if (--openConnections == 0) {
			document.removeDocumentListener(documentListener);
		}
	}

	/**
	 * External modification is not supported.
	 */
	@Override
	public void addAnnotation(Annotation annotation, Position position) {
		throw new UnsupportedOperationException();
	}

	/**
	 * External modification is not supported.
	 */
	@Override
	public void removeAnnotation(Annotation annotation) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterator<?> getAnnotationIterator() {
		return annotations.iterator();
	}

	@Override
	public Position getPosition(Annotation annotation) {
		if (annotation instanceof ColorAnnotation) {
			return ((ColorAnnotation) annotation).getPosition();
		} else {
			return null;
		}
	}
}
