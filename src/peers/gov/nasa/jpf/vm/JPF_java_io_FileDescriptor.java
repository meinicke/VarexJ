//
// Copyright  (C) 20037 United States Government as represented by the
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
package gov.nasa.jpf.vm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.Map.Entry;

import cmu.conditional.BiFunction;
import cmu.conditional.Conditional;
import cmu.conditional.IChoice;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.util.DynamicObjectArray;
import gov.nasa.jpf.util.JPFLogger;

/**
 * native peer for file descriptors, which are our basic interface to
 * access file contents. The implementation used here just forwards
 * to FileInputStreams, which is terribly inefficient for frequent
 * restores (in which case a simple byte[] buffer would be more efficient)
 */
@SuppressWarnings({"resource", "deprecation"})
public class JPF_java_io_FileDescriptor extends NativePeer {

  static JPFLogger logger = JPF.getLogger("java.io.FileDescriptor");


  // NOTE: keep those in sync with the model class
  static final int FD_READ = 0;
  static final int FD_WRITE = 1;
  
  static final int FD_NEW = 0;
  static final int FD_OPENED = 1;
  static final int FD_CLOSED = 2;

  
  int count=2;  // count out std handles
  DynamicObjectArray<Object> content;
  
  public JPF_java_io_FileDescriptor (Config conf){
    content = new DynamicObjectArray<Object>();
    count = 2;
  }
  
  @MJI
  public Conditional<Integer> open__Ljava_lang_String_2I__I (MJIEnv env, int objref,
                                                   int fnameRef, int mode, final FeatureExpr ctx) {
//    String fname = env.getStringObject(ctx, fnameRef);
    Conditional<String> fnames = env.getConditionalStringObject(fnameRef);
    final int finalMode = mode;
    final MJIEnv finalEnv = env;
    Conditional<Integer> fds = fnames.mapf(ctx, new BiFunction<FeatureExpr, String, Conditional<Integer>>() {
      @Override
      public Conditional<Integer> apply(FeatureExpr x, String y) {
        if (finalMode == FD_READ) {
          return One.valueOf(openRead(y, x.and(ctx)));
        } else if (finalMode == FD_WRITE) {
          return One.valueOf(openWrite(y, x.and(ctx)));
        } else {
          finalEnv.throwException(ctx, "java.io.IOException", "illegal open mode: " + finalMode);
          return One.valueOf(-1);
        }
      }
    });
    return fds;
  }

  @MJI
  public int openRead (String fname, FeatureExpr ctx) {
    File file = new File(fname);
    if (file.exists()) {
      try {
        FileInputStream fis = new FileInputStream(file);
        fis.getChannel(); // just to allocate one

        count++;
        content.set(count, fis);

        logger.info("opening ", fname, " (read) => ", count);

        return count;
        
      } catch (IOException x) {
        logger.warning("failed to open ", fname, " (read) : ", x);
      }
    } else {
      logger.info("cannot open ", fname, " (read) : file not found");
    }
    
    return -1;
  }
  
  @MJI
  public int openWrite (String fname, FeatureExpr ctx){
    File file = new File(fname);
    try {
      FileOutputStream fos = new FileOutputStream(file);
      fos.getChannel(); // just to allocate one
                
      count++;
      content.set(count, fos);

      logger.info("opening ", fname, " (write) => ", count);

      return count;
        
    } catch (IOException x) {
      logger.warning("failed to open ", fname, " (write) : ", x);
    }
    
    return -1;    
  }
  
  private static Object CLOSED_OBJECT = new Object(); 

