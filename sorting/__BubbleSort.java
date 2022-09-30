package sorting;

import java.util.Arrays;

public class __BubbleSort {

	public static void bubbleSort(int[] arr) {
		int n = arr.length;

		// [0, n-2]
		for (int i = 0; i <= n - 2; i++) {

			// j is [n-1, i+1] decreasing
			// why i+1? since check to swap i+1 with i
			for (int j = n - 1; j >= i + 1; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				}
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] a = { 9, 8, 7, 6, 5, 4, 3, };
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
}
