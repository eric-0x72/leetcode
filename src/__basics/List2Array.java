package __basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List2Array {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();
		li.add(12);
		li.add(3);

		// resulting Integer array
		Integer[] res = new Integer[li.size()];
		li.toArray(res); // conversion

		System.out.println(Arrays.toString(res));
	}
}
