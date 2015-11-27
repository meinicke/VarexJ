package coverplugin;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import coverplugin.LOGGER.COLOR;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "coverageplugin"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private coverplugin.EditorTracker editorTracker;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		LOGGER.log(COLOR.GREEN, "--------------------\nCoverage Plugin Started\n--------------------");
		editorTracker = new EditorTracker(PlatformUI.getWorkbench());
	}

	 
	 /*
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		if (editorTracker != null) {
			editorTracker.dispose();
			editorTracker = null;
		}
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	public static void log(String message) {
		getDefault().getLog().log(new Status(IStatus.INFO, "COVERAGE", message, new Exception()));
	}

}
