package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _103_BinaryTreeZigzagLevelOrderTraversal {

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();

		if (root == null)
			return res;

		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);

		while (!q.isEmpty()) {
			List<Integer> level = new ArrayList<Integer>();
			int sz = q.size();

			for (int i = 0; i < sz; i++) {
				TreeNode cur = q.poll();

				level.add(cur.val);

				if (cur.left != null)
					q.add(cur.left);
				if (cur.right != null)
					q.add(cur.right);
			}

			if (res.size() % 2 == 1)
				Collections.reverse(level);

			res.add(level);
		}
		return res;
	}

}
