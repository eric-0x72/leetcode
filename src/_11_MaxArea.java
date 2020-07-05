
public class _11_MaxArea {

	/**
	 * brute force
	 */
	public int maxArea_0(int[] height) {
		int n = height.length;
		int res = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int l = height[i];
				int r = height[j];

				res = Math.max(res, (j - i) * Math.min(l, r));
			}
		}
		return res;
	}

	/**
	 * two pointers
	 */
	public int maxArea_1(int[] height) {
		int l = 0;
		int r = height.length - 1;
		int res = 0;

		// not equal since we are calculating the area in middle
		while (l < r) {

			// if left bar is limiting the area, move left to right
			if (height[l] < height[r]) {
				res = Math.max(res, height[l] * (r - l));
				l++;
			}
			// move right bar to left
			else {
				res = Math.max(res, height[r] * (r - l));
				r--;
			}
		}
		return res;
	}

}
