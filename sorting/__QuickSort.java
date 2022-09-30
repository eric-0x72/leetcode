package sorting;

import java.util.Arrays;

// QuickSort is a Divide and Conquer algorithm
public class __QuickSort {
	public static void sort(int[] arr) {
		int n = arr.length;
		sort(arr, 0, n - 1);
	}

	// sort interval [l, r)
	public static void sort(int[] arr, int l, int r) {
		if (l >= r)
			return;

		int mid = parition(arr, l, r);

		sort(arr, l, mid - 1);
		sort(arr, mid + 1, r);
	}

	private static int parition(int[] arr, int l, int r) {
		int pivot = arr[l];

		int j = l;
		for (int i = l + 1; i <= r; i++) {
			if (arr[i] < pivot) {
				j++;
				swap(arr, i, j);
			}
		}
		swap(arr, l, j);
		return j;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] a = { 5, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		sort(a);
		System.out.println(Arrays.toString(a));
	}
}
