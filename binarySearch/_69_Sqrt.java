package binarySearch;

public class _69_Sqrt {

	// linear scan
	public int sqrt_0(int x) {
		if (x == 0 || x == 1)
			return x;

		int res = 1;
		while (res * res <= x)
			res += 1;
		return res - 1;
	}

	// using binary search
	public int sqrt(int x) {
		if (x < 2)
			return x;

		int l = 1, r = x;

		// [l, r)
		while (l < r) {

			int mid = l + (r - l) / 2;

			// mid * mid = x, use division to avoid int overflow
			if (mid == x / mid) {
				return mid;
			}

			// mid * mid > x
			else if (mid > x / mid) {
				r = mid; // exclude mid by setting r=mid
			}

			// mid * mid < x
			else {
				l = mid + 1; // exclude mid by setting l = mid+1
			}
		}

		// if not found in while loop, [l, l)
		// then l-1 is the result
		return l - 1;
	}

}
