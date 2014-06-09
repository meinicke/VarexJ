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
package gov.nasa.jpf.util;

import gov.nasa.jpf.Config;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * log handler class that deals with output selection and formatting. This is the
 * only handler we use for our own logging. We do our own little formatting
 * on the fly
 */
public class LogHandler extends Handler {

  static class DefaultFormatter extends Formatter {
    boolean format;
    boolean showName;
    boolean showLevel;
    //..and potentially more
    
    DefaultFormatter (Config conf) {
      showName = conf.getBoolean("log.show_name", false);
      showLevel = conf.getBoolean("log.show_level", true);
      format = showName || showLevel;
    }

    DefaultFormatter (boolean showName, boolean showLevel){
      this.showName = showName;
      this.showLevel = showLevel;
      format = showName || showLevel;
    }

    // we might want to parameterize this
    public String format (LogRecord r) {
      if (format) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if (showLevel) {          
          sb.append(r.getLevel().getName());
        }
        if (showName) {
          if (showLevel) {
            sb.append(":");
          }
          sb.append(r.getLoggerName());
        }
        sb.append("] ");
        
        String msg = r.getMessage();
        Object[] params = r.getParameters();
        
        if (params == null){
          sb.append(msg);
        } else {
          sb.append(String.format(msg,params));
        }
        
        return sb.toString();
        
      } else { // raw
        return r.getMessage();
      }
    }
  }
  
  public static String LOG_HOST = "localhost";
  public static int LOG_PORT = 20000;
  
  File file;
  Socket socket;
  OutputStream ostream;
  
  PrintWriter out;
  
  public LogHandler (Config conf) {
    LOG_HOST = conf.getString("log.host", LOG_HOST);
    LOG_PORT = conf.getInt("log.port", LOG_PORT);
    
    String output = conf.getString("log.output", "out");
    
    if (output.matches("[a-zA-Z0-9.]*:[0-9]*")) { // we assume that's a hostname:port spec
      int idx = output.indexOf(':');
      String host = output.substring(0, idx);
      String port = output.substring(idx+1, output.length());
      ostream = connectSocket( host, port);
    } else if (output.equalsIgnoreCase("socket")){
      ostream = connectSocket( LOG_HOST, Integer.toString(LOG_PORT));
    } else if (output.equalsIgnoreCase("out") || output.equals("System.out")) {
      ostream = System.out;
    } else if (output.equalsIgnoreCase("err") || output.equals("System.err")) {
      ostream = System.err;
    } else {
      ostream = openFile(output);
    }
    
    if (ostream == null) {
      ostream = System.out;
    }
    
    setFormatter(new DefaultFormatter(conf));
    setOutput(ostream);
  }

  protected LogHandler() {
    // for derived classes
  }

  OutputStream connectSocket (String host, String portSpec) {
    int port = -1;
    
    if ((host == null) || (host.length() == 0)) {
      host = LOG_HOST;
    }
    
    if (portSpec != null) {
      try {
        port = Integer.parseInt(portSpec);
      } catch (NumberFormatException x) {
        // just catch it
      }
    }
    if (port == -1) {
      port = LOG_PORT;
    }
    
    
    try {
      socket = new Socket(host, port);
      return socket.getOutputStream();
    } catch (UnknownHostException uhx) {
      //System.err.println("unknown log host: " + host);
    } catch (ConnectException cex) {
      //System.err.println("no log host detected);
    } catch (IOException iox) {
      //System.err.println(iox);
    }

    return null;
  }
  
  OutputStream openFile (String fileName) {
    file = new File(fileName);
    
    try {
      if (file.exists()) {
        file.delete();
      }
      file.createNewFile();
      return new FileOutputStream(file);
    } catch (IOException iox) {
      // just catch it
    }
    
    return null;
  }
  
  public void setOutput (OutputStream ostream) {
    out = new PrintWriter(ostream, true);
  }
  
  public void close () throws SecurityException {
    if ((ostream != System.err) && (ostream != System.out)) {
      out.close();
    }
    
    if (socket != null) {
      try {
        socket.close();
      } catch (IOException iox) {
        // not much we can do
      }
    }
  }

  public void flush () {
    out.flush();
  }

  public void publish (LogRecord r) {
    String msg = getFormatter().format(r);
    out.println(msg);
  }

  public void printStatus (Logger log) {   
    if (socket != null) {
      log.config("logging to socket: " + socket);
    } else if (file != null) {
      log.config("logging to file: " + file.getAbsolutePath());
    } else if (ostream == System.err) {
      log.config("logging to System.err");
    } else if (ostream == System.out) {
      log.config("logging to System.out");
    } else {
      log.warning("unknown log destination");
    }
  }


  // a dfault handler that doesn't need Config
  public static class DefaultConsoleHandler extends LogHandler {
    public DefaultConsoleHandler() {
      ostream = System.out;

      setFormatter(new DefaultFormatter(false,true));
      setOutput(ostream);
    }
  }
}
