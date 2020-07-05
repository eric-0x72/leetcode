package bfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class _102_BinaryTreeLevelOrderTraversal_ {

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if (root == null)
			return res;
		Queue<TreeNode> q = new ArrayDeque<>();
		q.add(root);

		while (!q.isEmpty()) {
			int size = q.size();

			List<Integer> level = new ArrayList<>();

			for (int i = 0; i < size; i++) {
				TreeNode cur = q.poll();
				level.add(cur.val);

				if (cur.left != null) {
					q.add(cur.left);
				}
				if (cur.right != null) {
					q.add(cur.right);
				}
			} // end for
			res.add(level);
		} // end while
		return res;
	}
}
