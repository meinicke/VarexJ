/* 
 * Copyright (C) 2013  Nastaran Shafiei and Franck van Breugel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You can find a copy of the GNU General Public License at
 * <http://www.gnu.org/licenses/>.
 */

import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.ReceiverAdapter;
import org.jgroups.View;

public class SimpleReciever extends ReceiverAdapter {
  JChannel channel;

  String user_name = System.getProperty("user.name", "n/a") + "-" + "sender";

  private void start () throws Exception {
    channel = new JChannel();
    channel.setReceiver(this);
    // joining a cluster
    channel.connect("SimpleCluster");
  }

  private void sendMessage (String text) {
    String line = "[" + user_name + "] " + text;
    Message msg = new Message(null, null, line);
    try {
      channel.send(msg);
    } catch (Exception e) {
      System.out.println("Sending failed!");
    }
  }

  // The viewAccepted() callback is called whenever a new instance
  // joins the cluster, or an existing instance leaves (crashes included)
  public void viewAccepted (View new_view) {
    System.out.println("** view: " + new_view);
  }

  boolean sent = false;

  public void receive (Message msg) {
    String recievedMsg = msg.getObject().toString();
    System.out.println(msg.getSrc() + ": " + recievedMsg);

    if (recievedMsg.contains("Is any body out there?")) {
      //sendMessage("I am here!");
      System.out.println("Recieved it!");
      channel.close();
    }
  }

  public static void main (String[] args) throws Exception {
    // This allows Java applications to connect too, and accept connections
    // from, both IPv4 and IPv6 hosts.
    System.setProperty("java.net.preferIPv4Stack", "true");

    new SimpleReciever().start();
  }
}
