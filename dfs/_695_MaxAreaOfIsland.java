package dfs;

// solved at 2020.6.18

public class _695_MaxAreaOfIsland {
	int m;
	int n;

	public int maxAreaOfIsland(int[][] grid) {
		m = grid.length;
		n = grid[0].length;
		int res = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					res = Math.max(res, dfs(grid, i, j));
				}
			}
		}
		return res;
	}

	private int dfs(int[][] grid, int x, int y) {
		if (x < 0 || y < 0 || x >= m || y >= n) {
			return 0;
		}

		if (grid[x][y] == -1 || grid[x][y] == 0) {
			return 0;
		}

		// flag as visited
		grid[x][y] = -1;

		int up = dfs(grid, x - 1, y);
		int right = dfs(grid, x, y + 1);
		int down = dfs(grid, x + 1, y);
		int left = dfs(grid, x, y - 1);

		return up + right + down + left + 1;
	}

}
