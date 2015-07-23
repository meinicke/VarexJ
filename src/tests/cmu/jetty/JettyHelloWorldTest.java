package cmu.jetty;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

/**
 * @author: chupanw
 */
public class JettyHelloWorldTest extends TestJPF{
    private final String[] config = {"+nhandler.delegateUnhandledNative", "+search.class=.search.RandomSearch", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/jetty-all-7.6.18-SNAPSHOT.jar,lib/servlet-api-2.5.jar"};
    @Test(timeout = 6000000)
    // setup the server for 1 min
    public void testHelloWorldServer() throws Exception {
        if (verifyNoPropertyViolation(config)) {
            JettyHelloWorld.main(new String[3]);
        }
    }
}
