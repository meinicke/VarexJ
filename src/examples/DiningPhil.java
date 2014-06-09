

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

public class DiningPhil {

  static class Fork {
  }

  static class Philosopher extends Thread {

    Fork left;
    Fork right;

    public Philosopher(Fork left, Fork right) {
      this.left = left;
      this.right = right;
      //start();
    }

    public void run() {
      // think!
      synchronized (left) {
        synchronized (right) {
          // eat!
        }
      }
    }
  }
  
  static int nPhilosophers = 6;

  public static void main(String[] args) {
    if (args.length > 0){
      nPhilosophers = Integer.parseInt(args[0]);
    }
    
    //Verify.beginAtomic();
    Fork[] forks = new Fork[nPhilosophers];
    for (int i = 0; i < nPhilosophers; i++) {
      forks[i] = new Fork();
    }
    for (int i = 0; i < nPhilosophers; i++) {
      Philosopher p = new Philosopher(forks[i], forks[(i + 1) % nPhilosophers]);
      p.start();
    }
    //Verify.endAtomic();
  }
}