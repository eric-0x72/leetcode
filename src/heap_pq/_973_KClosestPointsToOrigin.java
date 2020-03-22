package heap_pq;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class _973_KClosestPointsToOrigin {

	public int[][] kClosest(int[][] points, int K) {
		Queue<int[]> q = new PriorityQueue<>((a, b) -> 
				a[0] * a[0] + a[1] * a[1] - b[0] * b[0] - b[1] * b[1]);
		int[][] res = new int[K][2];

		for (int[] e : points) {
			q.add(e);
		}

		for (int i = 0; i < K; i++) {
			res[i] = q.poll();
		}
		return res;
	}
}
