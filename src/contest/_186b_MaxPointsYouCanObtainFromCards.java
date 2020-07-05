package contest;

import java.util.Arrays;

public class _186b_MaxPointsYouCanObtainFromCards {

	// wrong solution
	// not a 2 pointer question
	public int maxScore_0(int[] cardPoints, int k) {
		int l = 0;
		int r = cardPoints.length - 1;
		int res = 0;

		while (l <= r && k > 0) {
			if (cardPoints[l] < cardPoints[r]) {
				res += cardPoints[r];
				r--;
			} else {
				res += cardPoints[l];
				l++;
			}
			k--;
		}
		return res;
	}

	// solution learned from uwi
	public int maxScore_2(int[] cardPoints, int k) {
		int n = cardPoints.length;
		int[] cum = new int[n + 1];

		for (int i = 0; i < n; i++) {
			cum[i + 1] = cum[i] + cardPoints[i];
		}

		int res = 0;
		// when fromLeft=0, take all cards from right
		for (int fromLeft = 0; fromLeft <= k; fromLeft++) {
			int cumright = cum[n] - cum[n - k + fromLeft];

			res = Math.max(res, cum[fromLeft] + cumright);
		}
		return res;
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 1 };
		int n = a.length;
		int[] cum = new int[n + 1];

		for (int i = 0; i < n; i++) {
			cum[i + 1] = cum[i] + a[i];
		}
		// cum = [0, 1, 3, 6, 10, 15, 21, 22]
		System.out.println(Arrays.toString(cum));
		
		
		
	}
}
