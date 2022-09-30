package frequent;

public class _200_NumberOfIslands {

	private static int[][] d = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
	private static int row, col;
	private static boolean[][] visited;
	private static int res;

	public static int numIslands(char[][] grid) {

		row = grid.length;
		col = grid[0].length;

		visited = new boolean[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				if (grid[i][j] == '1' && !visited[i][j]) {
					dfs(grid, i, j);
					res++;
				}

			}
		}
		return res;
	}

	private static void dfs(char[][] grid, int x, int y) {

		// visited[x][y] = true;

		for (int i = 0; i < 4; i++) { // ���ĸ�����̽��

			int newx = x + d[i][0];
			int newy = y + d[i][1];

			if (inArea(newx, newy) && !visited[newx][newy] && grid[newx][newy] == '1') {
				visited[newx][newy] = true; // ������Ҫȥnewx, newy����������Ϊ�Ѿ����ʹ�
				dfs(grid, newx, newy);
			}
		}
		return;
	}

	private static boolean inArea(int x, int y) {
		return x >= 0 && x < row && y >= 0 && y < col;
	}

	public static void main(String[] args) {

		char a[][] = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };
		int res = numIslands(a);
		System.out.println(res);
	}
}
