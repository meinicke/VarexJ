//
// Copyright (C) 2006 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
// (NASA).  All Rights Reserved.
// 
// This software is distributed under the NASA Open Source Agreement
// (NOSA), version 1.3.  The NOSA has been approved by the Open Source
// Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
// directory tree for the complete NOSA document.
// 
// THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
// KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
// LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
// SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
// A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
// THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
// DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//
package gov.nasa.jpf.listener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * simple logging facility that listens on a socket (e.g. for log output display)
 */
public class LogConsole {
  
  static int DEF_PORT = 20000; // keep this in sync with the gov.nasa.jpf.util.LogHandler
  
  class ShutdownHook implements Runnable {
    public void run () {
      if (running) {
        // not very threadsafe, but worst thing that can happen is we close twice
        killed = true;
        System.out.println("\nLogConsole killed, shutting down");
      }
      try {
        cs.close();
        ss.close();
      } catch (Throwable t) {
        // not much we can do here anyway
      }
    }
  }
  
  
  boolean running;
  
  int port;
  boolean autoclose;
  boolean killed;
  
  ServerSocket ss;
  Socket cs;
  
  public void run () {
    running = true;
    Runtime.getRuntime().addShutdownHook(new Thread(new ShutdownHook()));
    
    if (port == 0) {
      port = DEF_PORT;
    }
    
    try {
      ss = new ServerSocket(port);
      
      try {          
        do {
          System.out.println("LogConsole listening on port: " + port);

          cs = ss.accept();
          BufferedReader in = new BufferedReader( new InputStreamReader(cs.getInputStream()));
          String msg; 
          
          System.out.println("LogConsole connected");
          System.out.println("--------------------------------------------------------------------------------");
          try {
            
            while ((msg = in.readLine()) != null) {
              System.out.println(msg);
            }
            
            System.out.println("--------------------------------------------------------------------------------");            
            System.out.println("LogConsole disconnected");
          } catch (IOException iox) {
            System.err.println(iox);
          }

          in.close();
          cs.close();
        } while (!autoclose);

        System.out.println("LogConsole closing");
        
      } catch (IOException iox) {
        if (!killed) {
          System.err.println("Error: LogConsole accept failed on port: " + port);
        }
      }
      
    } catch (IOException iox) {
      System.err.println("Error: LogConsole cannot listen on port: " + port);
    }
    
    running = false;
  }

  public void showUsage () {
    System.out.println("LogConsole: socket based console logger");
    System.out.println("     usage: java gov.nasa.jpf.tools.LogConsole {flags} [<port>]");
    System.out.println("      args: -help         show this message");
    System.out.println("            -autoclose    close the application upon disconnect");
    System.out.println("            <port>        optional port number, default: " + DEF_PORT);
  }
  
  boolean processArgs (String[] args) {
    for (int i=0; i<args.length; i++) {
      if (args[i].charAt(0) == '-') {
        if (args[i].equals("-autoclose")) {
          args[i] = null;
          autoclose = true;
        } else if (args[i].equals("-help")) {
          showUsage();
          return false;
        } else {
          System.err.println("Warning: unknown argument (see -help for usage): " + args[i]);
        }
      } else {
        if (args[i].matches("[0-9]+")) {
          if (port != 0) {
            System.err.println("Error: only one port parameter allowed (see -help for usage): " + args[i]);
            return false;
          }
          
          try {
            port = Integer.parseInt(args[i]);
          } catch (NumberFormatException nfx) {
            System.err.println("Error: illegal port spec: " + args[i]);
            return false;
          }
        } else {
          System.out.println("Error: unknown argument: " + args[i]);
          return false;
        }
      }
    }
    
    return true;
  }

  public static void main (String[] args) {
    LogConsole console = new LogConsole();
    
    if (console.processArgs(args)) {
      console.run();
    }
  }
}
