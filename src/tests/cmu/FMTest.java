package cmu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import de.fosd.typechef.featureexpr.FeatureModel;

public class FMTest {
	
	
	
	
	@Test
	public void testSimple() throws Exception {
		FeatureExprFactory.setDefault(FeatureExprFactory.sat());
		
		FeatureExpr a = FeatureExprFactory.createDefinedExternal("CONFIG_A");
		FeatureExpr b = FeatureExprFactory.createDefinedExternal("CONFIG_B");
		FeatureExpr c = FeatureExprFactory.createDefinedExternal("CONFIG_C");
		
		FeatureModel model = FeatureExprFactory.dflt().featureModelFactory().createFromDimacsFile("lib\\model.dimacs");
		assertFalse(a.and(b.not()).isContradiction());
		assertTrue(a.and(b.not()).isContradiction(model));
		
		assertFalse(b.and(c.not()).isContradiction());
		assertTrue(b.and(c.not()).isContradiction(model));
	}
	
	@Test
	public void testBankAccount() throws Exception {
		FeatureExprFactory.setDefault(FeatureExprFactory.bdd());
		FeatureExpr bankaccount = FeatureExprFactory.createDefinedExternal("CONFIG_bankaccount");
		FeatureModel model = FeatureExprFactory.dflt().featureModelFactory().createFromDimacsFile("lib\\BAmodel.dimacs");
		assertFalse(bankaccount.not().isContradiction());
		assertTrue(bankaccount.not().isContradiction(model));
		
	}
}
