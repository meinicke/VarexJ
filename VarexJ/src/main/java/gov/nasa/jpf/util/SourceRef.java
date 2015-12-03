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

/**
 * a source reference abstraction wrapping file and line information
 */
public class SourceRef {
  public String fileName;
  public int    line;

  public SourceRef (String f, int l) {
    if (f == null) {
      fileName = "?";
    } else {
      fileName = f;
    }
    
    line = l;
  }

  public SourceRef (String spec){
    int idx = spec.indexOf(':');
    if (idx > 0){
      fileName = spec.substring(0, idx);
      line = Integer.parseInt(spec.substring(idx+1));
    } else {
      fileName = spec;
      line = 0;
    }
  }

  public String getLocationString() {
    return (fileName + ':' + line);
  }
  
  public String getLineString () {
    Source source = Source.getSource(fileName);
    if (source != null) {
      return source.getLine(line);
    } else {
      return null;
    }
  }

  public boolean equals (Object o) {
    if (o == null) {
      return false;
    }

    if (!(o instanceof SourceRef)) {
      return false;
    }

    SourceRef that = (SourceRef) o;

    if (this.fileName == null) {
      return false;
    }

    if (this.line == -1) {
      return false;
    }

    if (!this.fileName.equals(that.fileName)) {
      return false;
    }

    if (this.line != that.line) {
      return false;
    }

    return true;
  }

  public boolean equals (String f, int l) {
    if (fileName == null) {
      return false;
    }

    if (line == -1) {
      return false;
    }

    if (!fileName.equals(f)) {
      return false;
    }

    if (line != l) {
      return false;
    }

    return true;
  }

  public boolean equals (String filePos){
    if (filePos.startsWith(fileName)){
      int len = fileName.length();
      if (filePos.charAt(len) == ':'){
        if (Integer.parseInt(filePos.substring(len+1)) == line){
          return true;
        }
      }
    }

    return false;
  }

  public int hashCode() {
    assert false : "hashCode not designed";
    return 42; // any arbitrary constant will do
    // thanks, FindBugs!
  }

  public String getFileName () {
    return fileName;
  }

  public void set (SourceRef sr) {
    fileName = sr.fileName;
    line = sr.line;
  }

  public String toString () {
    return (fileName + ':' + line);
  }
}
