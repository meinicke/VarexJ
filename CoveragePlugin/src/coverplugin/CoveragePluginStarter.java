package coverplugin;
import org.eclipse.ui.IStartup;

import coverplugin.LOGGER.COLOR;

/**
 * 
 * @author Jens Meinicke
 *
 */
public class CoveragePluginStarter implements IStartup {
	
	@Override
	public void earlyStartup() {
		LOGGER.log(COLOR.MAGENTA, "Start coverage plugin");
	}

}
