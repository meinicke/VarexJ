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

	private void differentalTest(Supplier<Object> action) {
		Object result = null;
		for (Object[] params : stackHandlers) {
			setStackHandler(params);
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

	@Test
	public void testPush() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 0, 1);
			sh.push(FeatureExprFactory.True(), 42);
			return sh.pop(FeatureExprFactory.True());
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
	public void TestDup() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 0, 2);
			sh.push(FeatureExprFactory.True(), 42);
			sh.dup(FeatureExprFactory.True());
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
	public void TestIsRef() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.push(FeatureExprFactory.True(), One.valueOf(42), true);
			return sh.isRef(FeatureExprFactory.True(), 0);
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
	public void TestPushSet() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			sh.push(FeatureExprFactory.True(), One.valueOf(42), false);
			sh.set(FeatureExprFactory.True(), 0, 1, true);
			return false;
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
	public void TestGetSlots() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 2, 2);
			int[] slots = sh.getSlots(FeatureExprFactory.True());
			sh.push(FeatureExprFactory.True(),One.valueOf(42),true);
			return slots;
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
	public void TestHasAnyRef() {
		differentalTest(() -> {
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 3, 3);
			sh.push(FeatureExprFactory.True(),One.valueOf(42),true);
			return sh.hasAnyRef(FeatureExprFactory.True());
		});
	}
	
}
