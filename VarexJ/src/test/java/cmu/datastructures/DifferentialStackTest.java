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
		System.out.println("-------");
		for (Object[] params : stackHandlers) {
			setStackHandler(params);
			System.out.println(Arrays.toString(params));
			final Object execute = action.get();

			print(params);
			if (execute.getClass() == int[].class) {
				System.out.println(Arrays.toString((int[])execute));
			} else {
				System.out.println(execute);
			}
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

	private void print(Object[] params) {
		for (Object object : params) {
			System.out.print(object + " ");
		}
		System.out.println();
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
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.push(FeatureExprFactory.True(), 42, true);
			sh.push(FeatureExprFactory.True(), 1337, false);
			sh.storeOperand(FeatureExprFactory.True(), 0);
			return sh.equals(sh.clone());
		});
	}

	@Test
	public void TestDup() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 0, 2);
			sh.push(FeatureExprFactory.True(), 42);
			sh.dup(FeatureExprFactory.True());
			return sh.popLong(FeatureExprFactory.True());
		});
	}

	@Test
	public void TestDup_x1() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 0, 4);
			sh.push(FeatureExprFactory.True(), 42);
			sh.push(FeatureExprFactory.True(), 1337);
			sh.dup_x1(FeatureExprFactory.True());
			return sh.popLong(FeatureExprFactory.True());
		});
	}

	@Test
	public void TestDup_x2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 0, 4);
			sh.push(FeatureExprFactory.True(), 42);
			sh.push(FeatureExprFactory.True(), 1337);
			sh.push(FeatureExprFactory.True(), 1_123_456);
			sh.dup_x2(FeatureExprFactory.True());
			sh.pop(FeatureExprFactory.True());
			return sh.popLong(FeatureExprFactory.True());
		});
	}

	@Test
	public void TestDup2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 0, 4);
			sh.push(FeatureExprFactory.True(), 42);
			sh.push(FeatureExprFactory.True(), 1337);
			sh.dup2(FeatureExprFactory.True());
			return sh.popLong(FeatureExprFactory.True());
		});
	}

	@Test
	public void TestDup2_x1() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 0, 5);
			sh.push(FeatureExprFactory.True(), 42);
			sh.push(FeatureExprFactory.True(), 1337);
			sh.push(FeatureExprFactory.True(), 1_123_456);
			sh.dup2_x1(FeatureExprFactory.True());
			sh.pop(FeatureExprFactory.True());
			return sh.popLong(FeatureExprFactory.True());
		});
	}

	@Test
	public void TestDup2_x2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 0, 6);
			sh.push(FeatureExprFactory.True(), 42);
			sh.push(FeatureExprFactory.True(), 1337);
			sh.push(FeatureExprFactory.True(), 1_123_456);
			sh.push(FeatureExprFactory.True(), 3000);
			sh.dup2_x2(FeatureExprFactory.True());
			sh.pop(FeatureExprFactory.True());
			return sh.popLong(FeatureExprFactory.True());
		});
	}

	@Test
	public void TestEquals() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 10, 10);
			List<Object> returns = new ArrayList<>();
			returns.add(sh.equals(sh));
			returns.add(sh.equals(null));
			returns.add(sh.equals(1));
			IStackHandler sh2 = StackHandlerFactory.createStack(FeatureExprFactory.True(), 10, 10);
			sh2.push(FeatureExprFactory.True(), 1);
			returns.add(sh.equals(sh2));
			IStackHandler sh3 = StackHandlerFactory.createStack(FeatureExprFactory.True(), 10, 10);
			sh3.setLocal(FeatureExprFactory.True(), 1, 2, true);
			returns.add(sh.equals(sh3));
			IStackHandler sh4 = StackHandlerFactory.createStack(FeatureExprFactory.True(), 9, 11);
			returns.add(sh.equals(sh4));
			IStackHandler sh5 = StackHandlerFactory.createStack(FeatureExprFactory.True(), 1,1);
			returns.add(sh.equals(sh5));
			return returns;
		});
	}

	@Test
	public void TestGetAllReferences() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.setLocal(FeatureExprFactory.True(),1,0,true);
			return sh.getAllReferences();
		});
	}

	@Test
	public void TestGetLocal() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 10, 10);
			sh.getLocal(0);
			return -1;
		});
	}

	@Test
	public void TestGetSlots() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			int[] slots = sh.getSlots(FeatureExprFactory.True());
			sh.push(FeatureExprFactory.True(),One.valueOf(42),true);
			return slots;
		});
	}

	@Test
	public void TestGetSlots2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 3, 3);
			sh.push(FeatureExprFactory.True(),One.valueOf(42));
			try {
				sh.popLong(FeatureExprFactory.True());
			} catch (Exception e) {
			} catch (Error e) {
			}
			return sh.getSlots(FeatureExprFactory.True());
		});
	}

	@Test
	public void TestHasAnyRef() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 3, 3);
			sh.push(FeatureExprFactory.True(),One.valueOf(42),true);
			return sh.hasAnyRef(FeatureExprFactory.True());
		});
	}

	@Test
	public void TestHashCode() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 10, 10);
			sh.hashCode();
			return -1;
		});
	}

	@Test
	public void TestIsRef() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.push(FeatureExprFactory.True(), One.valueOf(42), true);
			return sh.isRef(FeatureExprFactory.True(), 0);
		});
	}

	@Test
	public void TestPeekDouble() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.push(FeatureExprFactory.True(),One.valueOf(42),true);
			return sh.peekDouble(FeatureExprFactory.True(),0);
		});
	}

	@Test
	public void TestPeekFloat() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 3, 3);
			sh.pushLongLocal(FeatureExprFactory.True(),1);
			return sh.peekFloat(FeatureExprFactory.True(),1);
		});
	}

	@Test
	public void TestPeekLong() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.push(FeatureExprFactory.True(),One.valueOf(42));
			return sh.peekLong(FeatureExprFactory.True(),0);
		});
	}

	@Test
	public void TestPeekLong2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.pushLongLocal(FeatureExprFactory.True(),0);
			return sh.peekLong(FeatureExprFactory.True(),0);
		});
	}

	@Test
	public void testPush() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 0, 1);
			sh.push(FeatureExprFactory.True(), 42);
			return sh.pop(FeatureExprFactory.True());
		});
	}
	
	@Test
	public void TestPushDoubleIsref() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 10, 10);
			sh.push(FeatureExprFactory.True(), new One<>(0.7946437346662857));
			return sh.isRef(FeatureExprFactory.True(),1);
		});
	}
	
	@Test
	public void TestPushDoublePop() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 10, 10);
			sh.push(FeatureExprFactory.True(), new One<>(0.642451970363315),false);
			sh.popFloat(FeatureExprFactory.True());
			return sh.getSlots(FeatureExprFactory.True());
		});
	}
	
	
	@Test
	public void TestPushGetCTXPeeklong() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 10, 10);
			sh.push(FeatureExprFactory.True(), new One<>(24320));
			sh.getCtx();
			return sh.peekLong(FeatureExprFactory.True(),0);
		});
	}
	
	@Test
	public void TestPushGettop() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 10, 10);
			sh.push(FeatureExprFactory.True(), new One<>((byte)51));
			return sh.getTop();
		});
	}
	
	@Test
	public void TestPushGettop2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 10, 10);
			sh.push(FeatureExprFactory.True(),null,false);
			return sh.getTop();
		});
	}
	
	@Test
	public void TestPushIsRef() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.push(FeatureExprFactory.True(), One.valueOf(42), true);
			return sh.isRef(FeatureExprFactory.True(), 0);
		});
	}
	
	@Test
	public void TestPushLongDupx2Peek() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.pushLongLocal(FeatureExprFactory.True(),0);
			try {
				sh.dup_x2(FeatureExprFactory.True());
			} catch (Throwable e) {
			}
			return sh.peek(FeatureExprFactory.True(),1);
		});
	}
	
	@Test
	public void TestPushlongPopSwap() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 4, 4);
			sh.push(FeatureExprFactory.True(), new One<>(-7927173346344572909l));
			sh.pop(FeatureExprFactory.True(),Type.INT);
			try {
				sh.swap(FeatureExprFactory.True());
			} catch (Throwable e) {
				return 1;
			}
			return -1;
		});
	}
	
	@Test
	public void TestPushPopdoubleIsref() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.push(FeatureExprFactory.True(),One.valueOf(42));
			try { 
				sh.popDouble(FeatureExprFactory.True());
			} catch (Throwable e) {
			}
			return sh.isRef(FeatureExprFactory.True(),0);
		});
	}
	
	@Test
	public void TestPushPoplongSwap() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.push(FeatureExprFactory.True(),One.valueOf(42),false);
			try {
				sh.popLong(FeatureExprFactory.True());
			} catch (Throwable e1) {
				try {
					sh.swap(FeatureExprFactory.True());
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
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 10, 10);
			sh.push(FeatureExprFactory.True(), new One<>((short)-8387));
			sh.push(FeatureExprFactory.True(), new One<>(-617491898),true);
			return sh.peekDouble(FeatureExprFactory.True(),0);
		});
	}
	
	@Test
	public void TestPushPushPeekLong() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 10, 10);
			sh.push(FeatureExprFactory.True(), new One<>(0.107720435),false);
		    sh.push(FeatureExprFactory.True(), new One<>(136030416));
		    return sh.peekLong(FeatureExprFactory.True(),0);
		});
	}
	
	@Test
	public void TestPushSet() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.push(FeatureExprFactory.True(), One.valueOf(42), false);
			sh.set(FeatureExprFactory.True(), 0, 1, true);
			return false;
		});
	}
	
	

	@Test
	public void TestPushShortPeek() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 10, 10);
			sh.push(FeatureExprFactory.True(),new One<>((short)32521));
			try {
				sh.peek(FeatureExprFactory.True(),0);
			} catch (Throwable e) {
				e.printStackTrace();
				throw e;
			}
			return -1;
		});
	}
	
	@Test
	public void TestPushStoreLongOperandGetAllReferences() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 10, 10);
			sh.push(FeatureExprFactory.True(), new One<>(333800478),true);
			try {
				sh.storeLongOperand(FeatureExprFactory.True(),0);
			} catch (Throwable e) {
				return sh.getAllReferences();
			}	
			return null;
		});
	}
	
	@Test
	public void TestPushStoreLongPeek() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 3, 3);
			sh.push(FeatureExprFactory.True(),One.valueOf(42));
			try {
				sh.storeLongOperand(FeatureExprFactory.True(),1);
			} catch (Throwable e) {
			}
			return sh.peek(FeatureExprFactory.True(),0);
		});
	}
	
	@Test
	public void TestPushStoreoperandClear() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 4, 4);
			sh.push(FeatureExprFactory.True(),new One<>(0.20288428259834568));
			try {
				sh.storeOperand(FeatureExprFactory.True(),1);	
			} catch (Throwable e) {
				System.out.println(e);
				sh.clear(FeatureExprFactory.True());
				return 1;
			}
			return -1;
		});
	}
	
	@Test
	public void TestReferences() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 0, 2);
			sh.push(FeatureExprFactory.True(), 42, true);
			sh.push(FeatureExprFactory.True(), 1337, false);
			sh.swap(FeatureExprFactory.True());
			return sh.getAllReferences();
		});
	}
	
	@Test
	public void TestSetLocalPushlonglocalIsRef() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 10, 10);
			sh.setLocal(FeatureExprFactory.True(),1,0,true);
			sh.pushLongLocal(FeatureExprFactory.True(),1);
			return sh.isRef(FeatureExprFactory.True(),1);
		});
	}
	
	@Test
	public void testStoreLongOperand() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.push(FeatureExprFactory.True(), 111111119999999999L);
			sh.storeLongOperand(FeatureExprFactory.True(), 0);
			sh.pushLongLocal(FeatureExprFactory.True(), 0);
			return sh.popLong(FeatureExprFactory.True());
		});
	}
	@Test
	public void testStoreLongOperand_2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.push(FeatureExprFactory.True(), 11111111.9999999999);
			sh.storeLongOperand(FeatureExprFactory.True(), 0);
			sh.pushLongLocal(FeatureExprFactory.True(), 0);
			return sh.popLong(FeatureExprFactory.True());
		});
	}
	
	@Test
	public void testStoreOperand_1() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.push(FeatureExprFactory.True(), 42);
			sh.storeOperand(FeatureExprFactory.True(), 0);
			sh.pushLocal(FeatureExprFactory.True(), 0);
			return sh.pop(FeatureExprFactory.True());
		});
	}
	
	@Test
	public void testStoreOperand_2() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.push(FeatureExprFactory.True(), (short) 42);
			sh.storeOperand(FeatureExprFactory.True(), 0);
			sh.pushLocal(FeatureExprFactory.True(), 0);
			return sh.pop(FeatureExprFactory.True());
		});
	}
	
	@Test
	public void testStoreOperand_3() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.push(FeatureExprFactory.True(), 42.3f);
			sh.storeOperand(FeatureExprFactory.True(), 0);
			sh.pushLocal(FeatureExprFactory.True(), 0);
			return sh.pop(FeatureExprFactory.True());
		});
	}
	
	@Test
	public void testStoreOperand_4() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.push(FeatureExprFactory.True(), (byte) 42);
			sh.storeOperand(FeatureExprFactory.True(), 0);
			sh.pushLocal(FeatureExprFactory.True(), 0);
			return sh.pop(FeatureExprFactory.True());
		});
	}
	
	@Test
	public void TestSwap() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 0, 2);
			sh.push(FeatureExprFactory.True(), 42);
			sh.push(FeatureExprFactory.True(), 1337);
			sh.swap(FeatureExprFactory.True());
			return sh.popLong(FeatureExprFactory.True());
		});
	}
	
	@Test
	public void TestToString() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.push(FeatureExprFactory.True(), 42, true);
			sh.push(FeatureExprFactory.True(), 1337, false);
			sh.storeOperand(FeatureExprFactory.True(), 0);
			sh.toString();
			return "";
		});
	}
	
}