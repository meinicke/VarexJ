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

public class LimitedInputStream extends InputStream
{
   private final InputStream m_source;
   private       int         m_limit;
   
   public LimitedInputStream(InputStream source)
   {
      if (source == null)
         throw new NullPointerException("source == null");
      
      m_source = source;
   }
   
   public int getLimit()
   {
      return(m_limit);
   }
   
   public void setLimit(int length)
   {
      if (length < 0)
         throw new IllegalArgumentException("length < 0 : " + length);
      
      m_limit = length;
   }
   
   public int read() throws IOException
   {
      int result;
      
      if (m_limit <= 0)
         return(-1);
      
      result = m_source.read();
      
      if (result >= 0)
         m_limit--;
      
      return(result);
   }
   
   public int read(byte buffer[], int offset, int length) throws IOException
   {
      if (buffer == null)
         throw new NullPointerException("buffer == null");
      
      if (offset < 0)
         throw new IndexOutOfBoundsException("offset < 0 : " + offset);
      
      if (length < 0)
         throw new IndexOutOfBoundsException("length < 0 : " + length);
      
      if (offset + length > buffer.length)
         throw new IndexOutOfBoundsException("offset + length > buffer.length : " + offset + " + " + length + " > " + buffer.length);

      if (length == 0)
         return(0);
      
      length = Math.min(m_limit, length);
      
      if (length == 0)
         return(-1);
      
      length = m_source.read(buffer, offset, length);
      
      if (length > 0)
         m_limit -= length;
      
      return(length);
   }
   
   public long skip(long n) throws IOException
   {
      n = Math.min(n, m_limit);
      
      if (n <= 0)
         return(0);
      
      n = m_source.skip(n);
      
      if (n > 0)
         m_limit -= n;
      
      return(n);
   }
   
   public int available() throws IOException
   {
      int result;
      
      if (m_limit <= 0)
         return(0);
      
      result = m_source.available();
      result = Math.min(result, m_limit);
      
      return(result);
   }
   
   public void close() throws IOException
   {
      m_limit = 0;
      
      m_source.close();
   }
}
