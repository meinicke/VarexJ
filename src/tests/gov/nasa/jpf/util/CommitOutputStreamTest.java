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
import java.security.SecureRandom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class CommitOutputStreamTest extends TestJPF
{
   private static final SecureRandom s_random = new SecureRandom();
   
   private PipedInputStream   m_result;
   private CommitOutputStream m_fixture;
   
   @Before
   public void before() throws IOException
   {
      PipedOutputStream pipeOut;
      
      pipeOut   = new PipedOutputStream();
      m_fixture = new CommitOutputStream(pipeOut);
      m_result  = new PipedInputStream(pipeOut, 8 * 1024);
   }
   
   @After
   public void after() throws IOException
   {
      m_fixture.flush();
      assertEquals(0, m_result.available());
   }
   
   @SuppressWarnings("resource")
@Test(expected = NullPointerException.class)
   public void constructorNullArg()
   {
      new CommitOutputStream(null);
   }
   
   @SuppressWarnings("resource")
@Test
   public void flush() throws IOException
   {
      CountedOutputStream counted;
      CommitOutputStream fixture;
      
      counted = new CountedOutputStream();
      fixture = new CommitOutputStream(counted);
      
      fixture.write(10);
      fixture.flush();
      
      assertEquals(0, counted.getWriteCount());
      assertEquals(1, counted.getFlushCount());
      assertEquals(1, fixture.getSize());
   }

   @Test
   public void close() throws IOException
   {
      CountedOutputStream counted;
      CommitOutputStream fixture;

      counted = new CountedOutputStream();
      fixture = new CommitOutputStream(counted);

      fixture.write(10);
      fixture.close();

      assertEquals(0, counted.getWriteCount());
      assertEquals(1, counted.getCloseCount());
      assertEquals(1, fixture.getSize());
   }
   
   @Test
   public void rollback() throws IOException
   {
      m_fixture.write(10);
      assertEquals(1, m_fixture.getSize());
      m_fixture.rollback();
      assertEquals(0, m_fixture.getSize());
      m_fixture.commit();
      m_fixture.flush();
      assertEquals(0, m_result.available());
   }
   
   @Test
   public void expand() throws IOException
   {
      int i;
      
      for (i = 0; i < 2 * 1024; i++)
         m_fixture.write(i);
      
      assertEquals(2 * 1024, m_fixture.getSize());
      
      m_fixture.commit();

      assertEquals(0, m_fixture.getSize());
      assertEquals(2 * 1024, m_result.available());

      for (i = 0; i < 2 * 1024; i++)
         assertEquals(i & 0x00FF, m_result.read());
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
      
      assertEquals(0, m_fixture.getSize());
   }

   @Test
   public void writeArray() throws IOException
   {
      byte expected[], actual[];
      
      expected = new byte[10];
      
      s_random.nextBytes(expected);
      
      m_fixture.write(expected);
      assertEquals(expected.length, m_fixture.getSize());

      m_fixture.commit();
      assertEquals(0, m_fixture.getSize());
      
      m_fixture.flush();
      assertEquals(expected.length, m_result.available());
      
      actual = new byte[expected.length];
      
      assertEquals(actual.length, m_result.read(actual));
      assertArrayEquals(expected, actual);
   }

   @Test
   public void expandDouble() throws IOException
   {
      byte expected[], actual[];

      expected = new byte[3 * 1024 / 2];

      s_random.nextBytes(expected);

      m_fixture.write(expected);
      assertEquals(expected.length, m_fixture.getSize());

      m_fixture.commit();
      assertEquals(0, m_fixture.getSize());

      m_fixture.flush();
      assertEquals(expected.length, m_result.available());

      actual = new byte[expected.length];

      assertEquals(actual.length, m_result.read(actual));
      assertArrayEquals(expected, actual);
   }

   @Test
   public void expandTriple() throws IOException
   {
      byte expected[], actual[];

      expected = new byte[3 * 1024];

      s_random.nextBytes(expected);

      m_fixture.write(expected);
      assertEquals(expected.length, m_fixture.getSize());

      m_fixture.commit();
      assertEquals(0, m_fixture.getSize());

      m_fixture.flush();
      assertEquals(expected.length, m_result.available());

      actual = new byte[expected.length];

      assertEquals(actual.length, m_result.read(actual));
      assertArrayEquals(expected, actual);
   }

   private static class CountedOutputStream extends OutputStream
   {
      private int m_write;
      private int m_flush;
      private int m_close;
      
      public void write(int data)
      {
         m_write++;
      }
      
      public int getWriteCount()
      {
         return(m_write);
      }
      
      public void flush()
      {
         m_flush++;
      }
      
      public int getFlushCount()
      {
         return(m_flush);
      }
      
      public void close()
      {
         m_close++;
      }
      
      public int getCloseCount()
      {
         return(m_close);
      }
   }   
}
