package contest;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Queue;

public class __temp {

	public boolean isEvenOddTree(TreeNode root) {

		Queue<TreeNode> q = new ArrayDeque<>();
		q.offer(root);

		int level = 0;

		if (!q.isEmpty()) {
			int size = q.size();
			int[] li = new int[size];

			for (int i = 0; i < size; i++) {
				TreeNode cur = q.poll();

				li[i] = cur.val;
				System.out.println(Arrays.toString(li));

				if (cur.left != null) {
					q.offer(cur.left);
				}
				if (cur.right != null) {
					q.offer(cur.right);
				}
			} // end for

			if (!check(li, level)) {
				return false;
			}

			level += 1;
		} // end queue

		return true;
	}

	private boolean check(int[] arr, int level) {
		System.out.println(Arrays.toString(arr));

		if (level % 2 == 1) {
			Arrays.sort(arr);
		}

		int cur = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i <= cur) {
				return false;
			}
			cur = i;
		}
		return true;
	}
	
	public static void main(String[] args) {
			HashMap<Integer, Integer> map = new HashMap<>();
			map.con
	}
}
