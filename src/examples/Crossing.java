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
/**
 * This is the famous Bridge-crossing puzzle. The aim is to see what the minimum
 * amount of time is for 4 people to cross with flash-light (torch): 10.5.2.1.
 * The answer is 17 for the given configuration.
 *
 * Purpose of this example is to show how to use the 'Verify' API in test
 * applications (usually drivers)
 *
 * One can find this solution with JPF in BFS search mode - DFS will not
 * work since this is an infinite-state program (time keeps increasing).
 *
 * If one uses the ignoreIf(cond) call the branches that will lead to
 * solutions worst than the current will be cut-off and this will allow
 * DFS also to complete - and BFS to terminate faster.
 *
 * When setting the native flag in main one can also save information
 * from one run to the next using JPF's native peer methods -
 * see JPF_Crossing.java for the code of getTotal() and setTotal(int).
 */

import gov.nasa.jpf.vm.Verify;

enum Side { LEFT, RIGHT }

class Bridge {

  Side torchSide;
  Person[] onBridge = new Person[2];
  int numOnBridge = 0;

  public Bridge (Side torchSide){
    this.torchSide = torchSide;
  }

  void moveTorch(){
    if (torchSide == Side.LEFT){
      torchSide = Side.RIGHT;
    } else {
      torchSide = Side.LEFT;
    }
  }
  
  public int cross() {
    int time = 0;
    moveTorch();

    if (numOnBridge == 1) {
      onBridge[0].side = torchSide;
      time = onBridge[0].timeToCross;

    //System.out.println("Person " + onBridge[0] +
    //                     " moved to " + Torch.side +
    //               " in time " + time);
    } else {
      onBridge[0].side = torchSide;
      onBridge[1].side = torchSide;

      if (onBridge[0].timeToCross > onBridge[1].timeToCross) {
        time = onBridge[0].timeToCross;
      } else {
        time = onBridge[1].timeToCross;
      }

    //System.out.println("Person " + onBridge[0] +
    //                 " and Person " + onBridge[1] +
    //                 " moved to " + Torch.side +
    //                 " in time " + time);
    }

    return time;
  }

  public void clearBridge() {
    numOnBridge = 0;
    onBridge[0] = null;
    onBridge[1] = null;
  }
  
  boolean isFull(){
    return numOnBridge == 2;
  }
  
  boolean arePersonsOnBridge(){
    return numOnBridge > 0;
  }
  
  boolean isPersonOnBridge (Person p){
    return (p == onBridge[0] || p == onBridge[1]);
  }

  void putPersonOnBridge (Person p){
    onBridge[numOnBridge++] = p;
  }  
}

class Person {
  String name;
  Side side;
  int timeToCross;

  public Person(String name, int timeToCross) {
    this.timeToCross = timeToCross;
    this.name = name;
  }

  public void tryToMove (Bridge bridge) {
    if (side == bridge.torchSide) {
      if (!Verify.getBoolean()) {
        if (! (bridge.isFull() || bridge.isPersonOnBridge(this))){
          bridge.putPersonOnBridge(this);
        }
      }
    }
  }
  
  public String toString(){
    return name;
  }
}

public class Crossing {

  Bridge bridge;
  Person[] persons;
  int elapsedTime;
  Side initialSide;
  
  public Crossing (Person[] persons, Side initialSide){
    this.persons = persons;
    for (Person p : persons){
      p.side = initialSide;
    }
    
    this.bridge = new Bridge( initialSide);
    this.initialSide = initialSide;
  }
  
  boolean haveAllPersonsCrossed (){
    for (Person p : persons){
      if (p.side == initialSide){
        return false;
      }
    }
    
    return true;
  }
  
  void solve (){
    printPersons();
    System.out.println();
    printCrossingState();
    //Verify.setCounter(0, Integer.MAX_VALUE);
      
    while (!haveAllPersonsCrossed()){
      for (Person p : persons){
        p.tryToMove(bridge);
      }

      if (bridge.arePersonsOnBridge()) {
        elapsedTime += bridge.cross();

        //Verify.ignoreIf(elapsedTime >= Verify.getCounter(0));
        //Verify.ignoreIf(elapsedTime > 17); //with this DFS will also find error

        bridge.clearBridge();
      }
      
      printCrossingState();      
    }
    
    
    System.out.println("total time = " + elapsedTime);
    
    //Verify.setCounter(0, elapsedTime); // new minimum
    Verify.printPathOutput("done");
    Verify.storeTraceAndTerminateIf(elapsedTime == 17, null, null);
    //assert (elapsedTime > 17);
  }
  
  String personsOnSide (Side side){
    int n=0;
    StringBuilder sb = new StringBuilder();
    for (Person p : persons){
      if (p.side == side){
        if (n++ > 0){
          sb.append(',');
        }
        sb.append( p);
      }
    }
    return sb.toString();
  }
  
  String torchSymbol (Side side){
    if (bridge.torchSide == side){
      return "*";
    } else {
      return " ";
    }
  }
  
  void printPersons(){
    for (Person p : persons){
      System.out.printf("%10s needs %2d min to cross\n", p.name, p.timeToCross);
    }
  }
  
  void printCrossingState (){
    System.out.printf("%20s %s====%s %-20s : elapsed time=%d\n",
            personsOnSide(Side.LEFT), torchSymbol(Side.LEFT),
            torchSymbol(Side.RIGHT), personsOnSide(Side.RIGHT), elapsedTime);
  }
  
  public static void main(String[] args) {
    Person[] persons = {
      new Person("Bill", 1),
      new Person("Xoe", 2),
      new Person("Sue", 5),
      new Person("Joe", 10)
    };

    Crossing crossing = new Crossing( persons, Side.LEFT);
    crossing.solve();
  }
}
