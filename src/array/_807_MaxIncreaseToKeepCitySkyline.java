package array;

/**
 *
 *
 *
 */
public class _807_MaxIncreaseToKeepCitySkyline {

	public int maxIncreaseKeepingSkyline(int[][] grid) {

		int rows = grid.length;
		int cols = grid[0].length;

		int[] rmax = new int[rows];
		int[] cmax = new int[cols];

		int res = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				int cur = grid[i][j];
				rmax[i] = Math.max(rmax[i], cur);
				cmax[j] = Math.max(cmax[j], cur);
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int cur = grid[i][j];

				int temp = Math.min(rmax[i], cmax[j]);

				res += temp - cur;

			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Integer a = 12 ;
		int b = a.hashCode() ; 
		
		System.out.println("a".hashCode());
	}
}
