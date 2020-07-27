package binarySearch;

public class _278_FirstBadVersion {

	public int firstBadVersion(int n) {

		// [1 ... n]
		// [1 ... n+1)
		int l = 1;
		int r = n;

		// in the end, l==r
		while (l <= r) {
			int mid = (l + r) / 2;

			if (isBadVersion(mid)) {
				r = mid;
			} else {
				l = mid;
			}
		}
		return l;
	}

	private boolean isBadVersion(int mid) {
		return false;
	}
}
