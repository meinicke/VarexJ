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
import java.io.InputStream;
import java.util.Arrays;

public class AvailableBufferedInputStream extends InputStream
{
   private static final boolean CLEAN               = false;
           static final int     DEFAULT_BUFFER_SIZE = 16 * 1024;        // Not private for testing purposes
   
   private final InputStream m_input;
   private final byte        m_buffer[];
   private       int         m_read;
   private       int         m_end;
   
   public AvailableBufferedInputStream(InputStream input)
   {
      this(input, DEFAULT_BUFFER_SIZE);
   }
   
   public AvailableBufferedInputStream(InputStream input, int bufferSize)
   {
      m_input  = input;
      m_buffer = new byte[bufferSize];
      
      if (input == null)
         throw new NullPointerException("input == null");
   }
   
   public int getBufferSize()
   {
      return(m_buffer.length);
   }
   
   public int read() throws IOException
   {
      if (m_read >= m_end)
      {
         fill();
      
         if (m_read >= m_end)
            return(m_input.read());
      }
      
      return(m_buffer[m_read++] & 0x00FF);
   }

   public int read(byte buffer[], int offset, int length) throws IOException
   {
      if (m_read >= m_end)
      {
         fill();
         
         if (m_read >= m_end)
            return(m_input.read(buffer, offset, length));
      }
      
      length  = Math.min(length, m_end - m_read);
      System.arraycopy(m_buffer, m_read, buffer, offset, length);
      m_read += length;
         
      return(length);
   }

   public int peek() throws IOException   // Returns -1 if there is nothing to read.
   {
      if (m_read >= m_end)
      {
         fill();
         
         if (m_read >= m_end)
            return(-1);
      }
      
      return(m_buffer[m_read] & 0x00FF);
   }

   public int available() throws IOException
   {
      if (m_read >= m_end)
         fill();
      
      return(m_end - m_read);
   }
   
   public void unread(int data) throws IOException
   {
      if (m_read <= 0)
      {
         if (m_end >= m_buffer.length)
            throw new IOException("Internal buffer overflow");
         
         System.arraycopy(m_buffer, m_read, m_buffer, m_buffer.length - m_end, m_end);
         m_read = m_buffer.length - m_end;
         m_end  = m_buffer.length;
      }
      
      m_buffer[--m_read] = (byte) data;
   }
   
   private void fill() throws IOException
   {
      if (CLEAN)
         Arrays.fill(m_buffer, 0, m_buffer.length, (byte) 0);

      m_read = 0;
      m_end  = m_input.available();
      m_end  = Math.max(m_end, 0);

      if (m_end <= 0)                              // m_input.read(m_buffer, 0, 0) can be expensive.  Don't waste time.
         return;

      m_end  = Math.min(m_end, m_buffer.length);
      m_end  = m_input.read(m_buffer, 0, m_end);
      m_end  = Math.max(m_end, 0);                 // Defend against a bug where m_input.available() returning > 0 and m_input.read() returning -1
   }

   public String toString()  // For debugging purposes
   {
      return(new String(m_buffer, m_read, m_end - m_read));
   }
}
