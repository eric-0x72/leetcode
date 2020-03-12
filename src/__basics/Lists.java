package __basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * List 集合 An ordered collection (aka sequence). The user of this interface has
 * precise control over where in the list each element is inserted.
 * 
 * The user can access elements by their integer index (position in the list),
 * and search for elements in the list.
 *
 * Unlike sets, lists allow duplicate elements
 */
public class Lists {

	public static void main(String[] args) {

		List<String> a = new ArrayList<>();
		List<String> b = new LinkedList<>();

		a.add("hello");
		a.add("world");
		a = Arrays.asList("a", "b", "c");
		a.sort(Collections.reverseOrder()); // sort by reverse order string
		System.out.println(a);

		b.add("1");
		b.add("2");
		b.add("3");
		System.out.println(b.get(0)); // 访问0位置的元素
		b.remove(0);
		System.out.println(b);

		int[] c = new int[12];
		Arrays.sort(c, (x, y) -> 12);

	}

}
