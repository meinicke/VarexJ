//
// Copyright (C) 2010 United States Government as represented by the
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

import java.util.ResourceBundle;
import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * this is a decorator for java.util.logging.JPFLogger
 *
 * We use this to avoid explicit Logger.isLoggable() checks in the code.
 * The goal is to avoid time & memory overhead if logging is not enabled.
 *
 * We provide a fat interface to avoid Object[] creation for ellipsis method
 * or auto boxing for Object arguments
 *
 */
public class JPFLogger extends Logger {

  protected Logger logger;

  public JPFLogger (Logger logger) {
    super(logger.getName(), logger.getResourceBundleName());

    this.logger = logger;
  }

  public ResourceBundle getResourceBundle() {
    return logger.getResourceBundle();
  }

  public String getResourceBundleName() {
    return logger.getResourceBundleName();
  }

  public void setFilter(Filter newFilter) throws SecurityException {
    logger.setFilter(newFilter);
  }
  
  public Filter getFilter() {
    return logger.getFilter();
  }
   
  public void log(LogRecord record) {
    logger.log(record);
  }
  
  public void log(Level level, String msg) {
    logger.log(level, msg);
  }
  
  public void log(Level level, String msg, Object param1) {
    logger.log(level, msg, param1);
  }
  
  public void log(Level level, String msg, Object params[]) {
    logger.log(level, msg, params);
  }
  
  public void log(Level level, String msg, Throwable thrown) {
    logger.log(level, msg, thrown);
  }
  
  public void logp(Level level, String sourceClass, String sourceMethod, String msg) {
    logger.logp(level, sourceClass, sourceMethod, msg);
  }
  
  public void logp(Level level, String sourceClass, String sourceMethod, String msg, Object param1) {
    logger.logp(level, sourceClass, sourceMethod, msg, param1);
  }
  
  public void logp(Level level, String sourceClass, String sourceMethod, String msg, Object params[]) {
    logger.logp(level, sourceClass, sourceMethod, msg, params);
  }
  
  public void logp(Level level, String sourceClass, String sourceMethod, String msg, Throwable thrown) {
    logger.logp(level, sourceClass, sourceMethod, msg, thrown);
  }
  
  public void logrb(Level level, String sourceClass, String sourceMethod, String bundleName, String msg) {
    logger.logrb(level, sourceClass, sourceMethod, bundleName, msg);
  }
  
  public void logrb(Level level, String sourceClass, String sourceMethod, String bundleName, String msg, Object param1) {
    logger.logrb(level, sourceClass, sourceMethod, bundleName, msg, param1);
  }
  
  public void logrb(Level level, String sourceClass, String sourceMethod, String bundleName, String msg, Object params[]) {
    logger.logrb(level, sourceClass, sourceMethod, bundleName, msg, params);
  }
  
  public void logrb(Level level, String sourceClass, String sourceMethod, String bundleName, String msg, Throwable thrown) {
    logger.logrb(level, sourceClass, sourceMethod, bundleName, msg, thrown);
  }
  
  public void entering(String sourceClass, String sourceMethod) {
    logger.entering(sourceClass, sourceMethod);
  }

  public void entering(String sourceClass, String sourceMethod, Object param1) {
    logger.entering(sourceClass, sourceMethod, param1);
  }
  
  public void entering(String sourceClass, String sourceMethod, Object params[]) {
    logger.entering(sourceClass, sourceMethod, params);
  }
  
  public void exiting(String sourceClass, String sourceMethod) {
    logger.exiting(sourceClass, sourceMethod);
  }
  
  public void exiting(String sourceClass, String sourceMethod, Object result) {
    logger.exiting(sourceClass, sourceMethod, result);
  }
  
  public void throwing(String sourceClass, String sourceMethod, Throwable thrown) {
    logger.throwing(sourceClass, sourceMethod, thrown);
  }
  
  public void severe(String msg) {
    logger.severe(msg);
  }
  
  public void warning(String msg) {
    logger.warning(msg);
  }
  
  public void info(String msg) {
    logger.info(msg);
  }
  
  public void config(String msg) {
    logger.config(msg);
  }
  
  public void fine(String msg) {
    logger.fine(msg);
  }
  
  public void finer(String msg) {
    logger.finer(msg);
  }
  
  public void finest(String msg) {
    logger.finest(msg);
  }
  
  public void setLevel(Level newLevel) throws SecurityException {
    logger.setLevel(newLevel);
  }
  
  public Level getLevel() {
    return logger.getLevel();
  }
  
  public boolean isLoggable(Level level) {
    return logger.isLoggable(level);
  }
  
  public String getName() {
    return logger.getName();
  }
  
  public void addHandler(Handler handler) throws SecurityException {
    logger.addHandler(handler);
  }
  
  public void removeHandler(Handler handler) throws SecurityException {
    logger.removeHandler(handler);
  }
  
  public Handler[] getHandlers() {
    return logger.getHandlers();
  }
  
  public void setUseParentHandlers(boolean useParentHandlers) {
    logger.setUseParentHandlers(useParentHandlers);
  }
  
