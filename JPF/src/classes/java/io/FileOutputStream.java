//
// Copyright  (C) 2007 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
//  (NASA).  All Rights Reserved.
// 
// This software is distributed under the NASA Open Source Agreement
//  (NOSA), version 1.3.  The NOSA has been approved by the Open Source
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
package java.io;

import java.nio.channels.FileChannel;

public class FileOutputStream extends OutputStream {

  FileDescriptor fd;
  private FileChannel fc = null;
  
  public FileOutputStream (String fname) throws FileNotFoundException {
    try {
      fd = new FileDescriptor(fname, FileDescriptor.FD_WRITE);
    } catch (IOException iox){
      throw new FileNotFoundException(fname);
    }
  }
  
  public FileOutputStream (File file) throws FileNotFoundException {
    this( file.getAbsolutePath());
  }
  
  public FileOutputStream (FileDescriptor fd) {
    this.fd = fd;
  }
  
  public FileChannel getChannel() {
    if(this.fc ==null){
      this.fc = new FileChannel(fd);
    }
    return this.fc;
  }
  
  public FileDescriptor getFD() {
    return fd;
  }
  
  //--- our native peer methods
  
  boolean open (String fname) {
    // this sets the FileDescriptor from the peer side
    return false;
  }
  
  public void write (int b) throws IOException {
    fd.write(b);
  }

  public void write (byte[] buf, int off, int len) throws IOException {
    fd.write(buf, off, len);
  }
  
  public void close () throws IOException {
    fd.close();
  }

  public void flush () throws IOException {
    fd.sync();
  }
}
