package __basics;

import java.util.Arrays;

public class array2D {

	public static void main(String[] args) {

		// print 2d array
		int[][] arr = new int[5][3];
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], i);
		}
		System.out.println("print 2d array: " + Arrays.deepToString(arr));
	}

}
