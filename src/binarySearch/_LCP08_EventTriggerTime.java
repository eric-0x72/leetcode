package binarySearch;

// question from LCCN individual competition
public class _LCP08_EventTriggerTime {

	public int[] getTriggerTime(int[][] increase, int[][] requirements) {
		int n = increase.length;
		for (int i = 1; i < n; i++) {
			increase[i][0] += increase[i - 1][0];
			increase[i][1] += increase[i - 1][1];
			increase[i][2] += increase[i - 1][2];
		}

		int l = 0, r = n - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			
			if ()
				
		}

	}
}