  public boolean getUseParentHandlers() {
    return logger.getUseParentHandlers();
  }
  
  public Logger getParent() {
    return logger.getParent();
  }
  
  public void setParent(Logger parent) {
    logger.setParent(parent);
  }
  
  private void log (Level level, Object... args) {
    StringBuilder sb = new StringBuilder(256);
    int length = args.length;
    for (int i = 0; i < length; i++) {
      sb.append(args[i]);
    }
    logger.log(level, sb.toString());
  }

  //--- the SEVERE
  public void severe (Object s1, Object s2) {
    if (isLoggable(Level.SEVERE)) {
      logger.log(Level.SEVERE, s1.toString() + s2.toString());
    }
  }
  // this is here to avoid auto boxing
  public void severe (Object s1, int s2){
    if (isLoggable(Level.SEVERE)) {
         logger.log(Level.SEVERE, s1.toString() + s2);
    }
  }
  public void severe (Object s1, Object s2, Object s3){
    if (isLoggable(Level.SEVERE)) {
      logger.log(Level.SEVERE, s1.toString() + s2.toString() + s3.toString());
    }
  }
  public void severe (Object s1, Object s2, Object s3, Object s4){
    if (isLoggable(Level.SEVERE)) {
      logger.log(Level.SEVERE, s1.toString() + s2.toString() + s3.toString() + s4.toString());
    }
  }
  public void severe (Object s1, int s2, Object s3, int s4){
    if (isLoggable(Level.SEVERE)) {
      logger.log(Level.SEVERE, s1.toString() + s2 + s3.toString() + s4);
    }
  }
  public void severe (Object... args){
    if (isLoggable(Level.SEVERE)) {
      log(Level.SEVERE, args);
    }
  }
  // note this still wraps args into a String array - overhead
  public void fsevere (String format, Object... args){
    if (isLoggable(Level.SEVERE)) {
      logger.log(Level.SEVERE, String.format(format, args));
    }
  }

  //--- the WARNING
  public void warning (Object s1, Object s2) {
    if (isLoggable(Level.WARNING)) {
      logger.log(Level.WARNING, s1.toString() + s2.toString());
    }
  }
  // this is here to avoid auto boxing
  public void warning (Object s1, int s2){
    if (isLoggable(Level.WARNING)) {
         logger.log(Level.WARNING, s1.toString() + s2);
    }
  }
  public void warning (Object s1, Object s2, Object s3){
    if (isLoggable(Level.WARNING)) {
      logger.log(Level.WARNING, s1.toString() + s2.toString() + s3.toString());
    }
  }
  public void warning (Object s1, Object s2, Object s3, Object s4){
    if (isLoggable(Level.WARNING)) {
      logger.log(Level.WARNING, s1.toString() + s2.toString() + s3.toString() + s4.toString());
    }
  }
  public void warning (Object s1, int s2, Object s3, int s4){
    if (isLoggable(Level.WARNING)) {
      logger.log(Level.WARNING, s1.toString() + s2 + s3.toString() + s4);
    }
  }
  public void warning (Object... args){
    if (isLoggable(Level.WARNING)) {
      log(Level.WARNING, args);
    }
  }
  // note this still wraps args into a String array - overhead
  public void fwarning (String format, Object... args){
    if (isLoggable(Level.WARNING)) {
      logger.log(Level.WARNING, String.format(format, args));
    }
  }

  //--- the INFO
  public void info (Object s1, Object s2){
    if (isLoggable(Level.INFO)) {
      logger.log(Level.INFO, s1.toString() + s2.toString());
    }
  }
  public void info (Object s1, int s2){
    if (isLoggable(Level.INFO)) {
      logger.log(Level.INFO, s1.toString() + s2);
    }
  }
  public void info (Object s1, Object s2, Object s3){
    if (isLoggable(Level.INFO)) {
      logger.log(Level.INFO, s1.toString() + s2.toString() + s3.toString());
    }
  }
  public void info (Object s1, Object s2, Object s3, Object s4){
    if (isLoggable(Level.INFO)) {
      logger.log(Level.INFO, s1.toString() + s2.toString() + s3.toString() + s4.toString());
    }
  }
  public void info (Object s1, int s2, Object s3, int s4){
    if (isLoggable(Level.INFO)) {
      logger.log(Level.INFO, s1.toString() + s2 + s3.toString() + s4);
    }
  }
  public void info (Object... args){
    if (isLoggable(Level.INFO)) {
      log(Level.INFO, args);
    }
  }
  // note this still wraps args into a String array - overhead
  public void finfo (String format, Object... args){
    if (isLoggable(Level.INFO)) {
      logger.log(Level.INFO, String.format(format, args));
    }
  }

