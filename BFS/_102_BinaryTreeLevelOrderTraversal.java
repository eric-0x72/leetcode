package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Definition for a binary tree node. 
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class _102_BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> res = new ArrayList<>();
		if (root == null)
			return res;

		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);

		while (!q.isEmpty()) {
			// to store current level
			List<Integer> level = new ArrayList<>();

			int size = q.size();
			for (int i = 0; i < size; i++) {
				TreeNode cur = q.poll();
				level.add(cur.val); // add to current level result

				if (cur.left != null)
					q.add(cur.left);
				if (cur.right != null)
					q.add(cur.right);
			}
			// add level to res
			res.add(level);
		}
		return res;
	}

	public static void main(String[] args) {

	}

}
