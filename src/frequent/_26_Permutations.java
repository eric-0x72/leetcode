package frequent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _26_Permutations {

	private static List<List<Integer>> res = new ArrayList<>();
	static boolean[] used;

	public static List<List<Integer>> permute(int[] nums) {

		LinkedList<Integer> cur = new LinkedList<>();
		used = new boolean[nums.length]; // all false

		backtrack(nums, 0, cur);
		return res;
	}

	// ��ǰ���indexλ�õ�����
	private static void backtrack(int[] nums, int index, LinkedList<Integer> cur) {

		if (nums.length == index) {
			res.add((List<Integer>) cur.clone()); // clone returns a shallow copy of this LinkedList
			// System.out.println(res);
			return;
		}

		for (int i = 0; i < nums.length; i++) {

			if (!used[i]) {
				
				used[i] = true; // ״̬
				cur.addLast(nums[i]); // ״̬

				backtrack(nums, index + 1, cur);

				cur.removeLast(); // �ָ�״̬
				used[i] = false; // �ָ�״̬
			}
		}
		return;
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		List<List<Integer>> res = permute(a);
		System.out.println(res);
	}

}
