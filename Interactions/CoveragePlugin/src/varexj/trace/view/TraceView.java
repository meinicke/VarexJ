package varexj.trace.view;

import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseWheelListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import cmu.vatrace.IFBranch;
import cmu.vatrace.Statement;
import cmu.vatrace.Trace;
import cmu.vatrace.filters.ExceptionFilter;
import cmu.vatrace.filters.InteractionFilter;
import cmu.vatrace.filters.Or;
import cmu.vatrace.filters.StatementFilter;
import coverplugin.Activator;
import gov.nasa.jpf.JPF;
import varexj.trace.view.editparts.TraceEditPartFactory;

public class TraceView extends ViewPart {

	private ScrollingGraphicalViewer viewer;
	private ScalableFreeformRootEditPart rootEditPart;

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
		// viewer.getControl().setBackground(DIAGRAM_BACKGROUND);
		viewer.setEditDomain(new EditDomain());
		viewer.setEditPartFactory(new TraceEditPartFactory());

		rootEditPart = new ScalableFreeformRootEditPart();
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

		viewer.getControl().addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseScrolled(final MouseEvent ev) {
				if ((ev.stateMask & SWT.CTRL) == 0) {
					return;
				}
				if (ev.count > 0) {
					((ScalableFreeformRootEditPart) viewer.getRootEditPart()).getZoomManager().zoomIn();
				} else if (ev.count < 0) {
					((ScalableFreeformRootEditPart) viewer.getRootEditPart()).getZoomManager().zoomOut();
				}
			}
		});
	}

	@Override
	public void setFocus() {

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
				viewer.getEditPartRegistry().clear();
				viewer.setRootEditPart(rootEditPart);
				viewer.setContents(model);
				viewer.getContents().refresh();
				lm.layout(viewer.getContents());
			}
		});
	}

	private static Trace trace = null;

	public static final String PROJECT_NAME = "MathBug";
	public static final String PROJECT_Sources = "MathSources";
	public static final String PROJECT_Sources_Folder = "Bug6/src/main/java";
	public static final String PROJECT_Sources_Test_Folder = "Bug6/src/test/java";
	
	public static Trace createTrace() {
		if (trace == null) {
//			final String path = "C:/Users/Jens Meinicke/workspaceVarexJ/Elevator/";
			final String path = "C:/Users/Jens Meinicke/workspaceVarexJ/" + PROJECT_NAME;
//			final String path = "C:/Users/Jens Meinicke/git/VarexJ/" + PROJECT_NAME;
			final String[] args = { 
					"+classpath=" + path + "/bin,${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/math6.jar,${jpf-core}/lib/bcel-5.2.jar",
					"+nhandler.delegateUnhandledNative",
					"+search.class=.search.RandomSearch",
					"+invocation",
//					"Main"
//					"linux.Linux2"
//					"SmoothingPolynomialBicubicSplineInterpolatorTest"
					"SimplexOptimizerNelderMeadTestStarter"
					};
			Trace.filter = new Or(
//					new NameFilter("interpolatedDerivatives" , "previousState"),
//					new ReferenceFilter(888),
//					new NameFilter("tMin", "tb"),
					new InteractionFilter(2),
					new ExceptionFilter(), 
					new StatementFilter() {
				
				@Override
				public boolean filter(Statement s) {
					return s instanceof IFBranch;
				}
			});
			
			JPF.main(args);
			
			// highlight path
//			SingleFeatureExpr change8 = Conditional.features.get("change8");
//			SingleFeatureExpr change9 = Conditional.features.get("change9");
//			FeatureExpr ctx = change8.not().and(change9.not());
//			JPF.vatrace.highlightContext(ctx, NodeColor.limegreen, 3);
			
			return JPF.vatrace;
		}
		return trace;
	}

}