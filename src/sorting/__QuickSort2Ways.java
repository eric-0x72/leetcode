package sorting;

import java.util.Arrays;

public class __QuickSort2Ways {

	private static void sort(int[] arr, int l, int r) {
		if (l >= r)
			return;

		int p = partition(arr, l, r);

		sort(arr, l, p - 1); // let r=p-1
		sort(arr, p + 1, r); // let l=p+1
	}

	private static int partition(int[] arr, int l, int r) {

		int pivot = arr[l];
		int i = l + 1;
		int j = r;

		while (true) {
			// stop at point >= pivot
			while (i <= r && arr[i] < pivot)
				i++;

			// stop at point <= pivot
			while (j >= l + 1 && arr[j] > pivot)
				j--;

			if (i > j)
				break;

			swap(arr, i++, j++);
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
		int[] a = { 9, 8, 7, 6, 5, 4 };
		sort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

}
