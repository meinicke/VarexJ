package linux1;

import gov.nasa.jpf.annotation.Conditional;

/**
 * http://vbdb.itu.dk/?#bug/linux/f7ab9b4
 * 
 * @author Jens Meinicke
 *
 */
public class LinuxArray {

	@Conditional
	static boolean CONFIG_TMPFS = false;
	@Conditional
	static boolean CONFIG_SHMEM = true;
	@Conditional
	static boolean CONFIG_DRM_I915 = true;

	static final filler_t someFun = new filler_t() {

		public int invoke(int i) {
			return i;
		}
	};

	private static filler_t f = CONFIG_TMPFS ? someFun : null;

	filler_t shmem_get_inode() {
		if (CONFIG_SHMEM) {
			return f;
		} else {
			return someFun;
		}
	}

	filler_t shmem_file_setup() {
		return shmem_get_inode(); // (10)
	}

	int drm_gem_object_init(filler_t[] readpage) {
		readpage[0] = shmem_file_setup(); // (9)
		return 0;
	}

	void i915_gem_alloc_object(filler_t[] readpage) {
		if (drm_gem_object_init(readpage) != 0)
			;
	}

	void do_read_cache_page(filler_t filler) {
		filler.invoke(0); // ERROR (18)
	}

	void read_cache_page_gfp(filler_t[] readpage) {
		filler_t filler = readpage[0];
		do_read_cache_page(filler);
	}

	int i915_gem_object_get_pages_gtt(filler_t[] readpage) {
		read_cache_page_gfp(readpage);
		return 0;
	}

	int intel_init_ring_buffer(filler_t[] readpage) {
		i915_gem_alloc_object(readpage);
		return i915_gem_object_get_pages_gtt(readpage);
	}

	int i915_load_modeset_init(filler_t[] readpage) {
		return intel_init_ring_buffer(readpage);
	}

	int i915_driver_load() {
		filler_t[] readpage = new filler_t[1];
		return i915_load_modeset_init(readpage);
	}

	public static void main(String[] args) {
		LinuxArray la = new LinuxArray();
		if (CONFIG_DRM_I915) {
			la.i915_driver_load();
		}
	}

}