  @MJI
  public void close0 (MJIEnv env, int objref, FeatureExpr ctx) {
//    int fd = env.getIntField(objref, "fd").simplify(ctx).getValue().intValue();
    Conditional<Integer> fds = env.getIntField(objref, "fd").simplify(ctx);

    List<Integer> fdList = fds.toList();
    for (int fd : fdList) {
      try {
        Object fs = content.get(fd);

        if (fs != null){
          if (fs == CLOSED_OBJECT) {
            return;
          }
          if (fs instanceof FileInputStream){
            ((FileInputStream)fs).close();
          } else {
            ((FileOutputStream)fs).close();
          }
        } else {
          logger.warning("cannot close ", fd, " : no such stream");
        }
        content.set(fd, CLOSED_OBJECT);

      } catch (ArrayIndexOutOfBoundsException aobx){
        env.throwException(ctx, "java.io.IOException", "file not open");
      } catch (IOException iox) {
        env.throwException(ctx, "java.io.IOException", iox.getMessage());
      }
    }

  }
  
  // that's a JPF specific thing - we backrack into
  // a state where the file was still open, and hence don't want to
  // change the FileDescriptor identify
  void reopen (MJIEnv env, int objref, FeatureExpr ctx) throws IOException {
	int fd = env.getIntField(objref, "fd").getValue().intValue();
    long off = env.getLongField(objref,"off").getValue();
    
    if (content.get(fd) == null){
      int mode = env.getIntField(objref, "mode").getValue().intValue();
      int fnRef = env.getReferenceField(ctx, objref, "fileName").getValue();
      String fname = env.getStringObject(ctx, fnRef);
      
      if (mode == FD_READ){
        FileInputStream fis = new FileInputStream(fname);
        FileChannel fc = fis.getChannel(); // just to allocate one
        fc.position(off);
        content.set(fd, fis);
        
      } else if (mode == FD_WRITE){
        FileOutputStream fos = new FileOutputStream(fname);
        FileChannel fc = fos.getChannel(); // just to allocate one
        fc.position(off);
        content.set(fd, fos);
        
      } else {
        env.throwException(ctx, "java.io.IOException", "illegal mode: " + mode);
      }
    }
  }
  
  @MJI
  public void write__I__ (MJIEnv env, int objref, int b, FeatureExpr ctx){
	int fd = env.getIntField(objref, "fd").getValue().intValue();
    long off = env.getLongField(objref,"off").getValue();
    
    try {
      // this is terrible overhead
      Object fs = content.get(fd);
      if (fs != null){
        if (fs instanceof FileOutputStream){
          FileOutputStream fos = (FileOutputStream)fs;
          FileChannel fc = fos.getChannel();
          fc.position(off);
          fos.write(b);
          env.setLongField(ctx, objref, "off", new One<>(fc.position()));
          
        } else {
          env.throwException(ctx, "java.io.IOException", "write attempt on file opened for read access");
        }
        
      } else {
        if (env.getIntField(objref, "state").getValue().intValue() == FD_OPENED){ // backtracked
          reopen(env,objref, ctx);
          write__I__(env,objref,b, ctx); // try again
        } else {
          env.throwException(ctx, "java.io.IOException", "write attempt on closed file");
        }
      }
    } catch (ArrayIndexOutOfBoundsException aobx){
      env.throwException(ctx, "java.io.IOException", "file not open");      
    } catch (IOException iox) {
      env.throwException(ctx, "java.io.IOException", iox.getMessage());
    }    
  }
  
  private static FeatureExpr bufferCTX = FeatureExprFactory.True();
  
