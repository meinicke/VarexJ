package cmu.jetty;

/**
 * @author: chupanw
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.bio.SocketConnector;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class JettyHelloWorld extends AbstractHandler {
    public void handle(String target,
                       Request baseRequest,
                       HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException, ServletException
    {
        System.out.println("in Handler!");
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println("<h1>Surprise! I'm working!</h1>");
        System.out.println("sending out response");
    }

    public static void main(String[] args) throws Exception
    {
        Server server = new Server(8080);
        Connector connector = new SocketConnector();
        connector.setPort(8080);
        server.setConnectors(new Connector[]{connector});
        server.setHandler(new JettyHelloWorld());

        server.start();
        server.join();
    }
}
