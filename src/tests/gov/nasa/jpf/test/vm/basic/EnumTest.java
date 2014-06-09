package gov.nasa.jpf.test.vm.basic;

import java.util.EnumSet;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

public class EnumTest extends TestJPF {

  //--- helper type
  enum A {
    ONE,
    TWO;
  }

  
  @Test
  public void testValueOf () {
    if (verifyNoPropertyViolation()) {
      assert A.valueOf("ONE") == A.ONE;
    }
  }

  @Test
  public void testEnumerate () {
    if (verifyNoPropertyViolation()){
      boolean[] seen = new boolean[2];

      for (A a : A.values()) {
        switch (a) {
          case ONE:
            System.out.println("this is ONE");
            break;
          case TWO:
            System.out.println("this is TWO");
            break;
          default:
            throw new RuntimeException("unknown enumeration constant");
        }
        seen[a.ordinal()] = true;
      }

      for (boolean b : seen){
        assert b : "unseen enum constant";
      }
    }
  }

  enum Option {
    A
  }

  @Test
  public void testEnumSet() {
    
    if (verifyNoPropertyViolation()){
      //Option o = Option.A; // <2do> init missing
      
      EnumSet<Option> options = EnumSet.allOf(Option.class);

      for (Option option : options) {
        System.out.println(option);
        assert option != null;
      }
    }
  }
  
}