  @MJI
  public void write___3BII__ (MJIEnv env, int objref,
                                     int bref, int offset, int len, FeatureExpr ctx){
	int fd = env.getIntField(objref, "fd").simplify(ctx).getValue();
    long off = env.getLongField(objref,"off").simplify(ctx).getValue();
    
    try {
      // this is terrible overhead
      Object fs = content.get(fd);
      if (fs != null){
        if (fs instanceof FileOutputStream){
          FileOutputStream fos = (FileOutputStream)fs;
          FileChannel fc = fos.getChannel();
          fc.position(off);
          
          
          byte[] buf = new byte[len]; // <2do> make this a permanent buffer
          for (int i=0, j=offset; i<len; i++, j++){
        	   Conditional<Byte> value = env.getByteArrayElement(bref, j).simplify(ctx).simplify(bufferCTX);
        	   if (value instanceof IChoice) {
        		   for (Entry<Byte, FeatureExpr> entry : value.toMap().entrySet()) {
        			   System.err.println("JPF_java_io_FileDescriptor.write___3BII__()");
        			   System.err.println("Conditional write"+ value);
        			   bufferCTX = entry.getValue();
        			   System.err.println("Set write ctx to: " + bufferCTX);
        			   buf[i] = entry.getKey();   
        			   break;
        		   }
        	   } else {
        		   buf[i] = value.getValue();
        	   }
          }
          fos.write(buf);
          
          env.setLongField(ctx, objref, "off", new One<>(fc.position()));
          
        } else {
          env.throwException(ctx, "java.io.IOException", "write attempt on file opened for read access");
        }
        
      } else {
        if (env.getIntField(objref, "state").getValue().intValue() == FD_OPENED){ // backtracked
          reopen(env,objref, ctx);
          write___3BII__(env,objref,bref,offset,len, ctx); // try again
        } else {
          env.throwException(ctx, "java.io.IOException", "write attempt on closed file");
        }
      }
    } catch (ArrayIndexOutOfBoundsException aobx){
      env.throwException(ctx, "java.io.IOException", "file not open");      
    } catch (IOException iox) {
      env.throwException(ctx, "java.io.IOException", iox.getMessage());
    }        
  }
  
  @MJI
  public int read____I (MJIEnv env, int objref, FeatureExpr ctx) {
	  try {
	int fd = env.getIntField(objref, "fd").getValue();
    long off = env.getLongField(objref,"off").simplify(ctx).getValue();
        
      // this is terrible overhead
      Object fs = content.get(fd);
      if (fs != null){
        if (fs instanceof FileInputStream){
          FileInputStream fis = (FileInputStream)fs;
          FileChannel fc = fis.getChannel();
          fc.position(off);
          int r = fis.read();
          env.setLongField(ctx, objref, "off", new One<>(fc.position()));
          return r;
        } else {
          env.throwException(ctx, "java.io.IOException", "read attempt on file opened for write access");
          return -1;                  
        }
        
      } else {
        if (env.getIntField(objref, "state").getValue().intValue() == FD_OPENED){ // backtracked
          reopen(env,objref, ctx);
          return read____I(env,objref, ctx); // try again
        } else {
          env.throwException(ctx, "java.io.IOException", "read attempt on closed file");
          return -1;
        }
      }
    } catch (ArrayIndexOutOfBoundsException aobx){
      env.throwException(ctx, "java.io.IOException", "file not open");
      return -1;
    } catch (IOException iox) {
      env.throwException(ctx, "java.io.IOException", iox.getMessage());
		} catch (Exception e) {
			env.throwException(ctx, Exception.class.getName(), e.getMessage());
		}
    return -1;
  }

	@MJI
	public int read___3BII__I(MJIEnv env, int objref, int bufref, int offset, int len, FeatureExpr ctx) {
		try {
			int fd = env.getIntField(objref, "fd").simplify(ctx).getValue().intValue();
			long off = env.getLongField(objref, "off").simplify(ctx).getValue();

      Object fs = content.get(fd);
      if (fs != null){
        if (fs instanceof FileInputStream){
          FileInputStream fis = (FileInputStream)fs;
          FileChannel fc = fis.getChannel();
          fc.position(off);
      
          byte[] buf = new byte[len]; // <2do> make this a permanent buffer
          
          int r = fis.read(buf);
          for (int i=0, j=offset; i<len; i++, j++) {
            env.setByteArrayElement(ctx, bufref, j, new One<>(buf[i]));
          }
          env.setLongField(ctx, objref, "off", new One<>(fc.position()));
          return r;
          
        } else {
          env.throwException(ctx, "java.io.IOException", "read attempt on file opened for write access");
          return -1;                  
        }
        
      } else {
        if (env.getIntField(objref, "state").getValue().intValue() == FD_OPENED){ // backtracked
          reopen(env,objref, ctx);
          return read___3BII__I(env,objref,bufref,offset,len, ctx); // try again
        } else {
          env.throwException(ctx, "java.io.IOException", "read attempt on closed file");
          return -1;        
        }
      }
    } catch (ArrayIndexOutOfBoundsException aobx){
      env.throwException(ctx, "java.io.IOException", "file not open");
      return -1;
    } catch (IOException iox) {
      env.throwException(ctx, "java.io.IOException", iox.getMessage());
      return -1;
    } catch (Exception e) {
    	env.throwException(ctx, Exception.class.getName(), e.getMessage());
    	return -1;
    }
  }
  
