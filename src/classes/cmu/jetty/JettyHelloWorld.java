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

    //========== Server ==========
//    @Conditional // Not working, conditional I/O
    public static boolean sendServerVersion = false;
//    @Conditional // Not working, unknown reasons (conditional I/O?)
    public static boolean sendDataHeader = false;
//    @Conditional // Not working, FIXME: FileOutputStream class def not compatible with JVM
    public static boolean Logging = false;
//    @Conditional
    public static boolean setDumpAfterStart = false;
//    @Conditional // Not triggered because I modified jetty to skip the stopping process
    public static boolean setDumpBeforeStop = false;
//    @Conditional // Not working
    public static boolean setUncheckedPrintWriter = false;
//    @Conditional // Working
    public static boolean setStopAtShutdown = false;
    //========== end ==========

    //========== WebAppContext ==========
//    @Conditional
    public static boolean setAllowDuplicateFragmentNames = false;
//    @Conditional
    public static boolean setConfigurationDiscovered = true;
//    @Conditional
    public static boolean setCopywebDir = false;
//    @Conditional // Not working, conditional I/O
    public static boolean setCopyWebInfo = false;
//    @Conditional
    public static boolean setDistributuble = false;
//    @Conditional // Not working, conditional I/O
    public static boolean setExtractWAR = true;
//    @Conditional
    public static boolean setLogUrlOnStart = false;
//    @Conditional // Not working
    public static boolean setParentLoaderPriority = false;
//    @Conditional
    public static boolean setThrowUnavailableOnStartupException = false;
    //========== end ==========

    static void configureServer(Server server) {
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
        if (setDumpAfterStart) {
            server.setDumpAfterStart(true);
        }
        else {
            server.setDumpAfterStart(false);
        }
        if (setDumpBeforeStop) {
            server.setDumpBeforeStop(true);
        }
        else{
            server.setDumpBeforeStop(false);
        }
        if (setUncheckedPrintWriter) {
            server.setUncheckedPrintWriter(true);
        }
        else {
            server.setUncheckedPrintWriter(false);
        }
        if (setStopAtShutdown) {
            server.setStopAtShutdown(true);
        }
        else{
            server.setStopAtShutdown(false);
        }
    }

    static void configureLogging() {
        if (Logging) {
            try {
                setLogging();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void setLogging() throws IOException {
        RolloverFileOutputStream outputStream = new RolloverFileOutputStream("./jetty-resources/logs/stderrout.log", false, 90, TimeZone.getTimeZone("GMT"));
        String serverLogName = outputStream.getDatedFilename();
        PrintStream serverLog = new PrintStream(outputStream);
        org.eclipse.jetty.util.log.Log.info("Redirecting stderr/stdout to " + serverLogName);
        System.setErr(serverLog);
        System.setOut(serverLog);
    }

    static void configureWebAppContext(WebAppContext webAppContext) {
        if (setAllowDuplicateFragmentNames) {
            webAppContext.setAllowDuplicateFragmentNames(true);
        }
        else {
            webAppContext.setAllowDuplicateFragmentNames(false);
        }
        if (setConfigurationDiscovered) {
            webAppContext.setConfigurationDiscovered(true);
        }
        else {
            webAppContext.setConfigurationDiscovered(false);
        }
        if (setCopywebDir) {
            webAppContext.setCopyWebDir(true);
        }
        else {
            webAppContext.setCopyWebDir(false);
        }
        if (setCopyWebInfo) {
            webAppContext.setCopyWebInf(true);
        }
        else{
            webAppContext.setCopyWebInf(false);
        }
        if (setDistributuble) {
            webAppContext.setDistributable(true);
        }
        else {
            webAppContext.setDistributable(false);
        }
        if (setExtractWAR) {
            webAppContext.setExtractWAR(true);
        }
        else{
            webAppContext.setExtractWAR(false);
        }
        if (setLogUrlOnStart) {
            webAppContext.setLogUrlOnStart(true);
        }
        else {
            webAppContext.setLogUrlOnStart(false);
        }
        if (setParentLoaderPriority) {
            webAppContext.setParentLoaderPriority(true);
        }
        else {
            webAppContext.setParentLoaderPriority(false);
        }
        if (setThrowUnavailableOnStartupException) {
            webAppContext.setThrowUnavailableOnStartupException(true);
        }
        else{
            webAppContext.setThrowUnavailableOnStartupException(false);
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

        // Web app handler
        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        webapp.setWar("jetty-resources/webapps/test.war");

        HandlerCollection handlers = new HandlerCollection();
        Handler[] handlerArray = {
                webapp,
//                new JettyHelloWorld()
        };
        handlers.setHandlers(handlerArray);
        server.setHandler(handlers);

        // Additional configuration
//        configureServer(server);
//        configureLogging();
//        configureWebAppContext(webapp);

        // Start the server
        server.start();
        server.join();
    }


}
