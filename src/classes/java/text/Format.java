//
// Copyright (C) 2007 United States Government as represented by the
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

package java.text;

/**
 * (incomplete) model class for java.text.Format
 * the reason we model this is that we want to cut off all the inner
 * workings by just delegating to real formatters stored in our
 * native peer
 */
public abstract class Format {
  
  // <?> how does that work with backtracking? my initial guess is that
  // we can safely overwrite an index because after backtracking, the
  // formatter will never be used. It's therefore sufficient if we keep the
  // nInstances counter in the JPF space
  // (just a reminder - we can't use the reference value because it might
  // change -- the ElementInfo invariance sucks!
  static int nInstances;
  private int id = nInstances++; // just for peer implementation purposes 
  
  public String format (Object o) {
    StringBuffer sb = new StringBuffer();
    FieldPosition pos = new FieldPosition(0);
    return format(o, sb, pos).toString();
  }
  
  public abstract StringBuffer format (Object o, StringBuffer sb, FieldPosition pos);

  public abstract Object parseObject (String source, ParsePosition pos);

  public Object parseObject(String source) throws ParseException {
    ParsePosition pos = new ParsePosition(0);
    Object result = parseObject(source, pos);
    if (pos.index == 0) {
      throw new ParseException("Format.parseObject(String) failed",
        pos.errorIndex);
    }
    return result;
  }
}
