package cmu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

import cmu.conditional.CachedFeatureExprFactory;
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
	
	private static final String ELEVATOR_DIMACS = "elevator.dimacs";
	private static final String B_AMODEL_DIMACS = "BAmodel.dimacs";
	private static final String MODEL_DIMACS = "model.dimacs";
	
	private final static String SEPARATOR = File.separator;
	private final static String RES_PATH = "src" + SEPARATOR + "test" + SEPARATOR + "resources" + SEPARATOR;
	private final static File PATH;
	static {
		PATH = new File(RES_PATH);
	}
	
	@Test
	public void testSimpleModel() throws Exception {
		FeatureExprFactory.setDefault(FeatureExprFactory.sat());
		
		FeatureExpr a = FeatureExprFactory.createDefinedExternal("CONFIG_A");
		FeatureExpr b = FeatureExprFactory.createDefinedExternal("CONFIG_B");
		FeatureExpr c = FeatureExprFactory.createDefinedExternal("CONFIG_C");
		
		FeatureModel model = FeatureExprFactory.dflt().featureModelFactory().createFromDimacsFile(new File(PATH, MODEL_DIMACS).getPath().toString());
		assertFalse(a.and(b.not()).isContradiction());
		assertTrue(a.and(b.not()).isContradiction(model));
		
		assertFalse(b.and(c.not()).isContradiction());
		assertTrue(b.and(c.not()).isContradiction(model));
	}
	
	@Test
	public void testBankAccount() throws Exception {
		FeatureExprFactory.setDefault(FeatureExprFactory.bdd());
		FeatureExpr bankaccount = FeatureExprFactory.createDefinedExternal("CONFIG_bankaccount");
		FeatureModel model = FeatureExprFactory.dflt().featureModelFactory().createFromDimacsFile(new File(PATH, B_AMODEL_DIMACS).getPath().toString());
		assertFalse(bankaccount.not().isContradiction());
		assertTrue(bankaccount.not().isContradiction(model));
		
	}
	
	@Test
	public void testElevator() throws Exception {
		FeatureExprFactory.setDefault(FeatureExprFactory.bdd());
		FeatureExpr Base = FeatureExprFactory.createDefinedExternal("CONFIG_Base");
		FeatureModel model = FeatureExprFactory.dflt().featureModelFactory().createFromDimacsFile(new File(PATH, ELEVATOR_DIMACS).getPath().toString());
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
		FeatureModel model = FeatureExprFactory.dflt().featureModelFactory().createFromDimacsFile(new File(PATH, ELEVATOR_DIMACS).getPath().toString());
		FeatureExpr ctx = CachedFeatureExprFactory.True();
		ctx = ctx.and(Overloaded);
		ctx = ctx.and(ExecutiveFloor.not());
		ctx = ctx.and(Weight.not());
		ctx = ctx.and(TwoThirdsFull.not());
		assertFalse(ctx.isContradiction());
		assertTrue(ctx.isContradiction(model));
		Conditional.setFM("src/test/resources/elevator.dimacs");
	}
	
}
