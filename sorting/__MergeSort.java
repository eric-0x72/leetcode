package sorting;

import java.util.Arrays;

// https://www.cs.cmu.edu/~adamchik/15-121/lectures/Sorting%20Algorithms/code/MergeSort.java
public class __MergeSort {

	public static void mergeSort(int[] a) {
		int[] temp = new int[a.length];
		mergeSort(a, temp, 0, a.length - 1);
	}

	// sort array [l, r]
	public static void mergeSort(int[] a, int[] temp, int l, int r) {
		if (l >= r) {
			// single element is sorted
			return;
		}

		int mid = (l + r) / 2;

		// divide and sort phase
		mergeSort(a, temp, l, mid); // already sorted [l, mid]
		mergeSort(a, temp, mid + 1, r); // already sorted [mid+1, r]

		// merge phase: merge two already sorted arrays
		merge(a, temp, l, mid + 1, r);
	}

	// merge two sorted arrays
	// [l, r-1] and [r, rEnd]
	private static void merge(int[] a, int[] temp, int l, int r, int rEnd) {
		int lEnd = r - 1;
		int cur = l; // current pointer

		int size = rEnd - l + 1; // size of crrent array

		while (l <= lEnd && r <= rEnd) {
			if (a[l] <= a[r])
				temp[cur++] = a[l++];
			else
				temp[cur++] = a[r++];
		}

		while (l <= lEnd) { // Copy rest of left half
			temp[cur++] = a[l++];
		}
		while (r <= rEnd) { // Copy rest of right half
			temp[cur++] = a[r++];
		}

		// Copy temp back to a
		for (int i = 0; i < size; i++, rEnd--) {
			a[rEnd] = temp[rEnd];
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 6, 3, 5, 1, 100, 71 };
		mergeSort(a);
		System.out.println(Arrays.toString(a));
	}
}
