package frequent;

import java.util.Arrays;
import java.util.List;

public class __test {

	public static void main(String[] args) {

		int[][] a = { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 }, { 0, 0, 0 } };
		int[][] b = a.clone();

		for (int i = 0; i < 4; i++) {
			System.out.println(Arrays.toString(b[i]));
		}

	}
}
