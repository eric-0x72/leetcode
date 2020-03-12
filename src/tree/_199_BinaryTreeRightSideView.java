package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _199_BinaryTreeRightSideView {

	public List<Integer> rightSideView(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		List<Integer> res = new LinkedList<Integer>();
		if (root == null)
			return res;

		q.offer(root);
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				TreeNode cur = q.poll();
				
				if (i == size - 1) // only add the right most node
					res.add(cur.val);
				
				if (cur.left != null)
					q.offer(cur.left);
				if (cur.right != null)
					q.offer(cur.right);
			}
		}
		return res;
	}

}
