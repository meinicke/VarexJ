package linux;

import gov.nasa.jpf.annotation.Conditional;

/**
 * http://vbdb.itu.dk/?#bug/linux/ae249b5
 * 
 * @author Jens Meinicke
 *
 */
public class Linux2 {
	@Conditional
	static boolean CONFIG_PARISC = true;
	@Conditional
	static boolean CONFIG_DISCONTIGMEM = true;
	@Conditional
	static boolean CONFIG_PROC_PAGE_MONITOR = true;

	/**
	 * support 512GB
	 */
	static final int PFNNID_MAP_MAX = 2;//512;

	char[] pfnnid_map = new char[PFNNID_MAP_MAX];
	static final long max_pfn = PFNNID_MAP_MAX;

	private int pfn_to_nid(int pfn) {
		char r = 0;
		assert (pfn < PFNNID_MAP_MAX);
		r = pfnnid_map[pfn];
		assert r != 0xff;
		return (int) r;
	}

	private boolean pfn_valid(int pfn) {
		if (!CONFIG_DISCONTIGMEM)
			return true;

		int nid = pfn_to_nid(pfn);
		return nid >= 0;
	}

	private void kpageflags_read() {
		if (CONFIG_PROC_PAGE_MONITOR) {
			for (int pfn = 0; pfn < max_pfn; pfn++) {
				pfn_valid(pfn);
			}
		}
	}

	protected void setup_bootsmem() {
		if (CONFIG_DISCONTIGMEM) {
			fill(pfnnid_map, (char) 0xff);
		}
	}

	private void fill(char[] array, char c) {
		for (int i = 0; i < array.length; i++) {
			array[i] = c;
		}
	}

	public int run() {
		setup_bootsmem();
		if (CONFIG_PROC_PAGE_MONITOR) {
			kpageflags_read();
		}
		return 0;
	}

	public static void main(String[] args) {
		new Linux2().run();
	}
}
