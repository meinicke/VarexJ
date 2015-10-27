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
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class SplitOutputStreamTest extends TestJPF
{
   private PipedInputStream  m_sinks[];
   private SplitOutputStream m_fixture;
   
   @Before
   public void before() throws IOException
   {
      PipedOutputStream output[];
      int i;
      
      m_sinks = new PipedInputStream[2];
      output  = new PipedOutputStream[2];
      
      for (i = m_sinks.length; --i >= 0; )
      {
         m_sinks[i] = new PipedInputStream();
         output[i]  = new PipedOutputStream(m_sinks[i]);
      }
      
      m_fixture = new SplitOutputStream(output);
      
      Arrays.fill(output, null);   // Force SplitOutputStream to make a copy of output
   }
   
   @After
   public void after() throws IOException
   {
      int i, length, offset, delta;
      byte expect[], actual[];
      
      m_fixture.flush();
      m_fixture.close();
      
      expect = new byte[128];
      actual = new byte[128];
      
      while (true)
      {
         length = m_sinks[0].read(expect);
         
         if (length < 0)
            break;
         
         for (i = m_sinks.length; --i > 0; )
         {
            assertTrue(m_sinks[i].available() >= length);
            
            for (offset = 0; offset < length; offset += delta)
            {
               delta = m_sinks[i].read(actual, offset, length - offset);
               
               assertTrue(delta >= 0);
            }
            
            assertArrayEquals(actual, expect);
         }
      }
      
      for (i = m_sinks.length; --i > 0; )
         assertEquals(-1, m_sinks[i].read());
   }

   @Test(expected = NullPointerException.class)
   public void passNullPointerToConstructor() throws IOException
   {
      OutputStream sinks[];
      
      sinks = null;
      
      new SplitOutputStream(sinks);
   }

   @Test(expected = IllegalArgumentException.class)
   public void passNoArgsToConstructor() throws IOException
   {
      new SplitOutputStream();
   }

   @Test(expected = NullPointerException.class)
   public void passNullArgsToConstructor() throws IOException
   {
      OutputStream sink;
      
      sink = null;
      
      new SplitOutputStream(sink);
   }

   @Test
   public void writeByte() throws IOException
   {
      m_fixture.write(123);
   }
   
   @Test
   public void modifyAfterConstructor()
   {
      
   }
   
   @Test(expected = NullPointerException.class)
   public void writeNullBuffer() throws IOException
   {
      m_fixture.write(null, 0, 1);
   }
   
   @Test(expected = IndexOutOfBoundsException.class)
   public void writeIndexNegOne() throws IOException
   {
      m_fixture.write(new byte[0], -1, 0);
   }

   @Test(expected = IndexOutOfBoundsException.class)
   public void writeLengthNegOne() throws IOException
   {
      m_fixture.write(new byte[0], 0, -1);
   }

   @Test(expected = IndexOutOfBoundsException.class)
   public void writeBeyondEnd() throws IOException
   {
      m_fixture.write(new byte[16], 8, 9);
   }

   @Test
   public void writeLengthZero() throws IOException
   {
      m_fixture.write(new byte[1], 0, 0);
   }

   @Test
   public void writeArray() throws IOException
   {
      byte buffer[];
      
      buffer = new byte[]{2, 3, 5, 7, 11, 13};
      
      m_fixture.write(buffer);
   }
}
