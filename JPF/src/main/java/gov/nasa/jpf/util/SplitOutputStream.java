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

public class SplitOutputStream extends OutputStream
{
   private final OutputStream m_sinks[];
   
   public SplitOutputStream(OutputStream ... sinks)
   {
      int i;
      
      if (sinks.length <= 0)
         throw new IllegalArgumentException("sinks.length <= 0 : " + sinks.length);
      
      for (i = sinks.length; --i >= 0; )
         if (sinks[i] == null)
            throw new NullPointerException("sinks[i] == null : " + i);
      
      m_sinks = Arrays.copyOf(sinks, sinks.length);
   }

   public void write(int data) throws IOException
   {
      int i;
      
      for (i = m_sinks.length; --i >= 0; )
         m_sinks[i].write(data);
   }

   public void write(byte buffer[], int offset, int length) throws IOException
   {
      int i;
      
      if (buffer == null)
         throw new NullPointerException("buffer == null");

      if (offset < 0)
         throw new IndexOutOfBoundsException("offset < 0 : " + offset);

      if (length < 0)
         throw new IndexOutOfBoundsException("length < 0 : " + length);

      if (offset + length > buffer.length)
         throw new IndexOutOfBoundsException("offset + length > buffer.length : " + offset + " + " + length + " > " + buffer.length);

      if (length == 0)
         return;

      for (i = m_sinks.length; --i >= 0; )
         m_sinks[i].write(buffer, offset, length);
   }

   public void flush() throws IOException
   {
      int i;

      for (i = m_sinks.length; --i >= 0; )
         m_sinks[i].flush();
   }

   public void close() throws IOException
   {
      int i;

      for (i = m_sinks.length; --i >= 0; )
         m_sinks[i].close();
   }
}