  @MJI
  public long skip__J__J (MJIEnv env, int objref, long nBytes, FeatureExpr ctx) {
	int fd = env.getIntField(objref, "fd").getValue().intValue();
    long off = env.getLongField(objref,"off").getValue();
        
    try {
      Object fs = content.get(fd);
      if (fs != null){
        if (fs instanceof FileInputStream){
          FileInputStream fis = (FileInputStream)fs;
          FileChannel fc = fis.getChannel();
          fc.position(off);

          long r = fis.skip(nBytes);
          env.setLongField(ctx, objref, "off", new One<>(fc.position()));
          return r;
          
        } else {
          env.throwException(ctx, "java.io.IOException", "skip attempt on file opened for write access");
          return -1;                  
        }
        
      } else {
        env.throwException(ctx, "java.io.IOException", "skip attempt on closed file");
        return -1;        
      }
          
    } catch (ArrayIndexOutOfBoundsException aobx){
      env.throwException(ctx, "java.io.IOException", "file not open");
      return -1;
    } catch (IOException iox) {
      env.throwException(ctx, "java.io.IOException", iox.getMessage());
      return -1;
    }    
  }
  
  @MJI
  public void sync____ (MJIEnv env, int objref, FeatureExpr ctx) {
//    int fd = env.getIntField(objref, "fd").simplify(ctx).getValue().intValue();
    Conditional<Integer> fds = env.getIntField(objref, "fd").simplify(ctx);

    List<Integer> fdList = fds.toList();

    for (int fd : fdList) {
      try {
        Object fs = content.get(fd);
        if (fs != null) {
          if (fs instanceof FileOutputStream) {
            ((FileOutputStream) fs).flush();
          } else {
            // nothing
          }

        } else {
          env.throwException(ctx, "java.io.IOException", "sync attempt on closed file");
        }

      } catch (ArrayIndexOutOfBoundsException aobx) {
        env.throwException(ctx, "java.io.IOException", "file not open");
      } catch (IOException iox) {
        env.throwException(ctx, "java.io.IOException", iox.getMessage());
      }
    }
  }
  
  @MJI
  public int available____I (MJIEnv env, int objref, FeatureExpr ctx) {
	  try {
	    int fd = env.getIntField(objref, "fd").simplify(ctx).getValue().intValue();
	    long off = env.getLongField(objref,"off").simplify(ctx).getValue();
    
      Object fs = content.get(fd);
      if (fs != null){
        if (fs instanceof FileInputStream){
          FileInputStream fis = (FileInputStream)fs;
          FileChannel fc = fis.getChannel();
          fc.position(off);
          return fis.available();
          
        } else {
          env.throwException(ctx, "java.io.IOException", "available() on file opened for write access");
          return -1;                  
        }
        
      } else {
        env.throwException(ctx, "java.io.IOException", "available() on closed file");
        return -1;        
      }
          
    } catch (ArrayIndexOutOfBoundsException aobx){
      env.throwException(ctx, "java.io.IOException", "file not open");
      return -1;
    } catch (IOException iox) {
      env.throwException(ctx, "java.io.IOException", iox.getMessage());
    } catch (Exception e) {
		System.out.println(e.getMessage());
	}
	  return -1;
    
  }
}
