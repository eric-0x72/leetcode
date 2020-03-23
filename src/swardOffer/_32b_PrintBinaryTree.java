package swardOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _32b_PrintBinaryTree {

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
			res.add(level);
		}
		return res;
	}

}
