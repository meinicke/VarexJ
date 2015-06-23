package cmu;

import gov.nasa.jpf.vm.Verify;
import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

/**
 * This test shows a case where normal JPF terminates with a OutOfMemory-Exception and jpf-bdd does not.
 * In fact jpf-bdd is finished after less than a second.
 * 
 * I switched the testing with normal jpf off, because i want to keep this class with the normal unit-Tests and 
 * the run with normal JPF takes about 10 minutes. 
 * 
 * @author rhein
 *
 */
public class OutOfMemory_ComparisonTest extends TestJPF {
	private static final String[] JPF_BDD = {"+search.class= .search.RandomSearch", "+choice=MapChoice"};
	private static final String[] NO_BDD = {"+search.class=gov.nasa.jpf.search.heuristic.BFSHeuristic"
			 ,"+jvm.insn_factory.class=gov.nasa.jpf.jvm.bytecode.InstructionFactory"
			 //,"vm.class=gov.nasa.jpf.jvm.JVM"
		};
	
	static boolean testBDD = true;
	static boolean testNoBDD = false;
	
@Conditional
static boolean a1 = true;
@Conditional
static boolean a2 = true;
@Conditional
static boolean a3 = true;
@Conditional
static boolean a4 = true;
@Conditional
static boolean a5 = true;
@Conditional
static boolean a6 = true;
@Conditional
static boolean a7 = true;
@Conditional
static boolean a8 = true;
@Conditional
static boolean a9 = true;
@Conditional
static boolean a10 = true;
@Conditional
static boolean a11 = true;
@Conditional
static boolean a12 = true;
@Conditional
static boolean a13 = true;
@Conditional
static boolean a14 = true;
@Conditional
static boolean a15 = true;
@Conditional
static boolean a16 = true;
@Conditional
static boolean a17 = true;
@Conditional
static boolean a18 = true;
@Conditional
static boolean a19 = true;
@Conditional
static boolean a20 = true;
@Conditional
static boolean a21 = true;
@Conditional
static boolean a22 = true;
@Conditional
static boolean a23 = true;
@Conditional
static boolean a24 = true;
@Conditional
static boolean a25 = true;
@Conditional
static boolean a26 = true;
@Conditional
static boolean a27 = true;
@Conditional
static boolean a28 = true;
@Conditional
static boolean a29 = true;
	
	@Test
	public void timingTest() throws Throwable {
		
		boolean OOMwithBDD = false;
		if (testBDD) {
			try {
				executeJPF_Bdd();
			} catch (Throwable t) {
				if (t.getMessage().contains("gov.nasa.jpf.jvm.NoOutOfMemoryErrorProperty")
						|| t.getMessage().contains("Java heap space")) {
					OOMwithBDD = true;
					t.printStackTrace();
				}
			}
		}
		
		
		
	}
	
