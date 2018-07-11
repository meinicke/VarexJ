package cmu;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.ChoiceFactory.Factory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.AbstractFeatureExprFactory;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

/**
 * Test for conditional implementations.
 * 
 * @author Jens Meinicke
 *
 */
@SuppressWarnings("unused")
@RunWith(Parameterized.class)
public class ConditionalTest {
	private final FeatureExpr fa;
	private final FeatureExpr fb;
	private final FeatureExpr fc;
	private final FeatureExpr fd;
	private final FeatureExpr fe;
	private final FeatureExpr ff;
	private final FeatureExpr fg;

	@Parameters(name = "{0} : {1}")
	public static List<Object[]> configurations() {
		List<Object[]> params = new LinkedList<>(); 
		for (Object[] choice : ChoiceFactory.asParameter()) {
			params.add(new Object[]{choice[0], FeatureExprFactory.bdd()});
			break;
		}
		return params;
	}
	
	public ConditionalTest(Factory factory, AbstractFeatureExprFactory fexprFeactory) {
		ChoiceFactory.setDefault(factory);
		FeatureExprFactory.setDefault(fexprFeactory);
		
		fa = FeatureExprFactory.createDefinedExternal("A");
		fb = FeatureExprFactory.createDefinedExternal("B");
		fc = FeatureExprFactory.createDefinedExternal("C");
		fd = FeatureExprFactory.createDefinedExternal("D");
		fe = FeatureExprFactory.createDefinedExternal("E");
		ff = FeatureExprFactory.createDefinedExternal("F");
		fg = FeatureExprFactory.createDefinedExternal("G");
	}
	
	
	@Test
	public void testEqualsOne() throws Exception {
		Conditional<Integer> v1 = One(1);
		assertEquals(One(1), v1);
		assertNotEquals(One(2), v1);
	}
	
	@Test
	public void testEquals() throws Exception {
		Conditional<Integer> v1 = Choice(fa, One(1), One(2));
		assertEquals(v1, Choice(fa, One(1), One(2)));
		assertNotEquals(Choice(fa, One(2), One(1)), v1);
		assertNotEquals(Choice(fb, One(1), One(2)), v1);
	}
	
	@Test
	public void testMap1() throws Exception {
		Conditional<Integer> v1 = Choice(fa, One(1), One(2));
		v1 = v1.mapr(new Function<Integer, Conditional<Integer>>() {
			public Conditional<Integer> apply(Integer x) {return One.valueOf(x+1);}
		}
		);
		assertEquals(Choice(fa, One(2), One(3)), v1);
	}
	
	@Test
	public void testMap2() throws Exception {
		Conditional<Integer> v1 = Choice(fa, Choice(fb, One(1), One(2)), Choice(fb, Choice(fc, One(3), One(4)), One(5)));
		v1 = v1.mapr(new Function<Integer, Conditional<Integer>>() {
			public Conditional<Integer> apply(Integer x) {return One.valueOf(x+1);}
		}
		);
		assertEquals(Choice(fa, Choice(fb, One(2), One(3)), Choice(fb, Choice(fc, One(4), One(5)), One(6))), v1);
	}
	
	@Ignore @Test
	public void testMapf1() {
		Conditional<Integer> v1 = Choice(fa, Choice(fb, One(1), One(2)), Choice(fb, Choice(fc, One(3), One(4)), One(5)));
		v1 = v1.mapf(fa, new BiFunction<FeatureExpr, Integer, Conditional<Integer>>() {
			@Override
			public Conditional<Integer> apply(FeatureExpr c, Integer x) {
				return Choice(c.and(fa), One(x+1), One(x));
			}
			
		}).simplify();
		assertEquals(Choice(fa, Choice(fb, One(2), One(3)), Choice(fb, Choice(fc, One(3), One(4)), One(5))), v1);
		
		v1 = v1.mapf(fb, new BiFunction<FeatureExpr, Integer, Conditional<Integer>>() {
			@Override
			public Conditional<Integer> apply(FeatureExpr c, Integer x) {
				return Choice(c.and(fb), One(x+1), One(x));
			}
			
		}).simplify();
		assertEquals(Choice(fa, One(3), Choice(fb, Choice(fc, One(4), One(5)), One(5))), v1);
		
		v1 = v1.mapf(fc, new BiFunction<FeatureExpr, Integer, Conditional<Integer>>() {
			@Override
			public Conditional<Integer> apply(FeatureExpr c, Integer x) {
				return Choice(c.and(fc), One(x+1), One(x));
			}
			
		}).simplify();
		assertEquals(Choice(fa, Choice(fc.and(fa), One(4), One(3)), Choice(fb, One(5), Choice(fc.andNot(fa).andNot(fb), One(6), One(5)))), v1);
	}
	
