package __basics;

import java.util.Arrays;

public class ShallowDeepCopy {

	static int[] arrShallow;
	static int[] arrDeep;

	private static void copyShallow(int[] arr) {
		arrShallow = arr;
	}

	private static void showShallow() {
		System.out.println(Arrays.toString(arrShallow));
	}

	private static void copyDeep(int[] arr) {
		arrDeep = new int[arr.length];

		for (int i = 0; i < arrDeep.length; i++) {
			arrDeep[i] = arr[i];
		}
	}

	private static void showDeep() {
		System.out.println(Arrays.toString(arrDeep));
	}

	public static void main(String[] args) {

		// shallow copy
		int[] a = { 1, 2, 3 };
		copyShallow(a);
		showShallow();
		a[0] = 9;
		showShallow();

		// deep copy
		int[] b = { 1, 2, 3 };
		copyDeep(b);
		showDeep();
		a[0] = 9;
		showDeep();

	}

}
