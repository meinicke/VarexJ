/* 
 * Copyright (C) 2013  Nastaran Shafiei and Franck van Breugel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You can find a copy of the GNU General Public License at
 * <http://www.gnu.org/licenses/>.
 */

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;

public class Client {
    public static void main(String[] arguments) {
        try {
        	final String HOST = java.net.InetAddress.getLocalHost().getHostName();
            final int PORT = 1024;

            Socket socket = new Socket(HOST, PORT);
            OutputStream socketOutput = socket.getOutputStream();
            InputStream socketInput = socket.getInputStream();

            socketOutput.write(5);
            int i = socketInput.read();
            while (i != -1) {
                System.out.print(i);
                i = socketInput.read();
            }
            System.out.println();

            socket.close();
        }
        catch (UnknownHostException e) {
                System.out.println("Host is unknown");
        }
        catch (IOException e) {
            System.out.println("I/O error occured when creating the socket");
        }
    }
}