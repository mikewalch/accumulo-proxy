/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.accumulo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.nio.ByteBuffer;
import java.util.Properties;

import org.apache.accumulo.proxy.Proxy;
import org.apache.accumulo.proxy.TestProxyClient;
import org.apache.accumulo.proxy.thrift.UserPass;
import org.apache.thrift.TException;
import org.apache.thrift.server.TServer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestProxyInstanceOperations {
  protected static TServer proxy;
  protected static Thread thread;
  protected static TestProxyClient tpc;
  protected static UserPass userpass;
  protected static final int port = 10197;
  
  @BeforeClass
  public static void setup() throws Exception {
    Properties prop = new Properties();
    prop.setProperty("org.apache.accumulo.proxy.ProxyServer.useMockInstance", "true");
    
    proxy = Proxy.createProxyServer(Class.forName("org.apache.accumulo.proxy.thrift.AccumuloProxy"),
        Class.forName("org.apache.accumulo.proxy.ProxyServer"), port, prop);
    thread = new Thread() {
      @Override
      public void run() {
        proxy.serve();
      }
    };
    thread.start();
    tpc = new TestProxyClient("localhost", port);
    userpass = new UserPass("root", ByteBuffer.wrap("".getBytes()));
  }
  
  @AfterClass
  public static void tearDown() throws InterruptedException {
    proxy.stop();
    thread.join();
  }
  
  @Test
  public void properties() throws TException {
    tpc.proxy().instanceOperations_setProperty(userpass, "test.systemprop", "whistletips");
    
    assertEquals(tpc.proxy().instanceOperations_getSystemConfiguration(userpass).get("test.systemprop"), "whistletips");
    tpc.proxy().instanceOperations_removeProperty(userpass, "test.systemprop");
    assertNull(tpc.proxy().instanceOperations_getSystemConfiguration(userpass).get("test.systemprop"));
    
  }
  
  @Test
  public void testClassLoad() throws TException {
    assertTrue(tpc.proxy().instanceOperations_testClassLoad(userpass, "org.apache.accumulo.core.iterators.user.RegExFilter",
        "org.apache.accumulo.core.iterators.Filter"));
  }
  
}
