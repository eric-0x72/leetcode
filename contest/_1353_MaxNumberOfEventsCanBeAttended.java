package contest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class _1353_MaxNumberOfEventsCanBeAttended {

	public static int maxEvents(int[][] events) {
		int n = events.length;

		Arrays.sort(events, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});

		int p = 0;
		int ans = 0;

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int day = 1; day <= 100000; day++) {

			while (p < n && events[p][0] == day) {
				pq.add(events[p][1]);
				p++;
			}

			while (!pq.isEmpty()) {
				int end = pq.poll();

				if (end < day)
					continue;

				ans++;
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 1 }, { 1, 2 }, { 1, 3 }, { 1, 4 }, { 1, 5 }, { 1, 6 }, { 1, 7 } };
		int res = maxEvents(a);
		System.out.println(res);
	}
}