package sorting;

import java.util.Arrays;

public class __SelectionSort {

	public static void selectionSort(int[] arr) {
		int n = arr.length;

		// position to remain sorted
		for (int i = 0; i < n; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			swap(arr, i, minIndex);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {

		int[] a = { 3, 6, 1, 9, 2, 0 };
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}

}
