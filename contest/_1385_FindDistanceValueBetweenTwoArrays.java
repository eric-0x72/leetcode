package contest;

public class _1385_FindDistanceValueBetweenTwoArrays {

	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		int res = 0;
		for (int a : arr1) {
			int temp = 1;
			for (int b : arr2) {
				if (Math.abs(a - b) <= d)
					temp = 0;
			}
			res += temp;
		}
		return res;
	}

	public int findTheDistanceValue2(int[] arr1, int[] arr2, int d) {
		int res = arr1.length;
		outer: 
		for (int a : arr1) {
			for (int b : arr2) {
				if (Math.abs(a - b) <= d) {
					res--;
					continue outer;
				}
			}
		}
		return res;
	}

}
