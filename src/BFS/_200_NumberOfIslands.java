package bfs;

public class _200_NumberOfIslands {

	private int row, col;

	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0)
			return 0;

		row = grid.length;
		col = grid[0].length;

		int res = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i][j] == '1') {
					dfs(grid, i, j);
					res++;
				}
			}
		}
		return res;
	}

	private void dfs(char[][] grid, int x, int y) {

		if (x < 0 || y < 0 || x >= row || y >= col)
			return;
		if (grid[x][y] == 'v' || grid[x][y] == '0') // visited
			return;

		grid[x][y] = 'v'; // set to visited

		dfs(grid, x, y + 1);
		dfs(grid, x + 1, y);
		dfs(grid, x, y - 1);
		dfs(grid, x - 1, y);

		return;
	}

}
