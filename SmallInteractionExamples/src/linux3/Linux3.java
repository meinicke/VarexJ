package linux3;

import gov.nasa.jpf.annotation.Conditional;

/**
 * http://vbdb.itu.dk/#bug/linux/0f8f809
 * 
 * @author Jens Meinicke
 */
public class Linux3 {
	// #ifndef CONFIG_FORCE_MAX_ZONEORDER
	// #define MAX_ORDER 11
	// #else
	// #define MAX_ORDER CONFIG_FORCE_MAX_ZONEORDER
	// #endif

	@Conditional static boolean FORCE_MAX_ZONEORDER = true;
	@Conditional static boolean PPC_256K_PAGES = true;
	@Conditional static boolean PPC_64K_PAGES = false; 
	@Conditional static boolean PPC_16K_PAGES = false;
	@Conditional static boolean SLAB = false;
	@Conditional static boolean LOCKDEP = true;
	@Conditional static boolean SLOB = false;

	static int MAX_ORDER =  11;//Verify.getInt(0, 11);//FORCE_MAX_ZONEORDER ? 11 : 5;

	static int PAGE_SHIFT = 0;
	static {
		if (PPC_256K_PAGES) {
			PAGE_SHIFT = 18;
		} else if (PPC_64K_PAGES) {
			PAGE_SHIFT = 16;
		} else if (PPC_16K_PAGES) {
			PAGE_SHIFT = 14;
		} else {
			PAGE_SHIFT = 12;
		}
	}

	static int KMALLOC_SHIFT_HIGH;
	static {
		if (SLAB) {
			KMALLOC_SHIFT_HIGH = MAX_ORDER + PAGE_SHIFT - 1 <= 25 ? MAX_ORDER + PAGE_SHIFT - 1 : 25;
		} else {
			KMALLOC_SHIFT_HIGH = PAGE_SHIFT + 1;
		}
	}

	// #ifndef CONFIG_SLOB
	// int* kmalloc_caches[KMALLOC_SHIFT_HIGH + 1];
	static Object[] kmalloc_caches;
	static {
		if (!SLOB) {
			kmalloc_caches = new Object[KMALLOC_SHIFT_HIGH + 1];
		}
	}

	// #endif
	//
	// #ifdef CONFIG_LOCKDEP
	static void init_node_lock_keys() {
		if (LOCKDEP) {
			for (int i = 1; i < PAGE_SHIFT + MAX_ORDER; i++) {
				Object cache = kmalloc_caches[i]; // (4) ERROR

				if (cache == null)
					continue;

				Object n = cache;
			}
		} else {
			return;
		}
	}

	//
	static void init_lock_keys() {
		if (LOCKDEP) {
			init_node_lock_keys(); // (3)
		}
	}

	static void kmem_cache_init_late() {
		init_lock_keys(); // (2)
	}

	//
	public static void main(String... args) {
		System.out.println(MAX_ORDER);
		if (!SLOB) {
		try {
				kmem_cache_init_late(); // (1)
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error");
			return;
		}
		System.out.println("No error");
		}
	}
}
