package varexj.trace.view;

import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import cmu.vatrace.Trace;
import coverplugin.Activator;
import gov.nasa.jpf.JPF;
import varexj.trace.view.editparts.TraceEditPartFactory;

public class TraceView extends ViewPart {

	private ScrollingGraphicalViewer viewer;

	@Override
	public void createPartControl(Composite parent) {
		IWorkbenchWindow editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IEditorPart part = null;

		if (editor != null) {
			IWorkbenchPage page = editor.getActivePage();
			if (page != null) {
				part = page.getActiveEditor();
			}
		}


		
		viewer = new ScrollingGraphicalViewer();
		viewer.createControl(parent);
//		viewer.getControl().setBackground(DIAGRAM_BACKGROUND);
		viewer.setEditDomain(new EditDomain());
		viewer.setEditPartFactory(new TraceEditPartFactory());
		
		ScalableFreeformRootEditPart rootEditPart = new ScalableFreeformRootEditPart();
		((ConnectionLayer) rootEditPart.getLayer(LayerConstants.CONNECTION_LAYER)).setAntialias(SWT.ON);

		viewer.setRootEditPart(rootEditPart);
		refresh();
		
		refreshButton = new Action() {
			public void run() {
				refresh();
			}
		};
		
		IActionBars bars = getViewSite().getActionBars();
		IToolBarManager toolbarManager = bars.getToolBarManager();
		toolbarManager.add(refreshButton);
		refreshButton.setImageDescriptor(Activator.REFESH_TAB_IMAGE_DESCRIPTOR);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
	
	LayoutManager lm = new LayoutManager();
	private Action refreshButton;
	
	public void refresh() {
		final Trace model = createTrace();
		if (model.getMain() == null) {
			return;
		}
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				viewer.setContents(model);
				viewer.getContents().refresh();
				lm.layout(viewer.getContents());
			}
		});
	}

	private static Trace trace = null;
	
	public static Trace createTrace() {
		if (trace == null) {
			final String path = "C:/Users/Jens Meinicke/git/VarexJ/SmallInteractionExamples";
			final String[] args = {
					"+classpath=" + path + "/bin",
					"+search.class=.search.RandomSearch",
					"linux.Example"
			};
			JPF.main(args);
			return JPF.vatrace;
		}
		return trace;
	}
	
}