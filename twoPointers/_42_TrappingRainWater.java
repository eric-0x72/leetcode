package twoPointers;

public class _42_TrappingRainWater {

	public static int trap(int[] height) {
		int n = height.length;
		int exist = 0, total = 0;

		int[] left = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, height[i]);
			left[i] = max;
			exist += height[i];
		}

		int[] right = new int[n];
		max = 0;
		for (int i = n - 1; i >= 0; i--) {
			max = Math.max(max, height[i]);
			right[i] = max;
		}

		// final step
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			res[i] = Math.min(left[i], right[i]);
			total += res[i];
		}

		return total - exist;
	}

	/**
	 * https://zhuanlan.zhihu.com/p/125074613
	 */
	public static int trap_2(int[] height) {
		int l = 0;
		int r = height.length - 1;

		// store the max seen so far from left and right
		int lmax = 0, rmax = 0;
		int res = 0;

		// case = is the final case where the last element is visited
		while (l <= r) {
			// res depends on lmax
			if (lmax < rmax) {
				lmax = Math.max(lmax, height[l]); // update lmax
				res += lmax - height[l];
				l++;
			}
			// res depends on rmax
			else {
				rmax = Math.max(rmax, height[r]); // update rmax
				res += rmax - height[r];
				r--;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		// int[] a = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int[] a = { 2, 0, 2 };
		int res = trap_2(a);
		System.out.println(res);
	}
}
