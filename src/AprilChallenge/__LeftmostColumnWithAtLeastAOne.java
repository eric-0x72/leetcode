package AprilChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// This is the BinaryMatrix's API interface
// You should not implement it, or speculate about its implementation
/*
 * interface BinaryMatrix {
	public int get(int x, int y) {}

	public List<Integer> dimensions{}
};*/
class BinaryMatrix {
	int[][] data = new int[2][2];

	public int get(int x, int y) {
		return data[x][y];
	}

	public List<Integer> dimensions() {
		return Arrays.asList(2, 2);
	}
}

public class __LeftmostColumnWithAtLeastAOne {

//	private int[] bs(int l, int r, BinaryMatrix mat) {
//
//		int res = 0;
//
//		for (int i = 0; i < r; i++) {
//			
//			while (l <= r) {
//				int mid = (l + r) / 2;
//				if (mat.get(i, mid) == 1) {
//					return new int[] { i, mid };
//				}
//				
//				else if () {
//					
//				}
//				
//			}
//
//		}
//	}

	public int leftMostColumnWithOne(BinaryMatrix mat) {

		List<Integer> shape = mat.dimensions();
		int m = shape.get(0);
		int n = shape.get(1);
		int res = n - 1;
		boolean flag = false;

		outer: for (int i = 0; i < m; i++) {

//			inner: for (int j = 0; j < n; j++) {
//				if (mat.get(i, j) == 1) {
//					res = Math.min(res, j);
//					flag = true;
//					break inner;
//				}
//			}

			int l = 0, r = n - 1;
			while (l <= r) {
				int mid = (l + r) / 2;
				int midvalue = mat.get(i, mid);

				if (midvalue == 1) {
					res = Math.min(res, mid);
					flag = true;
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			}

		}
		return flag ? res : -1;
	}

}
