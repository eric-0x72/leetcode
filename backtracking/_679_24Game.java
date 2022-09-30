package backtracking;

public class _679_24Game {

	// https://www.youtube.com/watch?v=Vbcl5jmm05E
	public boolean judgePoint24(int[] nums) {
		double[] a = new double[] { nums[0], nums[1], nums[2], nums[3] };
		return backtrack(a);
	}

	private boolean backtrack(double[] a) {
		if (a.length == 1)
			return Math.abs(a[0] - 24) < 0.0001;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				double[] b = new double[a.length - 1];

				for (int k = 0; k < a.length; k++) {
					int index = 0;
					if (k != i && k != j) {
						b[index++] = a[k];
					}
				}

				for (double d : compute(a[i], a[j])) {
					b[b.length - 1] = d; // add to last

					// return true when reach base case
					if (backtrack(b))
						return true;
					
				} // end for
			}
		}
		return false;
	}

	private double[] compute(double x, double y) {
		return new double[] { x + y, x * y, x - y, y - x, x / y, y / x };
	}

}
