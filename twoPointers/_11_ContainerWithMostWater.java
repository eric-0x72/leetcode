package twoPointers;

public class _11_ContainerWithMostWater {

	// idea: move min of l and r towards center to increase area
	public int maxArea(int[] height) {
		int l = 0;
		int r = height.length - 1;

		int res = (l - r + 1) * Math.min(height[l], height[r]);

		// stop condition is not equal
		while (l < r) {

			if (height[l] <= height[r]) {
				l++;
			} else {
				r--;
			}
			int cur = (l - r + 1) * Math.min(height[l], height[r]);
			res = Math.max(res, cur);

		} // end while
		return res;
	}

}
