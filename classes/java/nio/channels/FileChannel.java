//
// Copyright (C) 2013 United States Government as represented by the
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
package java.nio.channels;

import java.io.IOException;
import java.io.FileDescriptor;

import java.nio.ByteBuffer;

//This class uses the methods from FileDescriptor in order to access files
public class FileChannel {

	public int read(ByteBuffer dst) throws IOException{
		return fd.read(dst.array(),0,dst.array().length);
	}

	public int write(ByteBuffer src) throws IOException{
		fd.write(src.array(),0,src.array().length);
		return src.array().length;
	}

	public void close() throws IOException{
		fd.close();
	}

	public FileChannel(FileDescriptor fd){
		this.fd = fd;
	}

	private FileDescriptor fd = null;

	public long position() { return 0; } // Stub for Eclipse

	public FileChannel position(long p) { return null; } // Stub for Eclipse
}
