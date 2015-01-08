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

package nhandler.conversion;

/**
 * A ConversionException is thrown when an incorrect input parameters are sent
 * to a methods of Converter, JPF2JVM, and JVM2JPF classes.
 * 
 * @author Nastaran Shafiei
 * @author Franck van Breugel
 */
@SuppressWarnings("serial")
public class ConversionException extends Exception {
  /**
   * Constructs a ConversionException without a detail message.
   */
  public ConversionException () {
    super();
  }

  /**
   * Constructs an ConversionException with a detail message.
   * 
   * @param s
   *          the detail message.
   */
  public ConversionException (String s) {
    super(s);
  }
}