	@Test
	public void testMapf2() throws Exception {
		Conditional<Integer> v1 = Choice(fa, Choice(fb, One(1), One(2)), Choice(fb, Choice(fc.and(fa), One(3), One(4)), One(5)));
		v1 = v1.mapf(fa, new BiFunction<FeatureExpr, Integer, Conditional<Integer>>() {
			@Override
			public Conditional<Integer> apply(FeatureExpr c, Integer x) {
				return Choice((fa), One(x+1), One(x));
			}
			
		});
	}
	
	@Test
	public void testMapf3() {
		Conditional<Integer> v1 = One(1);
		v1 = v1.mapf(fa, new BiFunction<FeatureExpr, Integer, Conditional<Integer>>() {
			@Override
			public Conditional<Integer> apply(FeatureExpr c, Integer x) {
				return Choice(fa, One(2), One(x));
			}
			
		});
		v1 = v1.mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Integer, Conditional<Integer>>() {
			@Override
			public Conditional<Integer> apply(FeatureExpr c, Integer x) {
				return Choice(c.and(fb), One(3), One(x));
			}
			
		});
		assertEquals(Choice(fa, Choice((fa.and(fb)), One(3), One(2)), Choice(fb.andNot(fa), One(3), One(1))), v1);
	}
	
	@Test
	public void simplify2() {
		Conditional<Integer> v1 = Choice(fa, One(1), One(1));
		assertEquals(One(1), v1.simplify());
	}
	
	@Test
	public void simplify3() {
		Conditional<Integer> v1 = Choice(fb, Choice(fa, One(1), One(1)), Choice(fa, One(1), One(1)));
		assertEquals(One(1), v1.simplify());
	}
	
	@Test
	public void simplify4() {
		Conditional<Integer> v1 = Choice(fb, Choice(fa, One(1), One(2)), Choice(fa, One(1), One(2)));
		assertEquals(Choice(fa, One(1), One(2)), v1.simplify());
	}
	
	private static Conditional<Integer> Choice(FeatureExpr f, Conditional<Integer> first, Conditional<Integer> second) {
		return ChoiceFactory.create(f, first, second);
	}

	private static One<Integer> One(int i) {
		return One.valueOf(i);
	}
	
	@Ignore @Test
	public void simplify_1() throws Exception {
		Conditional<Integer> v1 = Choice(fa, One(1), Choice(fb, One(1), One(2))).simplify();
		assertEquals(Choice(fa.or(fa.not().and(fb)), One(1), One(2)), v1);
	}
	
	@Ignore @Test
	public void simplify_2() throws Exception {
		Conditional<Integer> v1 = Choice(fa, One(1), Choice(fb, One(2), One(1))).simplify();
		assertEquals(Choice(fa.or(fa.not().and(fb.not())), One(1), One(2)), v1);
	}
	
	@Ignore @Test
	public void simplify_3() throws Exception {
		Conditional<Integer> v1 = Choice(fa, Choice(fb, One(1), One(2)), One(1)).simplify();
		assertEquals(Choice(fa.not().or((fb)), One(1), One(2)), v1);
	}
	
	@Ignore @Test
	public void simplify_4() throws Exception {
		Conditional<Integer> v1 = Choice(fa, Choice(fb, One(2), One(1)), One(1)).simplify();
		assertEquals(Choice(fa.not().or((fb.not())), One(1), One(2)), v1);
	}
	
	@Ignore @Test
	public void simplify_5() throws Exception {
		Conditional<Integer> v1 = Choice(fa, One(1), Choice(fb, One(1), Choice(fc, One(2), One(3)))).simplify();
		assertEquals(Choice(fa.or(fa.not().and(fb)), One(1), Choice(fc, One(2), One(3))), v1);
	}
	
	@Test
	public void testtest() throws Exception {
		final Conditional<Integer> a = Choice(fa, One(0), One(1));
		final Conditional<Integer> b = Choice(fa, One(2), One(3));
		final Conditional<Integer> c = Choice(fb, One(4), One(5));
		final Conditional<Integer> d = Choice(fb, One(6), Choice(fc, One(7), One(8)));
	}
	
	@Test
	public void testOrNot() throws Exception {
		FeatureExpr expected = fa.orNot(fb);
		FeatureExpr actual = Conditional.orNot(fa, fb);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testOrNot2() throws Exception {
		FeatureExpr expected = fa.orNot(fa);
		FeatureExpr actual = Conditional.orNot(fa, fa);
		assertEquals(expected, actual);
	}
	
	@Test(expected = AssertionError.class)
	public void testNullCTX() throws Exception {
		ChoiceFactory.create(null, new One<>(1), new One<>(2));
	}
	
}
