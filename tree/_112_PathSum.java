package tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class _112_PathSum {

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;

		int rest = sum - root.val; // must do this before the next line

		// check if reaches the leaf node, if yes then see if rest == 0
		if (root.left == null && root.right == null)
			return rest == 0;

		boolean l = hasPathSum(root.left, rest);
		boolean r = hasPathSum(root.right, rest);

		return l || r;
	}

	// iterative solution
	public boolean hasPathSum_iterative(TreeNode root, int sum) {

		LinkedList<TreeNode> nodes = new LinkedList();
		LinkedList<Integer> remains = new LinkedList();

		nodes.add(root);
		remains.add(sum - root.val);

		while (!nodes.isEmpty()) {
			TreeNode node = nodes.poll();
			int remain = remains.poll();

			if (node.right == null && node.left == null && remain == 0) {
				return true;
			}
			if (node.right != null) {
				nodes.add(node.right);
				remains.add(remain - node.right.val);
			}
			if (node.left != null) {
				nodes.add(node.left);
				remains.add(remain - node.left.val);
			}

		}
		return false;
	}
}
