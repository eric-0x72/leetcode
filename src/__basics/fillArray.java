package __basics;

import java.util.Arrays;

public class fillArray {

	public static void main(String[] args) {

		double[][] matrix = new double[20][4];

		// Fill each row with 1.0
		for (double[] row : matrix)
			Arrays.fill(row, 1.0);

		System.out.println(Arrays.toString(matrix[0]));

	}

}
