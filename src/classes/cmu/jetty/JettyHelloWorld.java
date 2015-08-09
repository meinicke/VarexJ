package cmu.jetty;

/**
 * Customize a server and run it on top of VarexJ
 * @author: chupanw
 */

import gov.nasa.jpf.annotation.Conditional;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.bio.SocketConnector;
import org.eclipse.jetty.server.handler.*;
import org.eclipse.jetty.util.RolloverFileOutputStream;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.eclipse.jetty.webapp.WebAppContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.util.TimeZone;

public class JettyHelloWorld extends AbstractHandler {

    // List of config options
//    @Conditional //Not working, FIXME: see ChoiceGeneratorBase:testSetContext()
    public static boolean sendServerVersion = false;
//    @Conditional //Not working, unknown reasons (conditional I/O?)
    public static boolean sendDataHeader = false;
//    @Conditional //Not working, FIXME: FileOutputStream class def not compatible with JVM
    public static boolean Logging = false;
    @Conditional
    public static boolean Deploy = true;
    @Conditional
    public static boolean Contexts = true;

    public static void configureServer(Server server) {
        // ========== jetty-server ==========
        if (sendServerVersion) {
            server.setSendServerVersion(true);
        }
        else{
            server.setSendServerVersion(false);
        }
        if (sendDataHeader) {
            server.setSendDateHeader(true);
        }
        else{
            server.setSendDateHeader(false);
        }

        // ========== jetty-logging ==========
        if (Logging) {
            try {
                setLogging();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void handle(String target,
                       Request baseRequest,
                       HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException, ServletException
    {
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println("<h1>Surprise! I'm working!</h1>");
    }

    public static void main(String[] args) throws Exception
    {
        Server server = new Server(8080);
        // ThreadPool
        QueuedThreadPool threadPool = new QueuedThreadPool();
        threadPool.setMinThreads(1);
        threadPool.setMaxThreads(3);
        threadPool.setDetailedDump(false);
        server.setThreadPool(threadPool);

        // Connector
        Connector connector = new SocketConnector();
        connector.setPort(8080);
        server.setConnectors(new Connector[]{connector});

        // Handlers
        // context handler
        ContextHandler context = new ContextHandler();
        context.setContextPath("/hello");
        context.setResourceBase("jetty-resources/contexts");
        context.setClassLoader(Thread.currentThread().getContextClassLoader());
        // web app handler
        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        webapp.setWar("jetty-resources/webapps/test.war");

        HandlerCollection handlers = new HandlerCollection();
        Handler[] handlerArray = {
//                context,
//                webapp
                new JettyHelloWorld()
        };
        handlers.setHandlers(handlerArray);
        server.setHandler(handlers);

        // Additional configuration
        configureServer(server);

        // Start the server
        server.start();
        server.join();
    }

    private static void setLogging() throws IOException {
        RolloverFileOutputStream outputStream = new RolloverFileOutputStream("./jetty-resources/logs/stderrout.log", false, 90, TimeZone.getTimeZone("GMT"));
        String serverLogName = outputStream.getDatedFilename();
        PrintStream serverLog = new PrintStream(outputStream);
        org.eclipse.jetty.util.log.Log.info("Redirecting stderr/stdout to " + serverLogName);
        System.setErr(serverLog);
        System.setOut(serverLog);
    }
}
