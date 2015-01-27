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
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class Server {
    public static void main(String[] arguments) {
        try {
            final int PORT = 1024;

            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Waiting for a client ...");
            Socket socket = serverSocket.accept();
            System.out.println("Client has arrived ...");
            OutputStream socketOutput = socket.getOutputStream();
            InputStream socketInput = socket.getInputStream();

            int number = socketInput.read();
            System.out.println("Client's number has been received ...");
            socketOutput.write(number);
            System.out.println("Client's result has been sent ...");

            socket.close();
        }
        catch (IOException e) {
            System.out.println("I/O error occured when opening the socket");
        }
    }
}