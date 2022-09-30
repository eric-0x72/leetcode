package bfs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class _1197_MinKnightMoves {

	int[][] d = { { 1, 2 }, { -1, 2 }, { -2, 1 }, { -2, -1 }, { -1, -2 }, { 1, -2 }, { 2, -1 }, { 2, 1 } };

	public int minKnightMoves(int x, int y) {

		int[] target = { x, y };
		Queue<int[]> q = new ArrayDeque<>();
		Set<String> set = new HashSet<>();

		int res = 0;

		q.offer(new int[] { 0, 0 });
		while (!q.isEmpty()) {
			res++;

			int size = q.size();
			for (int i = 0; i < size; i++) {

				// visit cur
				int[] cur = q.poll();
				set.add(cur[0] + "" + cur[1]);

				if (Arrays.equals(cur, target))
					return res - 1;

				// add cur's neighbours to q
				travel(cur, q, set);
			}
		}
		return -1;
	}

	private void travel(int[] cur, Queue<int[]> q, Set<String> set) {
		int x = cur[0];
		int y = cur[1];

		for (int i = 0; i < 8; i++) {
			int newx = x + d[i][0];
			int newy = y + d[i][1];
			set.add(cur[0] + "" + cur[1]);
			int[] newarr = { newx, newy };

			if (!seen(newarr, set)) {
				q.offer(newarr);
			}
		}
	}

	private boolean seen(int[] arr, Set<String> set) {
		return set.contains(arr[0] + "" + arr[1]);
	}

	public static void main(String[] args) {
		HashSet<int[]> set = new HashSet<>();
		set.add(new int[] { 1, 2 });
		set.add(new int[] { 2, 3 });
		set.add(new int[] { 6, 7 });

		System.out.println(set.contains(new int[] { 1, 2 }));
	}

}
