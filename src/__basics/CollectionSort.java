package __basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSort {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(12);
		a.add(7);
		a.add(1);
		a.add(100);

		Collections.sort(a, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println(a);

		// array sort, ascending order only for the primitive type array int[]
		int[] arr = { 6, 7, 3, 1, 0, 12, 9 };
		Arrays.sort(arr);
		System.out.println("arr ascend order: " + Arrays.toString(arr));

		// now, how about descending?
		// we first sort ascending, then mirror it!!
		for (int l = 0, r = arr.length - 1; l < r; l++, r--) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
		}
		System.out.println("... and after mirror, get the desc: " + Arrays.toString(arr));

	}

}
