package __basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class collection {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(7);
		a.add(9);
		a.add(1);
		a.add(100);

		Collections.sort(a, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1; // o2排在前面, descending order
			}
		});

		System.out.println(a);
	}

}
