package cmu.jetty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author: chupanw
 */
public class SimpleClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        URL localhost = new URL("http://localhost:8080");
        boolean connected = false;
        BufferedReader in;
        while (!connected) {
            connected = true;
            try {
                URLConnection connection = localhost.openConnection();
                in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println(line);
                }
                in.close();
            } catch (ConnectException e) {
                connected = false;
                Thread.sleep(1000);
                System.out.println("failed..");
            }
        }
    }
}
