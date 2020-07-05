package bfs;

import java.util.ArrayDeque;
import java.util.Queue;

public class _994_RottingOranges_ {

	int[][] d = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	public int orangesRotting(int[][] grid) {
		Queue<int[]> q = new ArrayDeque<>();

		int m = grid.length;
		int n = grid[0].length;

		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 2) {
					q.offer(new int[] { i, j });
				} else if (grid[i][j] == 1) {
					count++;
				}
			}
		}

		if (count == 0) {
			return 0;
		}

		int res = 0;
		while (!q.isEmpty()) {
			res++;
			int size = q.size();

			for (int i = 0; i < size; i++) {
				int[] pos = q.poll();

				// explore 4 directions
				for (int k = 0; k < 4; k++) {
					int x = pos[0] + d[k][0];
					int y = pos[1] + d[k][1];

					if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 1) {
						grid[x][y] = 2;
						q.offer(new int[] { x, y });
						count--;
					}
				}
			}
		} // end while
		return count == 0 ? res - 1 : -1;
	}
}
