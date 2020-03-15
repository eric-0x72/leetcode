package __basics;

import java.util.Arrays;
import java.util.Collections;

import com.sun.tools.classfile.Annotation.Primitive_element_value;

public class SortIntArray {
	public static void main(String[] args) {

		int[] a = { 4, 25, 9, 36, 49 };
		Integer[] copy = new Integer[a.length];
		for (int i = 0; i < a.length; i++)
			copy[i] = a[i];

		Arrays.sort(copy, Collections.reverseOrder());

		System.out.println(Arrays.toString(copy));

	}
}
