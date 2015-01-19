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
package gov.nasa.jpf.vm;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.annotation.MJI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import cmu.conditional.BiFunction;
import cmu.conditional.Conditional;
import cmu.conditional.Function;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * MJI NativePeer class for java.lang.System library abstraction
 */
public class JPF_java_lang_System extends NativePeer {
  
	@MJI
	public void arraycopy__Ljava_lang_Object_2ILjava_lang_Object_2II__V(final MJIEnv env, int clsObjRef, Conditional<Integer> srcArrayRef, final Conditional<Integer> srcIdx,
			final Conditional<Integer> dstArrayRef, final Conditional<Integer> dstIdx, final Conditional<Integer> length, FeatureExpr ctx) {
		srcArrayRef.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Integer>>() {

			@Override
			public Conditional<Integer> apply(FeatureExpr ctx, final Integer srcArrayRef) {
				dstArrayRef.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Integer>>() {

					@Override
					public Conditional<Integer> apply(FeatureExpr ctx, final Integer dstArrayRef) {
						length.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Integer>>() {

							@Override
							public Conditional<Integer> apply(FeatureExpr ctx, final Integer length) {
								if (ctx.isContradiction()) {
									return null;
								}
								if ((srcArrayRef.intValue() == MJIEnv.NULL) || (dstArrayRef.intValue() == MJIEnv.NULL)) {
									env.throwException(ctx, "java.lang.NullPointerException");
									return null;
								}

								final ElementInfo eiSrc = env.getElementInfo(srcArrayRef);
								final ElementInfo eiDst = env.getModifiableElementInfo(dstArrayRef);
								try {
									srcIdx.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Object>>() {

										@Override
										public Conditional<Object> apply(FeatureExpr ctx, final Integer srcIdx) {
											dstIdx.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Object>>() {

												@Override
												public Conditional<Object> apply(FeatureExpr ctx, Integer dstIdx) {
													if (ctx.isContradiction()) {
														return null;
													}
													eiDst.copyElements(ctx, env.getThreadInfo(), eiSrc, srcIdx, dstIdx, length);
													return null;
												}
											});
											
											return null;
										}
										
									});
									
									
								} catch (IndexOutOfBoundsException iobx) {
									env.throwException(ctx, "java.lang.IndexOutOfBoundsException", iobx.getMessage());
								} catch (ArrayStoreException asx) {
									env.throwException(ctx, "java.lang.ArrayStoreException", asx.getMessage());
								}
								return null;
							}
						});
						
						return null;
						
					}
				});
				
				return null;
			}

		});

	}

  @MJI
  public int getenv__Ljava_lang_String_2__Ljava_lang_String_2 (MJIEnv env, int clsObjRef,
                                                                         int keyRef, FeatureExpr ctx){
    String k = env.getStringObject(ctx, keyRef);
    String v = System.getenv(k);
    
    if (v == null){
      return MJIEnv.NULL;
    } else {
      return env.newString(ctx, v);
    }
  }

  
  int createPrintStream (MJIEnv env, int clsObjRef, FeatureExpr ctx){
    ThreadInfo ti = env.getThreadInfo();
//    Instruction insn = ti.getPC().getValue();
//    StackFrame frame = ti.getTopFrame();
    ClassInfo ci = ClassLoaderInfo.getSystemResolvedClassInfo("gov.nasa.jpf.ConsoleOutputStream");

    // it's not really used, but it would be hack'ish to use a class whose
    // super class hasn't been initialized yet
    if (!ci.isRegistered()) {
      ci.registerClass(ctx, ti);
    }

    if (!ci.isInitialized()) {
      if (ci.initializeClass(ctx, ti)) {
        env.repeatInvocation();
        return MJIEnv.NULL;
      }
    }

    return env.newObject(ctx, ci);
  }
  
  @MJI
  public int createSystemOut____Ljava_io_PrintStream_2 (MJIEnv env, int clsObjRef, FeatureExpr ctx){
    return createPrintStream(env,clsObjRef, ctx);
  }
  
  @MJI
  public int createSystemErr____Ljava_io_PrintStream_2 (MJIEnv env, int clsObjRef, FeatureExpr ctx){
    return createPrintStream(env,clsObjRef, ctx);
  }
  
  int getProperties (MJIEnv env, Properties p, FeatureExpr ctx){
    int n = p.size() * 2;
    int aref = env.newObjectArray("Ljava/lang/String;", n);
    int i=0;
    
    for (Map.Entry<Object,Object> e : p.entrySet() ){
      env.setReferenceArrayElement(ctx,aref, 
                                   i++, new One<>(env.newString(ctx, e.getKey().toString())));
      env.setReferenceArrayElement(ctx,aref,
                                   i++, new One<>(env.newString(ctx, e.getValue().toString())));
    }
    
    return aref;
  }

  int getSysPropsFromHost (MJIEnv env, FeatureExpr ctx){
    return getProperties(env, System.getProperties(), ctx);
  }
  
  int getSysPropsFromFile (MJIEnv env, FeatureExpr ctx){
    Config conf = env.getConfig();
    
    String cf = conf.getString("vm.sysprop.file", "system.properties");
    if (cf != null){
      try {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream(cf);
        p.load(fis);
        
        return getProperties(env, p, ctx);
        
      } catch (IOException iox){
        return MJIEnv.NULL;
      }
    }
    //.. not yet
    return MJIEnv.NULL;
  }
  
  static String JAVA_CLASS_PATH = "java.class.path";
  
  @MJI
  public String getSUTJavaClassPath(VM vm, FeatureExpr ctx) {
    ClassInfo system = ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.System");
    
    ThreadInfo ti = vm.getCurrentThread();
    Heap heap = vm.getHeap();
    ElementInfo eiClassPath = heap.newString(ctx, JAVA_CLASS_PATH, ti);
    
    MethodInfo miGetProperty = system.getMethod("getProperty(Ljava/lang/String;)Ljava/lang/String;", true);
    DirectCallStackFrame frame = miGetProperty.createDirectCallStackFrame(ctx, ti, 0);
    frame.setReferenceArgument( 0, eiClassPath.getObjectRef(), null);
    frame.setFireWall(); // we don't want exceptions to escape into the SUT
    
    
    try {
      ti.executeMethodHidden(frame);
      
    } catch (UncaughtException e) {
       ti.clearPendingException();
       StackFrame caller = ti.popAndGetModifiableTopFrame(ctx);
       caller.advancePC();
       return null;
    }
    
    int ref = frame.peek(ctx).getValue();
    ElementInfo metaResult = heap.get(ref);
    String result = metaResult.asString().getValue();
    
    return result;
  }
  
  int getSelectedSysPropsFromHost (MJIEnv env, FeatureExpr ctx){
    Config conf = env.getConfig();
    String keys[] = conf.getStringArray("vm.sysprop.keys");

    if (keys == null){
      String[] defKeys = {
        "path.separator",
        "line.separator", 
        "file.separator",
        "user.name",
        "user.dir",
        "user.timezone",
        "user.country",
        "java.home",
        "java.version",
        "java.io.tmpdir",
        JAVA_CLASS_PATH
        //... and probably some more
        // <2do> what about -Dkey=value commandline options
      };
      keys = defKeys;
    }
    
    int aref = env.newObjectArray("Ljava/lang/String;", keys.length * 2);
    int i=0;
    
    for (String s : keys) {
      String v;
      
      int idx = s.indexOf('/');
      if (idx >0){ // this one is an explicit key/value pair from vm.system.properties
        v = s.substring(idx+1);
        s = s.substring(0,idx);
        
      } else {
        // the special beasts first (if they weren't overridden with vm.system.properties)
        if (s == JAVA_CLASS_PATH) {
          // maybe we should just use vm.classpath
          // NOTE: the curent classloader at the point it has to be a system classloader.
          ClassPath cp = ClassLoaderInfo.getCurrentClassLoader().getClassPath();
          // <2do> should be consistent with path.separator (this is host VM notation)
          v = cp.toString();
          
        } else { // we bluntly grab it from the host VM properties
          v = System.getProperty(s);
        }
      }
            
      if (v != null){
        env.setReferenceArrayElement(ctx,aref, i++, new One<>(env.newString(ctx, s)));
        env.setReferenceArrayElement(ctx,aref, i++, new One<>(env.newString(ctx, v)));
      }
    }
        
    return aref;
  }

  /**
   * policy of how to initialize system properties of the system under test
   */
  static enum SystemPropertyPolicy {
    SELECTED,  // copy host values for keys specified in  
    FILE, 
    HOST
  };

  @MJI
  public int getKeyValuePairs_____3Ljava_lang_String_2 (MJIEnv env, int clsObjRef, FeatureExpr ctx){
    Config conf = env.getConfig();
    SystemPropertyPolicy sysPropSrc = conf.getEnum( "vm.sysprop.source", SystemPropertyPolicy.values(), SystemPropertyPolicy.SELECTED);

    if (sysPropSrc == SystemPropertyPolicy.FILE){
      return getSysPropsFromFile(env, ctx);
    } else if (sysPropSrc == SystemPropertyPolicy.HOST){
      return getSysPropsFromHost(env, ctx);
    } else if (sysPropSrc == SystemPropertyPolicy.SELECTED){
      return getSelectedSysPropsFromHost(env, ctx);
    }
    
    return 0;
  }
  
  // <2do> - this break every app which uses time delta thresholds
  // (sort of "if ((t2 - t1) > d)"). Ok, we can't deal with
  // real time, but we could at least give some SystemState dependent
  // increment
  @MJI
  public long currentTimeMillis____J (MJIEnv env, int clsObjRef, FeatureExpr ctx) {
    return env.currentTimeMillis();
  }

  // <2do> - likewise. Java 1.5's way to measure relative time
  @MJI
  public long nanoTime____J (MJIEnv env, int clsObjRef, FeatureExpr ctx) {
    return env.nanoTime();
  }  
  
  // this works on the assumption that we sure break the transition, and
  // then the search determines that it is an end state (all terminated)
  @MJI
  public void exit__I__V (MJIEnv env, int clsObjRef, int ret, FeatureExpr ctx) {
    ThreadInfo ti = env.getThreadInfo();
    env.getVM().terminateProcess(ti);
  }

  @MJI
  public void gc____V (MJIEnv env, int clsObjRef, FeatureExpr ctx) {
    env.getSystemState().activateGC();
  }

  @MJI
  public Conditional<Integer> identityHashCode__Ljava_lang_Object_2__I (MJIEnv env, int clsObjRef, Conditional<Integer> objref, FeatureExpr ctx) {
	return objref.map(new Function<Integer, Integer>() {

		@Override
		public Integer apply(Integer objref) {
			return (objref ^ 0xABCD);
		}
		
	}); 
    
  }
  
}
