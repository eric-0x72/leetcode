package sorting;

public class __Median {

	// even: {pos(n/2) + pos(n/2 - 1)} / 2
	// odd: pos(n/2)
	public static void main(String[] args) {

		// even array
		int[] even = { 1, 2, 3, 4, 5, 6 };
		// sum of pos 3 and pos 2, then divide by 2
		double res = (double) (even[6 / 2] + even[6 / 2 - 1]) / 2;
		System.out.println(res);

		// odd array
		int[] odd = { 1, 2, 3, 4, 5 };
		res = (double) (odd[5 / 2]); // position 2
		System.out.println(res);
	}

}
