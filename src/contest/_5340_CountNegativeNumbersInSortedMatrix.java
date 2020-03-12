package contest;

import jdk.dynalink.linker.ConversionComparator;

public class _5340_CountNegativeNumbersInSortedMatrix {

	public static int countNegatives(int[][] grid) {
		int rows = grid.length;
		int cols = grid[0].length;

		int count = 0;
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < rows; j++) {
				if (grid[i][j] < 0)
					count++;
			}
		return count;
	}

	public static void main(String[] args) {
		int[][] a = { { 5, 1, 0 }, { -5, -5, -5 } };
		int res = countNegatives(a);
		System.out.println(res);
	}
}
