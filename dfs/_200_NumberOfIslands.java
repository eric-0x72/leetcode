package dfs;

import java.awt.print.Printable;
import java.util.Arrays;

public class _200_NumberOfIslands {
	static int row, col;

	public static int numIslands_correct(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0)
			return 0;

		row = grid.length;
		col = grid[0].length;
		int res = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i][j] == '1') {
					dfs_(grid, i, j);
					res++;
				}
			}
		}
		System.out.println(Arrays.deepToString(grid));
		return res;
	}

	private static void dfs_(char[][] grid, int x, int y) {

		if (x < 0 || y < 0 || x >= row || y >= col)
			return;
		if (grid[x][y] == 'v' || grid[x][y] == '0') // visited
			return;

		grid[x][y] = 'v';

		dfs_(grid, x, y + 1);
		dfs_(grid, x + 1, y);
		dfs_(grid, x, y - 1);
		dfs_(grid, x - 1, y);
	}

	static int[][] d = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
	static int m, n;

	public static int numIslands(char[][] grid) {
		if (grid.length == 0 || grid[0].length == 0)
			return 0;

		m = grid.length;
		n = grid[0].length;
		int res = 0;

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {

				if (grid[i][j] == '1') {
					System.out.println("meet a one");
					// System.out.println("meet a one!");
					dfs(grid, i, j);
					// System.out.println(i + "\t" + j);
					res++;
				}
			}
		System.out.println(Arrays.deepToString(grid));
		return res;
	}

	private static void dfs(char[][] grid, int i, int j) {
		grid[i][j] = 'v';

		// new coordinates, extends to 4 directions
		int i_new = i, j_new = j;

		for (int k = 0; k < 4; k++) {
			i_new = i + d[k][0];
			j_new = j + d[k][1];

			// within range and new position is 1
			// then do dfs on that position
			if (i_new >= 0 && i_new < m && j_new >= 0 && j_new < n && grid[i_new][j_new] == '1') {
				dfs(grid, i_new, j_new);
			}
		}
	}

	public static void main(String[] args) {
		char[][] a = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };

		int res = numIslands(a);
		System.out.println(res);
	}
}
