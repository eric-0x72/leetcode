package frequent;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import __basics.priorityQueue;

public class _973_KClosestPointsToOrigin {

	public static int[][] kClosest(int[][] points, int K) {

		int[][] res = new int[K][2];

		// PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] * a[0] + a[1] *
		// a[1] - b[0] * b[0] - b[1] * b[1]);
		Queue<int[]> q = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] * o1[0] + o1[1] * o1[1] - o2[0] * o2[0] - o2[1] * o2[1]; // 小的o1排在前面
			}
		});

		for (int[] p : points) {
			q.add(p);
		}

		int index = 0;
		while (index < K) {
			res[index++] = q.poll();
		}

		return res;
	}

	public static void main(String[] args) {
		int[][] a = { { 3, 3 }, { 5, -1 }, { -2, 4 } };

		int[][] res = kClosest(a, 2);
		System.out.println(Arrays.toString(res));
	}

}
