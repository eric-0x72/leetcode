package frequent;

import java.util.Arrays;

public class _361_BombEnemy {

	public static int maxKilledEnemies(char[][] grid) {

		if (grid.length == 0 || grid[0].length == 0)
			return 0;

		int rows = grid.length;
		int cols = grid[0].length;

		int rowkill = 0;
		int[] colkill = new int[cols];
		int res = 0;

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {

				if (c == 0 || grid[r][c - 1] == 'W') {
					rowkill = 0; // 如果左边�?行是w, rowkill清零

					// 从本列，累加到最右侧不是w的位�? ; 注意在同�?�?
					for (int k = c; k < cols && grid[r][k] != 'W'; k++)
						rowkill += grid[r][k] == 'E' ? 1 : 0;
				}

				if (r == 0 || grid[r - 1][c] == 'W') {
					colkill[c] = 0; // 如果上面�?列是w, colkill[c]清零

					// 从本行，累加到最下面不是w的一行；注意是在同一个c�?
					for (int k = r; k < rows && grid[k][c] != 'W'; k++)
						colkill[c] += grid[k][c] == 'E' ? 1 : 0;
				}

				if (grid[r][c] == '0')
					res = Math.max(res, rowkill + colkill[c]);
			}
		}
		return res;
	}

	public static void main(String[] args) {

		char[][] a = { { '0', 'E', '0', '0' }, { 'E', '0', 'W', 'E' }, { '0', 'E', '0', '0' } };
		// System.out.println(Arrays.deepToString(a));

		int res = maxKilledEnemies(a);
		System.out.println(res);
	}

}