  //--- the CONFIG
  public void config (Object s1, Object s2){
    if (isLoggable(Level.CONFIG)) {
      logger.log(Level.CONFIG, s1.toString() + s2.toString());
    }
  }
  public void config (Object s1, int s2){
    if (isLoggable(Level.CONFIG)) {
      logger.log(Level.CONFIG, s1.toString() + s2);
    }
  }
  public void config (Object s1, Object s2, Object s3){
    if (isLoggable(Level.CONFIG)) {
      logger.log(Level.CONFIG, s1.toString() + s2.toString() + s3.toString());
    }
  }
  public void config (Object s1, Object s2, Object s3, Object s4){
    if (isLoggable(Level.CONFIG)) {
      logger.log(Level.CONFIG, s1.toString() + s2.toString() + s3.toString() + s4.toString());
    }
  }
  public void config (Object s1, int s2, Object s3, int s4){
    if (isLoggable(Level.CONFIG)) {
      logger.log(Level.CONFIG, s1.toString() + s2 + s3.toString() + s4);
    }
  }
  public void config (Object... args){
    if (isLoggable(Level.CONFIG)) {
      log(Level.CONFIG, args);
    }
  }
  // note this still wraps args into a String array - overhead
  public void fconfig (String format, String... args){
    if (isLoggable(Level.CONFIG)) {
      logger.log(Level.CONFIG, String.format(format, (Object)args));
    }
  }

  //--- the FINE
  public void fine (Object s1, Object s2){
    if (isLoggable(Level.FINE)) {
      logger.log(Level.FINE, s1.toString() + s2.toString());
    }
  }
  public void fine (Object s1, int s2){
    if (isLoggable(Level.FINE)) {
      logger.log(Level.FINE, s1.toString() + s2);
    }
  }
  public void fine (Object s1, Object s2, Object s3){
    if (isLoggable(Level.FINE)) {
      logger.log(Level.FINE, s1.toString() + s2.toString() + s3.toString());
    }
  }
  public void fine (Object s1, Object s2, Object s3, Object s4){
    if (isLoggable(Level.FINE)) {
      logger.log(Level.FINE, s1.toString() + s2.toString() + s3.toString() + s4.toString());
    }
  }
  public void fine (Object s1, int s2, Object s3, int s4){
    if (isLoggable(Level.FINE)) {
      logger.log(Level.FINE, s1.toString() + s2 + s3.toString() + s4);
    }
  }
  public void fine (Object... args){
    if (isLoggable(Level.FINE)) {
      log(Level.FINE, args);
    }
  }
  // note this still wraps args into a String array - overhead
  public void ffine (String format, Object... args){
    if (isLoggable(Level.FINE)) {
      logger.log(Level.FINE, String.format(format, args));
    }
  }

  //--- the FINER
  public void finer (Object s1, Object s2){
    if (isLoggable(Level.FINER)) {
      logger.log(Level.FINER, s1.toString() + s2.toString());
    }
  }
  public void finer (Object s1, int s2){
    if (isLoggable(Level.FINER)) {
      logger.log(Level.FINER, s1.toString() + s2);
    }
  }
  public void finer (Object s1, Object s2, Object s3){
    if (isLoggable(Level.FINER)) {
      logger.log(Level.FINER, s1.toString() + s2.toString() + s3.toString());
    }
  }
  public void finer (Object s1, Object s2, Object s3, Object s4){
    if (isLoggable(Level.FINER)) {
      logger.log(Level.FINER, s1.toString() + s2.toString() + s3.toString() + s4.toString());
    }
  }
  public void finer (Object s1, int s2, Object s3, int s4){
    if (isLoggable(Level.FINER)) {
      logger.log(Level.FINER, s1.toString() + s2 + s3.toString() + s4);
    }
  }
  public void finer (Object... args){
    if (isLoggable(Level.FINER)) {
      log(Level.FINER, args);
    }
  }
  // note this still wraps args into a String array - overhead
  public void ffiner (String format, Object... args){
    if (isLoggable(Level.FINER)) {
      logger.log(Level.FINER, String.format(format, args));
    }
  }

  //--- the FINEST
  public void finest (Object s1, Object s2){
    if (isLoggable(Level.FINEST)) {
      logger.log(Level.FINEST, s1.toString() + s2.toString());
    }
  }
  public void finest (Object s1, int s2){
    if (isLoggable(Level.FINEST)) {
      logger.log(Level.FINEST, s1.toString() + s2);
    }
  }
  public void finest (Object s1, Object s2, Object s3){
    if (isLoggable(Level.FINEST)) {
      logger.log(Level.FINEST, s1.toString() + s2.toString() + s3.toString());
    }
  }
  public void finest (Object s1, Object s2, Object s3, Object s4){
    if (isLoggable(Level.FINEST)) {
      logger.log(Level.FINEST, s1.toString() + s2.toString() + s3.toString() + s4.toString());
    }
  }
  public void finest (Object s1, int s2, Object s3, int s4){
    if (isLoggable(Level.FINEST)) {
      logger.log(Level.FINEST, s1.toString() + s2 + s3.toString() + s4);
    }
  }
  public void finest (Object... args){
    if (isLoggable(Level.FINEST)) {
      log(Level.FINEST, args);
    }
  }
  // note this still wraps args into a String array - overhead
  public void ffinest (String format, Object... args){
    if (isLoggable(Level.FINEST)) {
      logger.log(Level.FINEST, String.format(format, args));
    }
  }
}
