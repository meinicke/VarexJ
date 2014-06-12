//
// Copyright  (C) 2006 United States Government as represented by the
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

/**
 * a simple model to read data w/o dragging the file system content into
 * the JPF memory
 */
public class FileInputStream extends InputStream {

  FileDescriptor fd;
  private FileChannel fc = null;

  public FileInputStream (String fname) throws FileNotFoundException {
    try {
      fd = new FileDescriptor(fname, FileDescriptor.FD_READ);
    } catch (IOException iox){
      throw new FileNotFoundException(fname);
    }
  }
  
  public FileInputStream (File file) throws FileNotFoundException {
    this( file.getAbsolutePath());
  }
  
  public FileInputStream (FileDescriptor fd) {
    this.fd = fd;
  }
  
  public int read(byte b[]) throws IOException {
    return read(b,0,b.length);
  }

  public FileChannel getChannel() {
    if(this.fc ==null){
      this.fc = new FileChannel(fd);
    }
    return this.fc;
  }
  
  //--- our native peer methods
  
  boolean open (String fname) {
    // this sets the FileDescriptor from the peer side
    return false;
  }
  
  public int read() throws IOException {
    return fd.read();
  }

  public int read(byte b[], int off, int len) throws IOException {
    return fd.read(b,off,len);
  }
  
  public long skip(long n) throws IOException {
    return fd.skip(n);
  }

  public int available () throws IOException {
    return fd.available();
  }
  
  public void close () throws IOException {
    fd.close();
  }
  
  
}
