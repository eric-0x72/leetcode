package lcOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _29_SpiralOrderPrintMatrix {

	// starting point right, then turn clockwise
	int[][] d = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
	int row, col;
	boolean[][] visited;
	List<Integer> res = new ArrayList<>();

	public int[] spiralOrder(int[][] matrix) {

		if (matrix.length == 0)
			return new int[0];

		row = matrix.length;
		col = matrix[0].length;
		visited = new boolean[row][col];

		int x = 0, y = 0, direction = 0;

		for (int i = 0; i < row * col; i++) {
			res.add(matrix[x][y]);
			visited[x][y] = true;

			int newx = x + d[direction][0];
			int newy = y + d[direction][1];

			if (isvalid(newx, newy) && !visited[newx][newy]) {
				x = newx;
				y = newy;
			} else {
				direction = (direction + 1) % 4;

				x = x + d[direction][0];
				y = y + d[direction][1];
			}

		}

		int[] res1 = new int[res.size()];
		for (int i = 0; i < res.size(); i++) {
			res1[i] = res.get(i);

		}
		return res1;
	}

	private boolean isvalid(int x, int y) {
		return x >= 0 && y >= 0 && x < row && y < col;
	}

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(12);

		Integer[] a = new Integer[12];
		li.toArray(a);

		System.out.println(Arrays.toString(a));

	}
}
