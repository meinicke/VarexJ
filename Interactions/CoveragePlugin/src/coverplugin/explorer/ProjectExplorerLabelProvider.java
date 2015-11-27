package coverplugin.explorer;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.internal.core.CompilationUnit;
import org.eclipse.jdt.internal.core.PackageFragment;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.xml.sax.SAXException;

import coverage.Coverage;
import coverage.Interaction;
import coverage.UnsupportedCoverageException;
import coverage.XMLReader;

/**
 * Highlights interactions in the project explorer.
 * 
 * @author Jens Meinicke
 */
@SuppressWarnings("restriction")
public class ProjectExplorerLabelProvider implements ILabelProvider, IColorProvider {

	private Coverage coverage = null;
	private long stamp = IResource.NULL_STAMP;

	@Override
	public void addListener(ILabelProviderListener listener) {

	}

	@Override
	public void dispose() {

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {

	}

	@Override
	public Image getImage(Object element) {
		return null;
	}

	@Override
	public String getText(Object element) {
		return null;
	}

	@Override
	public Color getForeground(Object element) {
		return null;
	}

	@Override
	public Color getBackground(Object element) {
		boolean isDefaultPackage = false;
		IResource res = null;
		if (element instanceof PackageFragment) {
			PackageFragment frag = (PackageFragment) element;
			isDefaultPackage = frag.isDefaultPackage();
			res = (IFolder) frag.getResource();
		} else if (element instanceof CompilationUnit) {
			res = ((CompilationUnit) element).getResource();
		} else {
			return null;
		}
		int interaction = getMaxInteraction(res, isDefaultPackage);
		return getColor(interaction);
	}
	
	Color getColor(int i) {
		if (i == Integer.MIN_VALUE) {
			return null;
		}
		i = i - coverage.getBaseValue();
		switch (i) {
		case 0:
			return new Color(null, 166, 255, 201); 
		case 1:
			return new Color(null, 164, 228, 148);
		case 2:
			return new Color(null, 255, 255, 128);
		case 3:
			return new Color(null, 255, 246, 131);
		case 4:
			return new Color(null, 255, 236, 134);
		case 5:
			return new Color(null, 255, 227, 138);
		case 6:
			return new Color(null, 255, 217, 141);
		case 7:
			return new Color(null, 255, 208, 144);
		case 8:
			return new Color(null, 255, 198, 147);
		case 9:
			return new Color(null, 255, 189, 150);
		case 10:
			return new Color(null, 255, 179, 154);
		case 11:
			return new Color(null, 255, 160, 160);
		case 12:
			return new Color(null, 255, 160, 160);
		default:
			break;
		}
		if (i > 12) {
			return new Color(null, 255, 160, 160);
		}
		
		return null;
	}

	int getMaxInteraction(IResource res, boolean isDefaultPackage) {
		try {
			if (res instanceof IFolder) {
				int maxInteraction = Integer.MIN_VALUE;
				for (IResource child : ((IFolder) res).members()) {
					if (!isDefaultPackage  || child instanceof IFile) {
						int i = getMaxInteraction(child, isDefaultPackage);
						if (i > maxInteraction) {
							maxInteraction = i;
						}
					}
				}
				return maxInteraction;
			}
			boolean readCoverage = coverage == null;
			IFile coveragIFile = res.getProject().getFile("coverage.xml");
			if (stamp != coveragIFile.getLocalTimeStamp()) {
				stamp = coveragIFile.getLocalTimeStamp();
				readCoverage = true;
			}
			if (readCoverage) {
				File coveragFile = coveragIFile.getRawLocation().makeAbsolute().toFile();
				coverage = new XMLReader().readFromFile(coveragFile);
			}
			Collection<Interaction> coveredLines = coverage.getCoverage(res.getName());
			if (coveredLines.isEmpty()) {
				return Integer.MIN_VALUE;
			}
			
			int maxInteraction = Integer.MIN_VALUE;
			for (Interaction interaction : coveredLines) {
				int i = interaction.getInteraction();
				if (i > maxInteraction) {
					maxInteraction = i;
				}
			}
			return maxInteraction;
		} catch (ParserConfigurationException | TransformerException | IOException | SAXException | UnsupportedCoverageException | CoreException e) {
			e.printStackTrace();
		}
		return Integer.MIN_VALUE;
	}

}
