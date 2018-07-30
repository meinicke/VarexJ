package cmu.datastructures;

import org.junit.Test;

import cmu.conditional.CachedFeatureExprFactory;
import gov.nasa.jpf.vm.va.IStackHandler;
import gov.nasa.jpf.vm.va.StackHandlerFactory;
import gov.nasa.jpf.vm.va.StackHandlerFactory.SHFactory;

/**
 * TODO description
 * 
 * @author Jens Meinicke
 *
 */
public class StackHandlerFactoryTest {

	
	@Test
	public void testSetFactory() throws Exception {
		for (SHFactory factory : SHFactory.values()) {
			StackHandlerFactory.setFactory(factory);
			IStackHandler stack = StackHandlerFactory.createStack(CachedFeatureExprFactory.True(), 1, 1);
			stack.toString();
		}
	}
}
