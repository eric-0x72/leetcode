package backtracking;

public class _1219_PathWithMaxGold {

	static int m, n;

	public static int getMaximumGold(int[][] grid) {
		m = grid.length;
		n = grid[0].length;

		int res = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int temp = backtrack(grid, i, j, 0);
				res = Math.max(res, temp);
			}
		}
		return res;
	}

	// return the max that we can find, starting from position (i,j)
	private static int backtrack(int[][] grid, int i, int j, int sum) {
		if (i < 0 || i >= m || j < 0 || j >= n)
			return sum;
		if (grid[i][j] == 0 || grid[i][j] == -1) // if hit boundary or path visited already
			return sum;

		// a copy of current grid value
		int value = grid[i][j]; // a copy of current visiting position
		grid[i][j] = -1; // set state to visited

		int temp = value + sum; // current solution

		// try out 4 directions
		int a = backtrack(grid, i + 1, j, temp);
		int b = backtrack(grid, i, j + 1, temp);
		int c = backtrack(grid, i - 1, j, temp);
		int d = backtrack(grid, i, j - 1, temp);

		// return the max from 4 directions
		int max = max(a, b, c, d);

		grid[i][j] = value; // restore state

		return max;
	}

	private static int max(int a, int b, int c, int d) {
		int i = Math.max(a, b);
		int j = Math.max(c, d);
		return Math.max(i, j);
	}

	public static void main(String[] args) {
		int[][] a = new int[][] { { 0, 6, 0 }, { 5, 8, 7 }, { 0, 9, 0 } };
		int res = getMaximumGold(a);
		System.out.println(res);
	}
}
