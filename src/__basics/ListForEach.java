package __basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListForEach {

	public static void main(String[] args) {

		System.out.println(Arrays.asList(1, 2, 3));

		// -------------------- list for each --------------------
		Queue<String> q = new LinkedList<>();

		List<List<String>> li = new LinkedList<>();
		li.add(Arrays.asList("a", "b"));
		li.add(Arrays.asList("c", "d"));

		// for each list e, add strings into queue
		li.forEach(e -> q.addAll(e));

		System.out.println(q);
	}
}
