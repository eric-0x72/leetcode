package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class __CountingElements {

	static HashSet<Integer> set = new HashSet<Integer>();

	public static int countElements(int[] arr) {
		for (int a : arr) {
			set.add(a + 1);
		}

		int res = 0;
		for (int a : arr) {
			// System.out.println(a + 1 + " " + s.indexOf(a + 1 + ""));
			if (set.contains(a + 1))
				res++;
		}
		return res;
	}

	private static int sum(List<Integer> li) {
		return li.stream().filter(item -> item != null).reduce(0, (a, b) -> a += b);
	}

	private static int getValue(Integer input) {
		return Optional.ofNullable(input).orElse(0);
	}

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 11, 2);
		int res = sum(li);
		System.out.println(res);
	}
}
