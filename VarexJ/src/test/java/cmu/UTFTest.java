package cmu;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class UTFTest extends TestJPF {

	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";

	@Test
	public void toUpperCase() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			String s = "Aasdfghj";
			s.toUpperCase();
			for (Locale l : Locale.getAvailableLocales()) {
				System.out.println(l);
				System.out.println(s.toUpperCase(l));
			}
		}
	}

	@Test
	public void testUTF8() throws Exception {
		if (!isJPFRun()) {
			// TODO should be done by the build script
			// copy the "messages.properties" file in the build folder @ classes 
			final File messeges = new File("src" + File.separator + "test" + File.separator + 
					"resources" + File.separator + "cmu" + File.separator + "messages.properties");
			System.out.println("TEST FILE EXISTS");
			System.out.println(messeges.getPath() + " " + messeges.exists());
			final File target = new File("build" + File.separator + "classes" + File.separator + 
					"test" + File.separator + "cmu" + File.separator + "messages.properties");
			Files.copy(messeges.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
		}
		if (false || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			ClassLoader classLoader = this.getClass().getClassLoader();
			ResourceBundle bundle1 = ResourceBundle.getBundle("cmu.messages");
			System.out.println(bundle1);
			ResourceBundle bundle2 = ResourceBundle.getBundle("cmu.messages", Locale.ENGLISH);
			System.out.println(bundle2);
			ResourceBundle bundle3 = ResourceBundle.getBundle("cmu.messages", Locale.ENGLISH, classLoader, new UTF8Control());
			System.out.println(bundle3);
		}
		if (!isJPFRun()) {
			// remove the "messages.properties" file
			final File target = new File("build" + File.separator + "classes" + File.separator + 
					"test" + File.separator + "cmu" + File.separator + "messages.properties");
			Files.deleteIfExists(target.toPath());
			
		}
	}

	private static class UTF8Control extends Control {
		@Override
		public ResourceBundle newBundle(String aBaseName, Locale aLocale, String aFormat, ClassLoader aLoader, boolean aReload) throws IllegalAccessException, InstantiationException, IOException {
			// The below is a copy of the default implementation.
			final String bundleName = toBundleName(aBaseName, aLocale);
			final String resourceName = toResourceName(bundleName, "properties");
			ResourceBundle bundle = null;
			InputStream stream = null;
			if (aReload) {
				final URL url = aLoader.getResource(resourceName);
				if (url != null) {
					final URLConnection connection = url.openConnection();
					if (connection != null) {
						connection.setUseCaches(false);
						stream = connection.getInputStream();
					}
				}
			} else {
				stream = aLoader.getResourceAsStream(resourceName);
			}
			if (stream != null) {
				try (Reader streamReader = new InputStreamReader(stream, "UTF-8")) {
					// Only this line is changed to make it to read properties
					// files as UTF-8.
					bundle = new PropertyResourceBundle(streamReader);
				} finally {
					stream.close();
				}
			}
			return bundle;
		}
	}

}
