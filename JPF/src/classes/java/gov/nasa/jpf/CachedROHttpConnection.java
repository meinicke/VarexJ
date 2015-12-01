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

package gov.nasa.jpf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;

import sun.net.www.protocol.http.Handler;

/**
 * this is just a very rough abstraction at this point, which only supports
 * reading static URL contents. The data is cached for subsequent
 * access, to avoid DOS by means of model checking
 */
public class CachedROHttpConnection extends java.net.HttpURLConnection {

  @Override
  public void disconnect() {
    //throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public boolean usingProxy() {
    return false;
  }

  @Override
  public void connect() throws IOException {
    //throw new UnsupportedOperationException("Not supported yet.");
  }

  String host;
  int port;

  public CachedROHttpConnection(URL u, String host, int port){
    super(u);

    this.host = host;
    this.port = port;
  }

  public CachedROHttpConnection(URL u, Proxy p, Handler handler){
    super(u);
  }

  public CachedROHttpConnection(URL u, Proxy p) {
    this (u, p, new Handler());
  }

  protected CachedROHttpConnection(URL u, Handler handler)  throws IOException {
    this(u, null, handler);
  }



  private native byte[] getContents(String url);

  public synchronized InputStream getInputStream() throws IOException {
    byte[] data = getContents(url.toString());
    return new ByteArrayInputStream(data);
  }


}
