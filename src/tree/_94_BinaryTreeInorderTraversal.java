package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _94_BinaryTreeInorderTraversal {

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();

		traverse(root, res);

		return res;
	}

	private void traverse(TreeNode root, List<Integer> res) {
		if (root == null)
			return;

		if (root.left != null)
			traverse(root.left, res);

		res.add(root.val);

		if (root.right != null)
			traverse(root.right, res);
	}

	public List<Integer> inorderTraversal2(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();

		TreeNode cur = root;

		// cur is not null: ensure finish all nodes
		// stack is not empty: ensure finish all nodes
		while (cur != null || !stack.isEmpty()) {

			// add all left to stack
			while (cur != null) {
				stack.push(cur);
				cur = cur.left;
			}

			cur = stack.pop(); // get left
			res.add(cur.val); // add to res
			cur = cur.right; // get right
		}
		return res;
	}

}
