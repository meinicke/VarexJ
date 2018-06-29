package cmu.datastructures;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import org.junit.Test;

import cmu.conditional.ChoiceFactory.Factory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.va.HybridStackHandler;
import gov.nasa.jpf.vm.va.HybridStackHandler.LiftedStack;
import gov.nasa.jpf.vm.va.HybridStackHandler.NormalStack;
import gov.nasa.jpf.vm.va.IStackHandler;
import gov.nasa.jpf.vm.va.IStackHandler.Type;
import gov.nasa.jpf.vm.va.StackHandlerFactory;
import gov.nasa.jpf.vm.va.StackHandlerFactory.SHFactory;

public class DifferentialStackTest {

	static {
		Conditional.setFM("");
		FeatureExprFactory.setDefault(FeatureExprFactory.bdd());
	}
	
	private static final FeatureExpr TRUE = FeatureExprFactory.True();

	private static final FeatureExpr A = Conditional.createFeature("A");
	private static final boolean DEBUG = false;

	private final List<Object[]> stackHandlers = new ArrayList<>();

	public DifferentialStackTest() {

		for (SHFactory shFactory : SHFactory.values()) {
			if (shFactory == SHFactory.Hybid) {
				for (LiftedStack liftedStack : LiftedStack.values()) {
					for (NormalStack normalStack : NormalStack.values()) {
						stackHandlers.add(new Object[] { shFactory, liftedStack, normalStack });
					}
				}
			} else {
				stackHandlers.add(new Object[] { shFactory, null, null, Factory.MapChoice });
			}
		}
	}

	private void differentalTest(Supplier<Object> action) {
		Object result = null;
		for (Object[] params : stackHandlers) {
			setStackHandler(params);
			if (DEBUG) {
				System.out.println(Arrays.toString(params));
			}
			final Object execute = action.get();

			if (result == null) {
				result = execute;
			} else if (result.getClass().isArray()){
				if (result.getClass() == int[].class) {
					assertArrayEquals((int[])result, (int[])execute);
				} else {
					throw new RuntimeException(result.getClass() + " not implemented");
				}
			} else {
				assertEquals(result, execute);
			}
		}
		assertNotNull(result);
	}

	public void setStackHandler(Object[] params) {
		int i = 0;
		final SHFactory shFactory = (SHFactory) params[i++];
		final LiftedStack liftedStack = (LiftedStack) params[i++];
		final NormalStack normalStack = (NormalStack) params[i++];

		StackHandlerFactory.setFactory(shFactory);

		if (normalStack != null) {
			HybridStackHandler.normalStack = normalStack;
		}
		if (liftedStack != null) {
			HybridStackHandler.liftedStack = liftedStack;
		}

	}

