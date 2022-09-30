package array;

public class _896_MonotonicArray {

	public boolean isMonotonic(int[] A) {

		int n = A.length;
		boolean inc = true;
		boolean dec = true;

		for (int i = 0; i < n - 1; i++) {
			if (A[i] > A[i + 1]) {
				inc = false;
			}
			if (A[i] < A[i + 1]) {
				dec = false;
			}
		}
		return inc || dec;
	}

}
