package on_the_fly;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

public class StringTest extends TestJPF {

  private final static String[] JPF_ARGS = { "+nhandler.spec.delegate=java.lang.String.*" };

  public static void main (String[] args){
    runTestsOfThisClass(args);
  }

  @Test
  public void testEquals (){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      assertFalse("JPF-NHANDLER".equals("jpf-nhandler"));
      assertTrue("jpf-nhandler".equals("jpf-nhandler"));
      assertTrue("".equals(""));
      assertFalse("".equals(null));
    }
  }

  @Test
  public void testEqualsIgnoreCase (){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      assertTrue("JPF-NHANDLER".equalsIgnoreCase("jpf-nhandler"));
      assertTrue("jpf-NHANDLER".equalsIgnoreCase("JPF-nhandler"));
    }
  }

  @Test
  public void testToCharArray (){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      char[] array1 = "hello".toCharArray();
      char[] array2 = new char[] { 'h', 'e', 'l', 'l' };
      for (int i = 0; i < array2.length; i++){
        assertEquals(array1[i], array2[i]);
      }
    }
  }

  @Test
  public void testIndexOf (){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      String name = "nastaran";
      assertEquals(name.indexOf("a"), 1);
      assertEquals(name.indexOf("m"), -1);
      assertEquals(name.indexOf('x'), -1);
      assertEquals(name.indexOf('s', 3), -1);
      assertEquals(name.indexOf("tar"), 3);
      assertEquals(name.indexOf(""), 0);
    }
  }

  @Test
  public void testLastIndexOf (){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      String name = "nastaran";
      assertEquals(3, name.lastIndexOf("t"));
      assertEquals(-1, name.lastIndexOf("t", 2));
    }
  }

  @Test
  public void testMatches (){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      assertFalse("aaabbb".matches("b*"));
      assertFalse("aaabbb".matches("b+"));
      assertFalse("aaabbb".matches(""));
      assertTrue("abbb".matches("a.*b"));
    }
  }

  @Test
  public void testGetBytes (){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      String str = "Hello World!";
      byte[] bytes = str.getBytes();
      assertEquals(str.length(), bytes.length);
      for (int i = 0; i < str.length(); ++i){
        assertEquals((byte) str.charAt(i), bytes[i]);
      }
    }
  }

  @Test
  public void testToUpperCase (){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      assertEquals("JPF-NHANDLER", "jpf-nhandler".toUpperCase());
      assertEquals("JPF-NHANDLER", "jpf-NHAndler".toUpperCase());
    }
  }

  @Test
  public void testToLowerCase (){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      assertEquals("jpf-nhandler", "JPF-NHANDLER".toLowerCase());
      assertEquals("jpf-nhandler", "jpf-NHANdLeR".toLowerCase());
    }
  }

  @Test
  public void testSplit (){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      String str = "aaa:bbb:ccc";
      String[] splited = str.split(":");
      assertEquals(splited.length, 3);
      assertEquals(splited[0], "aaa");
      assertEquals(splited[1], "bbb");
      assertEquals(splited[2], "ccc");
    }
  }

  @Test
  public void testTrim (){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      assertEquals(" hello ".trim(), "hello");
    }
  }

  @Test
  public void testConcat (){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      assertEquals("aaa".concat("bbb"), "aaabbb");
    }
  }

  @Test
  public void testReplace (){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      assertEquals("ababa".replace("a", "b"), "bbbbb");
      assertEquals("b b b".replace(' ', 'b'), "bbbbb");
    }
  }

  @Test
  public void testIntern (){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      String str1 = String.valueOf(new char[] { 'h', 'e', 'l', 'l', 'o'});
      String str2 = String.valueOf(new char[] { 'h', 'e', 'l', 'l', 'o'});
      assertTrue(str1.equals(str2));
      // Note that in reality str1.intern()==str2.intern() but due
      // to nhandler limitation we end up with just equal strings
      assertEquals(str1.intern(), str2.intern());
    }
  }
}