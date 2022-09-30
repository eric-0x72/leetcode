package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _77_Combinations {

	private static ArrayList<List<Integer>> res;

	public static List<List<Integer>> combine(int n, int k) {
		res = new ArrayList<>();

		if (n <= 0 || k <= 0 || k > n)
			return res;

		LinkedList<Integer> level = new LinkedList<>();

		backtrack(n, k, 1, level); // start = 1

		return res;
	}

	private static void backtrack(int n, int k, int start, LinkedList<Integer> level) {
		if (level.size() == k) {
			res.add((List<Integer>) level.clone());
			return;
		}

		for (int i = start; i <= n; i++) {
			level.addLast(i);

			backtrack(n, k, i + 1, level); // start = i+1

			level.removeLast();
		}
	}

	public static void main(String[] args) {
		List<List<Integer>> res = combine(4, 2);
		System.out.println(res);
	}

}
