package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Ignore;
import org.junit.Test;

import cmu.jetty.JettyHelloWorld;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: chupanw
 */
@SuppressWarnings("resource")
public class JettyHelloWorldTest extends TestJPF{
    private final String[] config = {"+vm.por.sync_detection=false", "+nhandler.delegateUnhandledNative", "+interaction=context", "+search.class=.search.RandomSearch", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/jetty-all-7.6.18-SNAPSHOT.jar,lib/servlet-api-2.5.jar,jetty-resources/classes"};
    @Test(timeout = 6000000)
	@Ignore
    public void testHelloWorldServer() throws Exception {
        if (verifyNoPropertyViolation(config)) {
            JettyHelloWorld.main(new String[]{});
        }
    }

	@SuppressWarnings("unused")
	@Test
	@Ignore
    public void testServer() throws Exception {
        if (verifyNoPropertyViolation(config)) {
            final int PORT = 8080;

            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Waiting for a client");
            Socket socket = serverSocket.accept();
            System.out.println("Client arrived");
            OutputStream socketOutput = socket.getOutputStream();
            InputStream socketInput = socket.getInputStream();

            int number = socketInput.read();
            System.out.println(number);
            socket.close();
        }
    }
}
