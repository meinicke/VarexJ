package cmu.defect4j.lang3;

import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashSet;

import gov.nasa.jpf.util.test.TestJPF;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class HashSetvBitSetTest extends TestJPF {

	private final String[] config = {
			"+search.class= .search.RandomSearch",
			"+nhandler.delegateUnhandledNative",
			"+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar" };

	public static void main(String[] testMethods) {
		runTestsOfThisClass(testMethods);
	}

	@Ignore	// works but long running (2376s)
	@Test	// (timeout=120000)
	public void testTimesExtractOrBitset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			org.apache.commons.lang3.HashSetvBitSetTest object = new org.apache.commons.lang3.HashSetvBitSetTest();
			object.testTimesExtractOrBitset();
		}
	}

	@Test
	// (timeout=120000)
	public void testTimes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			fail();// TODO remove, long-running & failing test
			timeHashSet(10); // warmup
			timeBitSet(10); // warmup
			long timeDiff = printTimes(0);
			timeDiff += printTimes(5);
			timeDiff += printTimes(10);
			timeDiff += printTimes(200);
			timeDiff += printTimes(50);
			timeDiff += printTimes(100);
			timeDiff += printTimes(1000);
			timeDiff += printTimes(2000);
			Assert.assertTrue(timeDiff <= 0);

			// org.apache.commons.lang3.HashSetvBitSetTest object = new
			// org.apache.commons.lang3.HashSetvBitSetTest();
			// object.testTimes();
		}
	}

	/**
	 * @return bitSet - HashSet
	 */
	private long printTimes(final int count) {
		final long hashSet = timeHashSet(count);
		final long bitSet = timeBitSet(count);
		// If percent is less than 100, then bitset is faster
		System.out.println("Ratio=" + (bitSet * 100 / hashSet) + "% count="
				+ count + " hash=" + hashSet + " bits=" + bitSet);
		return bitSet - hashSet;
	}

	@SuppressWarnings("boxing")
	private static int[] testHashSet(final int count) {
		final HashSet<Integer> toRemove = new HashSet<Integer>();
		int found = 0;
		for (int i = 0; i < count; i++) {
			toRemove.add(found++);
		}
		return extractIndices(toRemove);
	}

	private static long timeHashSet(final int count) {
		int[] result = new int[0];
		final long start = System.nanoTime();
		for (int i = 0; i < LOOPS; i++) {
			result = testHashSet(count);
		}
		final long elapsed = System.nanoTime() - start;
		Assert.assertEquals(count, result.length);
		return elapsed;
	}

	private static long timeBitSet(final int count) {
		int[] result = new int[0];
		final long start = System.nanoTime();
		for (int i = 0; i < LOOPS; i++) {
			result = testBitSet(count);
		}
		final long elapsed = System.nanoTime() - start;
		Assert.assertEquals(count, result.length);
		return elapsed;
	}

	private static int[] testBitSet(final int count) {
		final BitSet toRemove = new BitSet();
		int found = 0;
		for (int i = 0; i < count; i++) {
			toRemove.set(found++);
		}
		return extractIndices(toRemove);
	}

	private static int[] extractIndices(final HashSet<Integer> coll) {
		final int[] result = new int[coll.size()];
		int i = 0;
		for (final Integer index : coll) {
			result[i++] = index.intValue();
		}
		return result;
	}

	private static int[] extractIndices(final BitSet coll) {
		final int[] result = new int[coll.cardinality()];
		int i = 0;
		int j = 0;
		while ((j = coll.nextSetBit(j)) != -1) {
			result[i++] = j++;
		}
		return result;
	}

	private static final int LOOPS = 2000; // number of times to invoke methods
	private static final int LOOPS2 = 10000;

	private long printTimes(final int arraySize, final int bitSetSize) {
		final int[] array = new int[arraySize];
		final BitSet remove = new BitSet();
		for (int i = 0; i < bitSetSize; i++) {
			remove.set(i);
		}
		final long bitSet = timeBitSetRemoveAll(array, remove);
		final long extract = timeExtractRemoveAll(array, remove);
		// If percent is less than 100, then direct use of bitset is faster
		System.out.println("Ratio=" + (bitSet * 100 / extract) + "% array="
				+ array.length + " count=" + remove.cardinality() + " extract="
				+ extract + " bitset=" + bitSet);
		return bitSet - extract;
	}

	private long timeBitSetRemoveAll(final int[] array, final BitSet toRemove) {
		int[] output = new int[0];
		final long start = System.nanoTime();
		for (int i = 0; i < LOOPS2; i++) {
			try {
				output = (int[]) ArrayUtils.class.getMethod("removeAll",
						Object.class, int[].class).invoke(null, (Object) array,
						toRemove);
			} catch (IllegalAccessException | NoSuchMethodException
					| SecurityException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		final long end = System.nanoTime();
		Assert.assertEquals(array.length - toRemove.cardinality(),
				output.length);
		return end - start;
	}

	private long timeExtractRemoveAll(final int[] array, final BitSet toRemove) {
		int[] output = new int[0];
		final long start = System.nanoTime();
		for (int i = 0; i < LOOPS2; i++) {
			final int[] extractIndices = extractIndices(toRemove);

			try {
				output = (int[]) ArrayUtils.class.getMethod("removeAll",
						Object.class, int[].class).invoke(null, (Object) array,
						extractIndices);
			} catch (IllegalAccessException | NoSuchMethodException
					| SecurityException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		final long end = System.nanoTime();
		Assert.assertEquals(array.length - toRemove.cardinality(),
				output.length);
		return end - start;
	}

}