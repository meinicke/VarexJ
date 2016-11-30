package varexj.trace.view.editparts;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.ITextEditor;

import coverplugin.Activator;
import gov.nasa.jpf.vm.MethodInfo;
import varexj.trace.view.TraceView;

/**
 * TODO description
 * 
 * @author Jens Meinicke
 *
 */
public class EditorHelper {
	
	public static void open(MethodInfo mi, int lineNumber) {
		IFile file = getFile(mi);
		IWorkbenchWindow dw = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = dw.getActivePage();
		IEditorPart editor = openEditor(file, page);
		scrollToLine(editor, lineNumber);
	}
	
	// TODO revise this
	private static IFile getFile(MethodInfo mi) {
		IProject prj = ResourcesPlugin.getWorkspace().getRoot().getProject(TraceView.PROJECT_NAME);
		IFile file = prj.getFile("src/" + mi.getSourceFileName());
		return file;
	}

	private static IEditorPart openEditor(IFile file, IWorkbenchPage page) {
		IEditorPart editor = null;
		if (page != null) {
			IContentType contentType = null;
			try {
				IContentDescription description = file.getContentDescription();
				if (description != null) {
					contentType = description.getContentType();
				}
				IEditorDescriptor desc = null;
				if (contentType != null) {
					desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName(), contentType);
				} else {
					desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());
				}

				if (desc != null) {
					editor = page.openEditor(new FileEditorInput(file), desc.getId());
				} else {
					// case: there is no default editor for the file
					editor = page.openEditor(new FileEditorInput(file), "org.eclipse.ui.DefaultTextEditor");
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return editor;
	}

	public static void scrollToLine(IEditorPart editorPart, int lineNumber) {
		if (!(editorPart instanceof ITextEditor) || lineNumber <= 0) {
			return;
		}
		ITextEditor editor = (ITextEditor) editorPart;
		IDocument document = editor.getDocumentProvider().getDocument(editor.getEditorInput());
		if (document != null) {
			IRegion lineInfo = null;
			try {
				lineInfo = document.getLineInformation(lineNumber - 1);
			} catch (BadLocationException e) {
			}
			if (lineInfo != null) {
				editor.selectAndReveal(lineInfo.getOffset(), lineInfo.getLength());
			}
		}
	}

}