	@Test
	public void executeJPF_no_bdd() {
		//if (verifyAssertionErrorDetails("some details", NO_BDD)) {
		if(verifyNoPropertyViolation(NO_BDD)) {
			testFunction_no_bdd();
		}
		if (isJPFRun()) 
			System.exit(0);
	}
	@Test
	public void executeJPF_Bdd() {
		if(verifyNoPropertyViolation(JPF_BDD)) {
			testFunction_bdd();
		}
		if (isJPFRun()) 
			System.exit(0);
	}
	public void testFunction_no_bdd() {
		@SuppressWarnings("unused")
		int i = 0;
		//LinkedList<Boolean> list = new LinkedList<Boolean>();
		if (a1 = Verify.getBoolean()) {i++;/* list.add(a1); */}
		if (a2 = Verify.getBoolean()) {i++;/* list.add(a2); */}
		if (a3 = Verify.getBoolean()) {i++;/* list.add(a3); */}
		if (a4 = Verify.getBoolean()) {i++;/* list.add(a4); */}
		if (a5 = Verify.getBoolean()) {i++;/* list.add(a5); */}
		if (a6 = Verify.getBoolean()) {i++;/* list.add(a6); */}
		if (a7 = Verify.getBoolean()) {i++;/* list.add(a7); */}
		if (a8 = Verify.getBoolean()) {i++;/* list.add(a8); */}
		if (a9 = Verify.getBoolean()) {i++;/* list.add(a9); */}
		if (a10 = Verify.getBoolean()){i++;/* list.add(a10); */}
		if (a11 = Verify.getBoolean()){i++;/* list.add(a11); */}
		if (a12 = Verify.getBoolean()){i++;/* list.add(a12); */}
		if (a13 = Verify.getBoolean()){i++;/* list.add(a13); */}
		if (a14 = Verify.getBoolean()){i++;/* list.add(a14); */}    
		if (a15 = Verify.getBoolean()){i++;/* list.add(a15); */}
		if (a16 = Verify.getBoolean()){i++;/* list.add(a16); */}
		if (a17 = Verify.getBoolean()){i++;/* list.add(a17); */}
		if (a18 = Verify.getBoolean()){i++;/* list.add(a18); */}
		if (a19 = Verify.getBoolean()){i++;/* list.add(a19); */}
		if (a20 = Verify.getBoolean()){i++;/* list.add(a20); */} 
		if (a21 = Verify.getBoolean()){i++;/* list.add(a21); */} 	
		if (a22 = Verify.getBoolean()){i++;/* list.add(a22); */} 	
		if (a23 = Verify.getBoolean()){i++;/* list.add(a23); */}
		if (a24 = Verify.getBoolean()){i++;/* list.add(a24); */}
		if (a25 = Verify.getBoolean()){i++;/* list.add(a25); */} 	
		if (a26 = Verify.getBoolean()){i++;/* list.add(a26); */} 	
		if (a27 = Verify.getBoolean()){i++;/* list.add(a27); */} 	
		if (a28 = Verify.getBoolean()){i++;/* list.add(a28); */} 	
		if (a29 = Verify.getBoolean()){i++;/* list.add(a29); */}
		System.out.println(i);
	}                                  
	public void testFunction_bdd() {
		int i = 0;
		//LinkedList<Boolean> list = new LinkedList<Boolean>();
		if (a1)  {i++;/* list.add(a1); */}
		if (a2)  {i++;/* list.add(a2); */}
		if (a3)  {i++;/* list.add(a3); */}
		if (a4)  {i++;/* list.add(a4); */}
		if (a5)  {i++;/* list.add(a5); */}
		if (a6)  {i++;/* list.add(a6); */}
		if (a7)  {i++;/* list.add(a7); */}
		if (a8)  {i++;/* list.add(a8); */}
		if (a9)  {i++;/* list.add(a9); */}
		if (a10) {i++;/* list.add(a10); */}
		if (a11) {i++;/* list.add(a11); */}
		if (a12) {i++;/* list.add(a12); */}
		if (a13) {i++;/* list.add(a13); */}
		if (a14) {i++;/* list.add(a14); */}
		if (a15) {i++;/* list.add(a15); */}
		if (a16) {i++;/* list.add(a16); */}
		if (a17) {i++;/* list.add(a17); */}
		if (a18) {i++;/* list.add(a18); */}
		if (a19) {i++;/* list.add(a19); */}
		if (a20){i++;/* list.add(a20);*/}
		if (a21){i++;/* list.add(a21);*/}
		if (a22){i++;/* list.add(a22);*/}
		if (a23){i++;/* list.add(a23);*/}
		if (a24){i++;/* list.add(a24);*/}
		if (a25){i++;/* list.add(a25);*/}
		if (a26){i++;/* list.add(a26);*/}
		if (a27){i++;/* list.add(a27);*/}
		if (a28){i++;/* list.add(a28);*/}
		if (a29){i++;/* list.add(a29);*/}
		//Debug.printBDDshort(); //works, but the bdds get too long for console printout
		System.out.println("fin");
		System.out.println(i);
		i++;
		System.out.println("fin2");
		System.out.println(i);
	}   		 
}       		 