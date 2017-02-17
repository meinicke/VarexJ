package linux;

import java.util.Arrays;

import gov.nasa.jpf.annotation.Conditional;

/**
 * http://vbdb.itu.dk/?#bug/linux/91ea820
 * 
 * @author Jens Meinicke
 *
 */
public class Linux5 {

	@Conditional
	public static boolean CONFIG_DISCONTIGMEM = true;
	@Conditional
	public static boolean CONFIG_PROC_PAGE_MONITOR = true;
	@Conditional
	public static boolean CONFIG_PARISC = true;
	
	public final static int MAX_PHYSMEM_RANGES = 8;

	public static int PFNNID_MAP_MAX;

	public static int[] node_data;
	
	public static int max_pfn;
	
	static {
		if (CONFIG_DISCONTIGMEM) {
			node_data = new int[maxNumnodes()];
			PFNNID_MAP_MAX = 512;/* support 512GB */
			pfnnid_map = new char[PFNNID_MAP_MAX];
			max_pfn = PFNNID_MAP_MAX;
		} else {
			max_pfn = 0;
		}
	}
	
	public static int node_end_pfn(int nid) {
		return node_data[nid];
	}

	public static int maxNumnodes() {
		int maxNum = 1;
		if (CONFIG_PARISC)  {
			maxNum = maxNum << 3;
		}
		return maxNum;
	}

	public static int NODE_DATA(int nid) {
		if (CONFIG_DISCONTIGMEM) {
			return node_data[nid];
		}
		return -1;
	}

	public static char[] pfnnid_map;

	public static int pfn_to_nid(int pfn) {
		if (CONFIG_DISCONTIGMEM) {
			assert pfn < PFNNID_MAP_MAX;
			return (int) (pfnnid_map[pfn]);
		} else {

		}
		return -1;
	}

	public static boolean pfn_valid(int pfn) {
		if (CONFIG_DISCONTIGMEM) {
			int nid = pfn_to_nid(pfn);
			if (nid >= 0) {
				int node_end_pfn = node_end_pfn(nid);
				return pfn < node_end_pfn;
			}
			return false;
		}
		return true;
	}

	public static void setupBootmem() {
		if (CONFIG_DISCONTIGMEM) {
			Arrays.fill(pfnnid_map, (char) 0xff);
		}
	}

	public static int kpageflagsRead() {
		if (CONFIG_PROC_PAGE_MONITOR) {
			for (int pfn = 0; (pfn < max_pfn); pfn++) {
				if (pfn_valid(pfn)) {
					;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		try {
			setupBootmem();
			if (CONFIG_PROC_PAGE_MONITOR) {
				kpageflagsRead();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
