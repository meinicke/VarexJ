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

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class CommitOutputStream extends OutputStream
{
   private final OutputStream m_sink;
   private       byte         m_buffer[];
   private       int          m_size;
   
   public CommitOutputStream(OutputStream sink)
   {
      if (sink == null)
         throw new NullPointerException("sink == null");
      
      m_sink   = sink;
      m_buffer = new byte[1024];
   }
   
   public void write(int data)
   {
      if (m_size >= m_buffer.length)
         m_buffer = Arrays.copyOf(m_buffer, 2 * m_buffer.length);
      
      m_buffer[m_size++] = (byte) data;
   }

   public void write(byte buffer[], int offset, int length)
   {
      if (offset < 0)
         throw new IndexOutOfBoundsException("offset < 0 : " + offset);
      
      if (length < 0)
         throw new IndexOutOfBoundsException("length < 0 : " + length);
         
	   if (offset + length > buffer.length)
	      throw new IndexOutOfBoundsException("offset + length > buffer.length : " + offset + " + " + length + " > " + buffer.length);
      
      if (length == 0)
         return;
      
      if (m_size + length > m_buffer.length)
         m_buffer = Arrays.copyOf(m_buffer, Math.max(m_size + length, 2 * m_buffer.length));
      
      System.arraycopy(buffer, offset, m_buffer, m_size, length);
      
      m_size += length;
   }
   
   public int getSize()
   {
      return(m_size);
   }
   
   public void commit() throws IOException
   {
      if (m_size == 0)
         return;
      
      m_sink.write(m_buffer, 0, m_size);
      
      m_size = 0;
   }
   
   public void rollback()
   {
      m_size = 0;
   }
   
   public void flush() throws IOException
   {
      m_sink.flush();      
   }
   
   public void close() throws IOException
   {
      m_sink.close();
   }
}
