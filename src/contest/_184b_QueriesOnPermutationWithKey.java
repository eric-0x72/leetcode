package contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class _184b_QueriesOnPermutationWithKey {

	public int[] processQueries(int[] queries, int m) {
		int n = queries.length;
		int[] res = new int[n];

		int[] p = new int[m];
		for (int i = 0; i < m; i++) {
			p[i] = i + 1;
		}

		List<Integer> li = Arrays.stream(p).boxed().collect(Collectors.toList());

		// do query
		for (int i = 0; i < n; i++) {
			int pos = li.indexOf(queries[i]);
			res[i] = pos;

			li.remove(pos);
			li.add(0, queries[i]);
		}
		return res;
	}

	public static void main(String[] args) {

//		List<Integer> a = new ArrayList<>(); // = Arrays.asList(1, 2, 3, 4, 5, 6);
//		a.add(1);
//		a.add(2);
//		a.remove(0);
//		a.add(0, 999);
//		System.out.println(a);

		int[] a = { 1, 2, 3, 4 };
		// https://stackoverflow.com/questions/2607289/converting-array-to-list-in-java
		List<Integer> arr = Arrays.stream(a).boxed().collect(Collectors.toList());
		System.out.println(arr);
	}
}
