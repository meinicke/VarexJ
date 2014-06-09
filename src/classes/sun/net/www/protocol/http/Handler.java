//
// Copyright (C) 2010 United States Government as represented by the
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
package sun.net.www.protocol.http;

import gov.nasa.jpf.CachedROHttpConnection;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.Proxy;
import java.net.URL;

/**
 * replaced handler to support configured URLConnection classes
 */
public class Handler extends java.net.URLStreamHandler {

  protected String proxy;
  protected int proxyPort;

  public Handler() {
    proxy = null;
    proxyPort = -1;
  }

  public Handler(String proxy, int port) {
    this.proxy = proxy;
    this.proxyPort = port;
  }

  protected int getDefaultPort() {
    return 80;
  }


  static Class<?>[] argTypes = { URL.class, Proxy.class };
  private native Class<? extends java.net.URLConnection> getConnectionClass(String url);

  
  protected java.net.URLConnection openConnection (URL u, Proxy p) throws IOException {

    Class<? extends java.net.URLConnection> clazz = getConnectionClass(u.toString());

    if (clazz != null){
      try {
        Constructor<? extends java.net.URLConnection> ctor = clazz.getConstructor(argTypes);
        return ctor.newInstance(u, p);

      } catch (NoSuchMethodException nmx){
        throw new IOException("connection class has no suitabe ctor: " + clazz.getName());
      } catch (IllegalAccessException iax){
        throw new IOException("connection class has no public ctor: " + clazz.getName());
      } catch (InvocationTargetException itx){
        throw new IOException("exception initializing URLConnection", itx);
      } catch (InstantiationException ix){
        throw new IOException("connection class cannot be instantiated: " + clazz.getName());
      }

    } else {
      // we just go with the standard thing, hoping that we have a modeled Socket layer
      return new CachedROHttpConnection(u, p, this);
    }
  }

  protected java.net.URLConnection openConnection(URL u) throws IOException {
    return openConnection(u, null);
  }

  //... and a lot of methods still missing
}
