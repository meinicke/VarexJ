package gov.nasa.jpf.util;

import java.util.HashSet;
import java.util.Random;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;
import static gov.nasa.jpf.util.OATHash.*;

/**
 * just the very basic sanity checks for a hash function.
 * <2do> should add a test for uniformity of hash vals and measure collisions in medium bin size constraints
 */
public class OATHashTest extends TestJPF {

  @Test
  public void testRandom(){
    int maxRounds = 256;
    int maxKey = 8;
    Random r = new Random(42);
    HashSet<Integer> seen = new HashSet<Integer>(); // not very smart, but the number of rounds is reasonably small
    
    for (int i=0; i<maxRounds; i++){
      int h = 0;
      for (int j=0; j<maxKey; j++){
        int x = r.nextInt();
        h = hashMixin(h, x);
        
        if (j>0){
          System.out.print(',');
        }
        System.out.print(Integer.toHexString(x));
      }
      h = hashFinalize(h);
      System.out.print(" => ");
      System.out.println(h);
      
      if (seen.contains(h)){
        fail("collision on round " + i);
      }
      seen.add(h);
    }
  }
  
  @Test
  public void testRandomSmall(){
    int maxRounds = 256;
    int maxKey = 4;
    int maxVal = 32;
    Random r = new Random(42);
    HashSet<Integer> seen = new HashSet<Integer>(); // not very smart, but the number of rounds is reasonably small
    
    for (int i=0; i<maxRounds; i++){
      int h = 0;
      for (int j=0; j<maxKey; j++){
        int x = r.nextInt(maxVal);
        h = hashMixin(h, x);
        
        if (j>0){
          System.out.print(',');
        }
        System.out.print(x);
      }
      h = hashFinalize(h);
      System.out.print(" => ");
      System.out.println(h);
      
      if (seen.contains(h)){
        fail("collision on round " + i);
      }
      seen.add(h);
    }
  }
  
}
