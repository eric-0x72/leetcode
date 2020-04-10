package swardOffer;

import java.util.Arrays;

public class _45_Array2MinNumber {

	public static String minNumber(int[] nums) {
		String[] arr = new String[30];

		int i = 0;
		for (int a : nums) {
			while (a != 0) {
				// System.out.println(i);
				arr[i] = "" + (a % 10);
				// System.out.println(arr[i]);
				a /= 10;
				i++;
			}
		}

		String[] arr1 = new String[i];
		for (int j = 0; j < arr1.length; j++) {
			arr1[j] = arr[j];
		}
		// System.out.println( i );
		// System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		// System.out.println(Arrays.toString(arr1));
		return String.join("", arr1);
	}

	public static void main(String[] args) {
		int[] a = { 3, 30, 34, 5, 9 };
		String[] s = { "a", "b" };
//		String res = minNumber(a);
//		System.out.println("res = " + res);
		System.out.println(String.join("", s));
	}

}
