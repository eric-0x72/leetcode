package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class __temp {

	public static void main(String[] args) {
		int n = 5;

		List<Integer>[] graph = new ArrayList[n];
		List<List<Integer>> res = new ArrayList<>();
		res.add(Arrays.asList(1, 2, 3));
		res.add(Arrays.asList(3, 4, 5));

		System.out.println(graph);
		System.out.println(res);
	}
}
