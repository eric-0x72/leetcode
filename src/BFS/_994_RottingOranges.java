package bfs;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class _994_RottingOranges {

	int[][] d = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	public int orangesRotting(int[][] grid) {

		int m = grid.length;
		int n = grid[0].length;

		// q keeps position of rotten oranges
		Queue<int[]> q = new ArrayDeque<>();

		int count = 0; // number of good oranges

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				// rotten
				if (grid[i][j] == 2) {
					q.offer(new int[] { i, j });
				}

				// good
				else if (grid[i][j] == 1) {
					count++;
				}
			}
		}

		if (count == 0)
			return 0;

		int res = 0;

		while (!q.isEmpty()) {
			// another minute
			res++;

			int size = q.size(); // size to store the original queue

			for (int i = 0; i < size; i++) {
				int[] pos = q.poll();

				for (int k = 0; k < 4; k++) {
					int x = pos[0] + d[k][0];
					int y = pos[1] + d[k][1];

					if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0 || grid[x][y] == 2)
						continue;

					grid[x][y] = 2;
					q.offer(new int[] { x, y });
					count--; // rot one good orange
				}
			}
		}

		// res-1 if there is no more good oranges
		return count == 0 ? res - 1 : -1;
	}

}
