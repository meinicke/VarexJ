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

import java.io.OutputStream;
import java.util.HashMap;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * this class is responsible for returning properly JPF-configured
 * Loggers. It is not supposed to be used directly by clients, but rather
 * is a JPF delegatee.
 * 
 * While we could modify/replace the standard java.util.logging facility
 * at various levels (own LogManager, own initialization class etc.), we choose
 * the approach to piggyback on it, because these mechanisms either require
 * changing system properties, rely on only partly documented features, or
 * don't give us the full functionality we need. By having our own log
 * encapsulator, we could also replace the underlying mechanism if we really
 * want to
 */
public class LogManager {
    
  static HashMap<String,JPFLogger> loggers = new HashMap<String, JPFLogger>(); // our own set
  
  static Level defaultLevel = Level.WARNING;
  static Handler handler;  // we have only one
  
  // I don't like these categories too much, but we want to act as a stand in
  static String[] activeSevere;
  static String[] activeWarning;
  static String[] activeInfo;
  static String[] activeConfig;
  static String[] activeFine;
  static String[] activeFiner;
  static String[] activeFinest;
  
  /**
   * note - this is not allowed to fail, since we couldn't log that. Hardcoded default
   * values have to do in this case (make sure we catch the proper Config exceptions)
   */
  public static void init (Config conf) {
    try {
      defaultLevel = Level.parse( conf.getString("log.level", "INFO").toUpperCase());
    } catch (Throwable x) {
      defaultLevel = Level.WARNING;
    }
    
    activeSevere = conf.getStringArray("log.severe");
    activeWarning = conf.getStringArray("log.warning");
    activeInfo = conf.getStringArray("log.info");
    activeConfig = conf.getStringArray("log.config");
    activeFine = conf.getStringArray("log.fine");
    activeFiner = conf.getStringArray("log.finer");
    activeFinest = conf.getStringArray("log.finest");
    
    handler = conf.getInstance("log.handler.class", Handler.class);
  }
  
  static boolean checkInclusion (String[] actives, String name) {
    if (actives == null) {
      return false;
    }
    
    for (int i=0; i<actives.length; i++) {
      if (name.matches(actives[i])) {
        return true;
      }
    }
    
    return false;
  }
  
  static Level getLevel (String name) {
    if (checkInclusion(activeSevere, name)) return Level.SEVERE;
    if (checkInclusion(activeWarning, name)) return Level.WARNING;
    if (checkInclusion(activeInfo, name)) return Level.INFO;
    if (checkInclusion(activeConfig, name)) return Level.CONFIG;
    if (checkInclusion(activeFine, name)) return Level.FINE;
    if (checkInclusion(activeFiner, name)) return Level.FINER;
    if (checkInclusion(activeFinest, name)) return Level.FINEST;
    
    return defaultLevel;
  }
  
  public static JPFLogger getLogger (String name) {
    if (handler == null){
      // <2do> this is only a band aid for missing LogManager.init(conf) calls
      handler = new LogHandler.DefaultConsoleHandler();
    }

    // how often can you say 'Logger' in one method..
    JPFLogger logger = loggers.get(name);
    
    if (logger == null) {
      // we haven't had this one yet - create and init a new one from the host logging system
      Logger baseLogger = Logger.getLogger(name);
      baseLogger.setLevel( getLevel(name));
      baseLogger.addHandler(handler);
      baseLogger.setUseParentHandlers(false); // we don't want to pass this up
      
      // wrap it
      logger = new JPFLogger(baseLogger);
      loggers.put(name, logger);
    }
    
    return logger;
  }
  
  public static void setOutput(OutputStream out) {
    // need to have init() called first
    if (handler instanceof LogHandler){
      ((LogHandler)handler).setOutput(out);
    }
  }
  
  public static void printStatus (Logger log) {
    if (handler instanceof LogHandler){
      ((LogHandler)handler).printStatus(log);
    }
  }
}
