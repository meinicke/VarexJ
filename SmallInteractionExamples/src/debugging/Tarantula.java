package debugging;

import java.util.HashSet;
import java.util.Set;

import gov.nasa.jpf.annotation.Conditional;

public class Tarantula {

	static int x;
	static int y;
	static int z;

	private static int mid() {

		int m = z;

		if (y < z) {
			if (x < y) {
				m = y;
			} else if (x < z) {
				m = y;
			}
		} else {
			if (x > z) {
				m = y;
			} else if (x > z) {
				m = x;
			}
		}
		return m;
	}

	@Conditional
	static boolean test1 = true;
	@Conditional
	static boolean test2 = true;
	@Conditional
	static boolean test3 = true;
	@Conditional
	static boolean test4 = true;
	@Conditional
	static boolean test5 = true;
	@Conditional
	static boolean test6 = true;

	private static void initializeXYZ() {
		if (test1) {
			x = 3;
			y = 3;
			z = 5;
		}
		if (test2) {
			x = 1;
			y = 2;
			z = 3;
		}
		if (test3) {
			x = 3;
			y = 2;
			z = 1;
		}
		if (test4) {
			x = 5;
			y = 5;
			z = 5;
		}
		if (test5) {
			x = 5;
			y = 3;
			z = 4;
		}
		if (test6) {
			x = 2;
			y = 1;
			z = 3;
		}
	}

	public static void main(String[] args) {
		initializeXYZ();

		int min = getMin();
		int max = getMax();
		int mid = mid();
		// System.out.println(x + " " + y + " " + z + " -> " + mid);
		// System.out.println(mid >= min && mid <= max);
		assert (mid == x + y + z - min - max);
	}

	private static int getMax() {
		return Math.max(x, Math.max(y, z));
	}

	private static int getMin() {
		return Math.min(x, Math.min(y, z));
	}

}
