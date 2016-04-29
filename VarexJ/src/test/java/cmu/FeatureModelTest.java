package cmu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import de.fosd.typechef.featureexpr.FeatureModel;

/**
 * Tests the usage of dimacs files as feature models.
 * 
 * @author Jens Meinicke
 *
 */
public class FeatureModelTest {
	
	@Test
	public void testSimple() throws Exception {
		FeatureExprFactory.setDefault(FeatureExprFactory.sat());
		
		FeatureExpr a = FeatureExprFactory.createDefinedExternal("CONFIG_A");
		FeatureExpr b = FeatureExprFactory.createDefinedExternal("CONFIG_B");
		FeatureExpr c = FeatureExprFactory.createDefinedExternal("CONFIG_C");
		
		FeatureModel model = FeatureExprFactory.dflt().featureModelFactory().createFromDimacsFile("src/test/resources/model.dimacs");
		assertFalse(a.and(b.not()).isContradiction());
		assertTrue(a.and(b.not()).isContradiction(model));
		
		assertFalse(b.and(c.not()).isContradiction());
		assertTrue(b.and(c.not()).isContradiction(model));
	}
	
	@Test
	public void testBankAccount() throws Exception {
		FeatureExprFactory.setDefault(FeatureExprFactory.bdd());
		FeatureExpr bankaccount = FeatureExprFactory.createDefinedExternal("CONFIG_bankaccount");
		FeatureModel model = FeatureExprFactory.dflt().featureModelFactory().createFromDimacsFile("src/test/resources/BAmodel.dimacs");
		assertFalse(bankaccount.not().isContradiction());
		assertTrue(bankaccount.not().isContradiction(model));
		
	}
	
	@Test
	public void testElevator() throws Exception {
		FeatureExprFactory.setDefault(FeatureExprFactory.bdd());
		FeatureExpr Base = FeatureExprFactory.createDefinedExternal("CONFIG_Base");
		FeatureModel model = FeatureExprFactory.dflt().featureModelFactory().createFromDimacsFile("src/test/resources/Elevator.dimacs");
		assertFalse(Base.not().isContradiction());
		assertTrue(Base.not().isContradiction(model));
	}
	
	@Test
	public void testElevator2() throws Exception {
		FeatureExprFactory.setDefault(FeatureExprFactory.bdd());
		FeatureExpr TwoThirdsFull = FeatureExprFactory.createDefinedExternal("CONFIG_TwoThirdsFull");
		FeatureExpr ExecutiveFloor = FeatureExprFactory.createDefinedExternal("CONFIG_ExecutiveFloor");
		FeatureExpr Weight = FeatureExprFactory.createDefinedExternal("CONFIG_Weight");
		FeatureExpr Overloaded = FeatureExprFactory.createDefinedExternal("CONFIG_Overloaded");
		FeatureModel model = FeatureExprFactory.dflt().featureModelFactory().createFromDimacsFile("src/test/resources/Elevator.dimacs");
		FeatureExpr ctx = FeatureExprFactory.True();
		ctx = ctx.and(Overloaded);
		ctx = ctx.and(ExecutiveFloor.not());
		ctx = ctx.and(Weight.not());
		ctx = ctx.and(TwoThirdsFull.not());
		System.out.println(ctx);
		assertFalse(ctx.isContradiction());
		assertTrue(ctx.isContradiction(model));
		
		Conditional.setFM("src/test/resources/Elevator.dimacs");
		System.out.println(Conditional.getCTXString(ctx));
	}
	
}
