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
package java.io;

import java.nio.channels.FileChannel;

import java.io.FileDescriptor;
/**
 * MJI model class for java.io.RandomAccessFile
 * This class cannot yet handle File I/O correctly
 * Some work about the use of RandomAccessFile can be 
 * found here : https://bitbucket.org/pfjeau/jpf_for_nanohttpd/src/8f880ee27410026c69cf37f1904b159965d1576e/?at=raf-progress
 * Another way to implement all the missing features is to fix the jpf-bfs project in order to handle file I/O
 *
 * @author Owen O'Malley
 */
@SuppressWarnings("unused")
public class RandomAccessFile {
  public RandomAccessFile(File name, String permissions
                         ) throws FileNotFoundException {
    filename = name;
    isOpen = true;
    isReadOnly = "r".equals(permissions);
    setDataMap();
  }

  public RandomAccessFile(String name, String permissions
                         ) throws FileNotFoundException {
    this(new File(name), permissions);
  }

  public void seek(long posn) throws IOException {
    currentPosition = posn;
  }

  public long length() throws IOException {
    return currentLength;
  }

  public native void setDataMap();
  
  public native void writeByte(int data) throws IOException;

  public native void write(byte[] data, int start, int len
                          ) throws IOException;


  public native void setLength(long len) throws IOException;

  public native int read(byte[] data, int start, int len
                         ) throws IOException;

  public native byte readByte() throws IOException;

  public void close() throws IOException {
    isOpen = false;
  }

  public FileChannel getChannel(){
    return null;//TODO
  }

  public FileDescriptor getFD(){
    return null;//TODO
  }

  private static class DataRepresentation {
    DataRepresentation next;
    long chunk_index;
    int[] data;
  }

  private final static void printList(DataRepresentation node) {
    DataRepresentation cur = node;
    System.out.print("Chunks:");
    while (cur != null) {
      System.out.print(" " + cur.chunk_index);
      cur = cur.next;
    }
    System.out.println();
  }

  private static final int CHUNK_SIZE = 256;
  private File filename;
  private boolean isOpen;
  private boolean isReadOnly;
  private long currentLength;
  private long currentPosition;
  private DataRepresentation data_root = null;
}

