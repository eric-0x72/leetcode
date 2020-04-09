package backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _77_Combinations {

	private static ArrayList<List<Integer>> res;

	public static List<List<Integer>> combine(int n, int k) {
		res = new ArrayList<>();

		if (n <= 0 || k <= 0 || k > n)
			return res;

		LinkedList<Integer> c = new LinkedList<>();

		backtrack(n, k, 1, c); // start = 1, ��ϴ�?1 ��ʼ�㣡

		return res;
	}

	private static void backtrack(int n, int k, int start, LinkedList<Integer> c) {

		if (c.size() == k) {
			res.add((List<Integer>) c.clone());
			return;
		}

		for (int i = start; i <= n; i++) {
			c.addLast(i);
			backtrack(n, k, i + 1, c);
			c.removeLast();
		}
		return;
	}

	public static void main(String[] args) {
		List<List<Integer>> res = combine(4, 2);
		System.out.println(res);

	}

}
