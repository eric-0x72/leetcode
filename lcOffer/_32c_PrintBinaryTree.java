package lcOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _32c_PrintBinaryTree {

	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> res = new ArrayList<>();
		if (root == null)
			return res;

		Queue<TreeNode> q = new LinkedList<>();

		q.add(root);

		while (!q.isEmpty()) {
			int sz = q.size();
			List<Integer> level = new ArrayList<Integer>();

			for (int i = 0; i < sz; i++) {
				TreeNode cur = q.poll();
				level.add(cur.val);

				if (cur.left != null)
					q.add(cur.left);

				if (cur.right != null)
					q.add(cur.right);

			}

			//
			if (res.size() % 2 == 1)
				Collections.reverse(level);

			res.add(level);
		}
		return res;
	}

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();
		li.add(12);
		li.add(9);
		li.add(100);

		Collections.reverse(li);
		System.out.println(li);
	}
}
