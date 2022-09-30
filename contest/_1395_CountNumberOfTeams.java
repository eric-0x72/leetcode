package contest;

import java.util.Arrays;

public class _1395_CountNumberOfTeams {

	public int numTeams(int[] rating) {
		int n = rating.length;
		int res = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (rating[i] < rating[j] && rating[j] < rating[k])
						res++;
					if (rating[i] > rating[j] && rating[j] > rating[k])
						res++;
				}
			}
		}
		return res;
	}

	/**
	 * learned DP solution
	 * 
	 * too hard, give up for now
	 * 
	 */
	public static int numTeams_2(int[] rating) {
		int dp1[][] = new int[6][2];
		int dp2[][] = new int[6][2];

		for (int i = 1; i < rating.length; i++) {
			for (int j = 0; j < i; j++) {

				if (rating[j] < rating[i]) {
					dp1[i][0]++; // left of j, <j
					dp1[j][1]++; // right of j, >j
				} else {
					dp2[i][0]++;
					dp2[j][1]++;
				}
			}
		}
		System.out.println(Arrays.deepToString(dp1));
		System.out.println(Arrays.deepToString(dp2));
		return -1;
	}

	public static void main(String[] args) {
		numTeams_2(new int[] { 2, 5, 3, 4, 1, 12 });
	}

}
