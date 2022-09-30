package frequent;

import java.util.ArrayList;
import java.util.List;

public class _54_SpiralMatrix {

	// static int[][] d = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
	static int[][] d = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
	static boolean[][] visited;
	static int rows, cols;
	static List<Integer> res = new ArrayList<>();

	public static List<Integer> spiralOrder(int[][] matrix) {

		if (matrix.length == 0)
			return res;

		rows = matrix.length;
		cols = matrix[0].length;
		visited = new boolean[rows][cols];

		int x = 0, y = 0;
		int direction = 0;

		for (int i = 0; i < rows * cols; i++) {
			System.out.println(x + " " + y);
			System.out.println(matrix[x][y]);
			res.add(matrix[x][y]);
			visited[x][y] = true;

			int newx = x + d[direction][0];
			int newy = y + d[direction][1];

			if (isValid(newx, newy) && !visited[newx][newy]) {
				x = newx;
				y = newy;
			} else {
				direction = (direction + 1) % 4;

				x = x + d[direction][0];
				y = y + d[direction][1];
			}
		}
		return res;

	}

	private static boolean isValid(int x, int y) {
		return (x >= 0 && x < rows && y >= 0 && y < cols);
	}

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		List res = spiralOrder(a);
		System.out.println(res);
	}
}
