package contest;

import java.util.Arrays;
import java.util.Comparator;

public class _5323_SortIntegersByTheNumberOf1Bits {

	public int[] sortByBits(int[] arr) {

		Integer[] arr1 = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}

		Arrays.sort(arr1, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int a = Integer.bitCount(o1);
				int b = Integer.bitCount(o2);

				if (a == b)
					return o1 - o2; // 如果

				return a - b; // ascending order
			}
		});

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr1[i];
		}

		return arr;

	}

	public static void main(String[] args) {
		int a = 11;

		int res = Integer.bitCount(a);
		System.out.println(res);
	}

}
