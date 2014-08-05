package cmu;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Ignore;
import org.junit.Test;

import cmu.conditional.BiFunction;
import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.Function;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

@SuppressWarnings("unused")
public class ConditionalTest {
	private static final FeatureExpr fa = FeatureExprFactory.createDefinedExternal("A");
	private static final FeatureExpr fb = FeatureExprFactory.createDefinedExternal("B");
	private static final FeatureExpr fc = FeatureExprFactory.createDefinedExternal("C");
	private static final FeatureExpr fd = FeatureExprFactory.createDefinedExternal("D");
	private static final FeatureExpr fe = FeatureExprFactory.createDefinedExternal("E");
	private static final FeatureExpr ff = FeatureExprFactory.createDefinedExternal("F");
	
	private static final FeatureExpr fg = FeatureExprFactory.createDefinedExternal("G");

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
		v1 = v1.map(new Function<Integer, Integer>() {
			public Integer apply(Integer x) {return x+1;}
		}
		);
		assertEquals(Choice(fa, One(2), One(3)), v1);
	}
	
	@Test
	public void testMap2() throws Exception {
		Conditional<Integer> v1 = Choice(fa, Choice(fb, One(1), One(2)), Choice(fb, Choice(fc, One(3), One(4)), One(5)));
		v1 = v1.map(new Function<Integer, Integer>() {
			public Integer apply(Integer x) {return x+1;}
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
		System.out.println(v1);
		v1 = v1.mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Integer, Conditional<Integer>>() {
			@Override
			public Conditional<Integer> apply(FeatureExpr c, Integer x) {
				return Choice(c.and(fb), One(3), One(x));
			}
			
		});
		System.out.println(v1);
		assertEquals(Choice(fa, Choice((fa.and(fb)), One(3), One(2)), Choice(fb.andNot(fa), One(3), One(1))), v1);
	}
	
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	@Test
//	public void simplify1() {
//		Conditional<Integer> v1 = new One(One(1));
//		assertEquals(One(1), v1.simplify());
//	}
//	
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
		return new One<>(i);
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
	
}
