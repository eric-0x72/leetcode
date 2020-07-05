package sorting;

import java.util.Arrays;

public class __InsertionSort {

	public static void insertionSort(int[] arr) {
		int n = arr.length;

		// [0, j-1] is sorted
		for (int j = 1; j < n; j++) {
			int cur = arr[j]; // currently checking

			int i = j - 1; // i is last sorted item j-1

			while (i >= 0 && arr[i] > cur) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = cur;
		}
	}

	public static void main(String[] args) {
		int[] a = { 9, 8, 7, 6, 5, 4, 3 };
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}

}
