package frequent;

import java.util.Arrays;

import javax.print.attribute.standard.PDLOverrideSupported;

/**
 * Your NumMatrix object will be instantiated and called as such:
 * 
 * NumMatrix obj = new NumMatrix(matrix);
 * 
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 * 
 */
public class _304_RangeSumQuery2D {

	private int[][] dp;

	public _304_RangeSumQuery2D(int[][] matrix) {

		if (matrix.length == 0 || matrix[0].length == 0)
			return;

		int n = matrix.length;
		int m = matrix[0].length;

		dp = new int[n][m];
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < m; col++) {
				// if col==0, then keep matrix element
				dp[row][col] = (col >= 1 ? dp[row][col - 1] + matrix[row][col] : matrix[row][col]);
			}
		}

		System.out.println(Arrays.deepToString(dp));
	}

	public int sumRegion(int row1, int col1, int row2, int col2) {

		int sum = 0;
		for (int row = row1; row <= row2; row++) {
			sum += dp[row][col2] - (col1 >= 1 ? dp[row][col1 - 1] : 0);
		}
		return sum;
	}

	public static void main(String[] args) {

		int[][] mat = { { -1 } };
		_304_RangeSumQuery2D a = new _304_RangeSumQuery2D(mat);
		int res = a.sumRegion(0, 0, 0, 0);
		System.out.println(res);
	}
}