	@Test
	public void TestClone() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.push(TRUE, 42, true);
			sh.push(TRUE, 1337, false);
			sh.storeOperand(TRUE, 0);
			return sh.equals(sh.clone());
		});
	}

	@Test
	public void TestDup() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 0, 2);
			sh.push(TRUE, 42);
			sh.dup(TRUE);
			return sh.popLong(TRUE);
		});
	}

	@Test
	public void TestDup_x1() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 0, 4);
			sh.push(TRUE, 42);
			sh.push(TRUE, 1337);
			sh.dup_x1(TRUE);
			return sh.popLong(TRUE);
		});
	}

	@Test
	public void TestDup_x2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 0, 4);
			sh.push(TRUE, 42);
			sh.push(TRUE, 1337);
			sh.push(TRUE, 1_123_456);
			sh.dup_x2(TRUE);
			sh.pop(TRUE);
			return sh.popLong(TRUE);
		});
	}

	@Test
	public void TestDup2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 0, 4);
			sh.push(TRUE, 42);
			sh.push(TRUE, 1337);
			sh.dup2(TRUE);
			return sh.popLong(TRUE);
		});
	}

	@Test
	public void TestDup2_x1() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 0, 5);
			sh.push(TRUE, 42);
			sh.push(TRUE, 1337);
			sh.push(TRUE, 1_123_456);
			sh.dup2_x1(TRUE);
			sh.pop(TRUE);
			return sh.popLong(TRUE);
		});
	}

	@Test
	public void TestDup2_x2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 0, 6);
			sh.push(TRUE, 42);
			sh.push(TRUE, 1337);
			sh.push(TRUE, 1_123_456);
			sh.push(TRUE, 3000);
			sh.dup2_x2(TRUE);
			sh.pop(TRUE);
			return sh.popLong(TRUE);
		});
	}

	@Test
	public void TestEquals() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			List<Object> returns = new ArrayList<>();
			returns.add(sh.equals(sh));
			returns.add(sh.equals(null));
			returns.add(sh.equals(1));
			IStackHandler sh2 = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh2.push(TRUE, 1);
			returns.add(sh.equals(sh2));
			IStackHandler sh3 = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh3.setLocal(TRUE, 1, 2, true);
			returns.add(sh.equals(sh3));
			IStackHandler sh4 = StackHandlerFactory.createStack(TRUE, 9, 11);
			returns.add(sh.equals(sh4));
			IStackHandler sh5 = StackHandlerFactory.createStack(TRUE, 1,1);
			returns.add(sh.equals(sh5));
			return returns;
		});
	}

	@Test
	public void TestGetAllReferences() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.setLocal(TRUE,1,0,true);
			return sh.getAllReferences();
		});
	}

	@Test
	public void TestGetAllReferences2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.IINC(TRUE,0,1);
			sh.setCtx(A.not());
			return sh.getSlots(TRUE);
		});
	}

	@Test
	public void TestGetLocal() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.getLocal(0);
			return -1;
		});
	}

	@Test
	public void TestGetMaxLocal() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.getMaxLocal();
			return 1;
		});
	}

	@Test
	public void TestGetSlots() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			int[] slots = sh.getSlots(TRUE);
			sh.push(TRUE,One.valueOf(42),true);
			return slots;
		});
	}

	@Test
	public void TestGetSlots2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 3, 3);
			sh.push(TRUE,One.valueOf(42));
			try {
				sh.popLong(TRUE);
			} catch (Exception e) {
			} catch (Error e) {
			}
			return sh.getSlots(TRUE);
		});
	}

	@Test
	public void TestGetSlots3() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.IINC(A.not(),1,1);
			return sh.getSlots(A);
		});
	}

	@Test
	public void TestGetSlots4() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.setLocal(TRUE,0,1,true);
		    sh.setCtx(A.not());
		    return sh.getSlots(A);
		});
	}

	@Test
	public void TestHasAnyRef() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 3, 3);
			sh.push(TRUE,One.valueOf(42),true);
			return sh.hasAnyRef(TRUE);
		});
	}

	@Test
	public void TestHashCode() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.hashCode();
			return -1;
		});
	}

	@Test
	public void TestIsRef() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.push(TRUE, One.valueOf(42), true);
			return sh.isRef(TRUE, 0);
		});
	}

	@Test
	public void TestIsRef2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.push(TRUE, new One<>(1));
			try {
				sh.pop(TRUE,Type.LONG);
			} catch (Throwable e) {
			}
			sh.pushLocal(TRUE,0);
			return sh.isRef(TRUE,1);
		});
	}
	
	@Test
	public void TestLocalWidth() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.getLocalWidth();
			return 1;
		});
	}
	
	@Test
	public void TestPeek() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.pushLocal(A,1);
			sh.setCtx(A);
			try {
				return sh.peek(A.not());
			} catch (Throwable e) {
				return -1;
			}
		});
	}
	
	
	@Test
	public void TestPeekDouble() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.push(TRUE,One.valueOf(42),true);
			return sh.peekDouble(TRUE,0);
		});
	}
	
	@Test
	public void TestPeekFloat() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 3, 3);
			sh.pushLongLocal(TRUE,1);
			return sh.peekFloat(TRUE,1);
		});
	}
	
	@Test
	public void TestPeekFloat2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.getLength();
			sh.push(TRUE, new One<>(0.850660968358656));
			sh.setCtx(A.not());
			sh.set(A.not(),0,0,false);
			return sh.peekFloat(TRUE,0);
		});
	}
	
	@Test
	public void TestPeekLong() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.push(TRUE,One.valueOf(42));
			return sh.peekLong(TRUE,0);
		});
	}
	
	@Test
	public void TestPeekLong2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.pushLongLocal(TRUE,0);
			return sh.peekLong(TRUE,0);
		});
	}
	
	@Test
	public void TestPeekLong3() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.push(TRUE, new One<>(4415632693732573881l));
			sh.storeLongOperand(A.not(),0);
			return sh.peekLong(TRUE,0);
		});
	}
	
	@Test
	public void TestPop() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.setLocal(A,1,1,true);
			try {
				sh.pushLocal(A.not(),1);
			} catch (Throwable e) {
				return -1;
			}
			return sh.pop(A.not(),Type.INT);
		});
	}
	
	@Test
	public void TestPop2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.setCtx(A.not());
			sh.IINC(A,1,1);
			sh.getLength();
			sh.pushLongLocal(TRUE,1);
			return sh.pop(A.not(),Type.LONG);
		});
	}
	
	
	@Test
	public void TestPopFloat() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.push(A.not(),new One<>(0.23042600130976298));
			try {
				return sh.popFloat(A);
			} catch (Throwable e) {
				return 1;
			}
		});
	}
	
	@Test
	public void testPush() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 0, 1);
			sh.push(TRUE, 42);
			return sh.pop(TRUE);
		});
	}
	
	@Test
	public void TestPushDoubleIsref() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.push(TRUE, new One<>(0.7946437346662857));
			return sh.isRef(TRUE,1);
		});
	}
	
	

	@Test
	public void TestPushDoublePop() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.push(TRUE, new One<>(0.642451970363315),false);
			sh.popFloat(TRUE);
			return sh.getSlots(TRUE);
		});
	}
	
	@Test
	public void TestPushGetCTXPeeklong() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.push(TRUE, new One<>(24320));
			sh.getCtx();
			return sh.peekLong(TRUE,0);
		});
	}
	
	@Test
	public void TestPushGettop() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.push(TRUE, new One<>((byte)51));
			return sh.getTop();
		});
	}
	
	@Test
	public void TestPushGettop2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.push(TRUE,null,false);
			return sh.getTop();
		});
	}
	
	@Test
	public void TestPushIsRef() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.push(TRUE, One.valueOf(42), true);
			return sh.isRef(TRUE, 0);
		});
	}
	
	@Test
	public void TestPushLongDupx2Peek() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.pushLongLocal(TRUE,0);
			try {
				sh.dup_x2(TRUE);
			} catch (Throwable e) {
			}
			return sh.peek(TRUE,1);
		});
	}
	
	@Test
	public void TestPushlongPopSwap() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 4, 4);
			sh.push(TRUE, new One<>(-7927173346344572909l));
			sh.pop(TRUE,Type.INT);
			try {
				sh.swap(TRUE);
			} catch (Throwable e) {
				return 1;
			}
			return -1;
		});
	}
	@Test
	public void TestPushPopdoubleIsref() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.push(TRUE,One.valueOf(42));
			try { 
				sh.popDouble(TRUE);
			} catch (Throwable e) {
			}
			return sh.isRef(TRUE,0);
		});
	}
	
	@Test
	public void TestPushPoplongSwap() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.push(TRUE,One.valueOf(42),false);
			try {
				sh.popLong(TRUE);
			} catch (Throwable e1) {
				try {
					sh.swap(TRUE);
				} catch (Throwable e2) {
					return 1;
				}
				return 2;
			}
			return 3;
		});
	}
	
	@Test
	public void TestPushPushPeekdouble() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.push(TRUE, new One<>((short)-8387));
			sh.push(TRUE, new One<>(-617491898),true);
			return sh.peekDouble(TRUE,0);
		});
	}
	
	@Test
	public void TestPushPushPeekLong() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.push(TRUE, new One<>(0.107720435),false);
		    sh.push(TRUE, new One<>(136030416));
		    return sh.peekLong(TRUE,0);
		});
	}
	
	@Test
	public void TestPushSet() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.push(TRUE, One.valueOf(42), false);
			sh.set(TRUE, 0, 1, true);
			return false;
		});
	}
	
	@Test
	public void TestPushShortPeek() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.push(TRUE,new One<>((short)32521));
			try {
				sh.peek(TRUE,0);
			} catch (Throwable e) {
				throw e;
			}
			return -1;
		});
	}
	
	@Test
	public void TestPushStoreLongOperandGetAllReferences() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.push(TRUE, new One<>(333800478),true);
			try {
				sh.storeLongOperand(TRUE,0);
			} catch (Throwable e) {
				return sh.getAllReferences();
			}	
			return null;
		});
	}
	
	@Test
	public void TestPushStoreLongPeek() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 3, 3);
			sh.push(TRUE,One.valueOf(42));
			try {
				sh.storeLongOperand(TRUE,1);
			} catch (Throwable e) {
			}
			return sh.peek(TRUE,0);
		});
	}
	
	@Test
	public void TestPushStoreoperandClear() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 4, 4);
			sh.push(TRUE,new One<>(0.20288428259834568));
			try {
				sh.storeOperand(TRUE,1);	
			} catch (Throwable e) {
				sh.clear(TRUE);
				return 1;
			}
			return -1;
		});
	}
	
	@Test
	public void TestReferences() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 0, 2);
			sh.push(TRUE, 42, true);
			sh.push(TRUE, 1337, false);
			sh.swap(TRUE);
			return sh.getAllReferences();
		});
	}
	
	
	
	@Test
	public void TestSet() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.push(TRUE,new One<>(1401278654),true);
			sh.set(A,0,0,false);
			return sh.popFloat(TRUE);
		});
	}
	
	@Test
	public void TestSetCtx() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.pushLongLocal(A,0);
			try {
				sh.swap(TRUE);
			} catch (Throwable e) {
				return 1;
			}
			return -1;
		});
	}
	
	@Test
	public void TestSetCtx2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.pushLocal(A,1);
			sh.setCtx(A);
			try {
				return sh.pop(TRUE);
			} catch (Exception e) {
				return - 2;
			}
		});
	}
	
	@Test
	public void TestSetLocalPushlonglocalIsRef() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.setLocal(TRUE,1,0,true);
			sh.pushLongLocal(TRUE,1);
			return sh.isRef(TRUE,1);
		});
	}
	
	@Test
	public void testStoreLongOperand() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.push(TRUE, 111111119999999999L);
			sh.storeLongOperand(TRUE, 0);
			sh.pushLongLocal(TRUE, 0);
			return sh.popLong(TRUE);
		});
	}
	
	@Test
	public void testStoreLongOperand_2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.push(TRUE, 11111111.9999999999);
			sh.storeLongOperand(TRUE, 0);
			sh.pushLongLocal(TRUE, 0);
			return sh.popLong(TRUE);
		});
	}
	
	@Test
	public void TestStoreOperand() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.setCtx(A.not());
			sh.push(A, new One<>(0.4148501545754978));
			try {
				sh.storeOperand(A,1);
			} catch (Throwable e) {
				return 1;
			}
			return -1;
		});
	}
	
	@Test
	public void testStoreOperand_1() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.push(TRUE, 42);
			sh.storeOperand(TRUE, 0);
			sh.pushLocal(TRUE, 0);
			return sh.pop(TRUE);
		});
	}
	
	@Test
	public void testStoreOperand_2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.push(TRUE, (short) 42);
			sh.storeOperand(TRUE, 0);
			sh.pushLocal(TRUE, 0);
			return sh.pop(TRUE);
		});
	}
	
	@Test
	public void testStoreOperand_3() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.push(TRUE, 42.3f);
			sh.storeOperand(TRUE, 0);
			sh.pushLocal(TRUE, 0);
			return sh.pop(TRUE);
		});
	}
	
	@Test
	public void testStoreOperand_4() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.push(TRUE, (byte) 42);
			sh.storeOperand(TRUE, 0);
			sh.pushLocal(TRUE, 0);
			return sh.pop(TRUE);
		});
	}
	
	@Test
	public void TestSwap() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 0, 2);
			sh.push(TRUE, 42);
			sh.push(TRUE, 1337);
			sh.swap(TRUE);
			return sh.popLong(TRUE);
		});
	}
	
	@Test
	public void TestSwap2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 10, 10);
			sh.peek(TRUE,1);
			sh.pushLongLocal(A,1);
			try {
				sh.swap(A);
			} catch (Throwable e) {
				return 1;
			}
			return -1;
		});
	}

	@Test
	public void TestToString() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(TRUE, 2, 2);
			sh.push(TRUE, 42, true);
			sh.push(TRUE, 1337, false);
			sh.storeOperand(TRUE, 0);
			sh.toString();
			return "";
		});
	}
	
}