/*
 *  This file is part of the Jikes RVM project (http://jikesrvm.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License. You
 *  may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  See the COPYRIGHT.txt file distributed with this work for information
 *  regarding copyright ownership.
 */
package jikesRVM.java.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class TestFileChannel extends TestJPF {
	private static final int MAGIC_INT = 0xdeadbeef;

	static String[] JPF_CONFIGURATION = new String[] { "+nhandler.delegateUnhandledNative", "+search.class=.search.RandomSearch", "+choice=MapChoice" };

	@Test
	public void test1() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {

			final ByteBuffer buffer = ByteBuffer.allocateDirect(4);
			System.out.println(buffer.position());
			assertEquals(0, buffer.position());
			buffer.putInt(MAGIC_INT);
			System.out.println(buffer.position());
			assertEquals(4, buffer.position());
			buffer.flip();
			System.out.println(buffer);
			System.out.println(buffer.position());
			assertEquals(0, buffer.position());
			final int file_int = buffer.getInt();
			System.out.println(file_int);
		}
	}
	
	@Test
	public void test2() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			method();
			
		}
	}

	public static void main(String[] args) {
		final ByteBuffer buffer = ByteBuffer.allocateDirect(4);
		System.out.println(buffer.position());
		buffer.putInt(MAGIC_INT);
		System.out.println(buffer);
		buffer.flip();
		System.out.println("flip");
		System.out.println(buffer);
		final int file_int = buffer.getInt();
		System.out.println(buffer);
		System.out.println(file_int);
	}
	@SuppressWarnings("resource")
	void method() {
		
		File file = null;
	    try {
	      file = File.createTempFile("TestFileChannel", ".dat");
	      final ByteBuffer buffer = ByteBuffer.allocateDirect(4);
	      final ByteChannel output = (ByteChannel) new FileOutputStream(file).getChannel();
	      buffer.putInt(MAGIC_INT);
	      buffer.flip();
	      output.write(buffer);
	      output.close();

	      final ByteChannel input = (ByteChannel) new FileInputStream(file).getChannel();
	      buffer.clear();
	      while (buffer.hasRemaining()) { input.read(buffer); }
	      input.close();
	      buffer.flip();
	      final int file_int = buffer.getInt();
	      if (file_int != MAGIC_INT) {
	        System.out.println("TestFileChannel FAILURE");
	        System.out.println("Wrote " + Integer.toHexString(MAGIC_INT) + " but read " + Integer.toHexString(file_int));
	        fail();
	      } else {
	        System.out.println("TestFileChannel SUCCESS");
	      }
	    } catch (Exception e) {
	      System.out.println("TestFileChannel FAILURE");
	      e.printStackTrace(System.out);
	      fail();
	    } finally {
	      if (null != file) {
	        file.delete();
	      }
	    }
	}
}
