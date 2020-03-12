package frequent;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _77_Combinations {

	static List<List<Integer>> res;

	public static List<List<Integer>> combine(int n, int k) {
		res = new ArrayList<>();

		LinkedList<Integer> cur = new LinkedList<>();
		backtrack(n, k, 1, cur);
		return res;
	}

	//
	private static void backtrack(int n, int k, int start, LinkedList<Integer> cur) {

		if (cur.size() == k) { // k�������Ԫ�صĶ���?
			res.add((List<Integer>) cur.clone());
			return;
		}

		for (int i = start; i <= n; i++) {
			cur.addLast(i); // ��֮ǰcur�Ļ����ϣ�����Ԫ��i
			backtrack(n, k, i + 1, cur); // start = i+1
			cur.removeLast();
		}

	}

	public static void main(String[] args) {

		List<List<Integer>> res = combine(4, 2);
		System.out.println(res);
	}
}
