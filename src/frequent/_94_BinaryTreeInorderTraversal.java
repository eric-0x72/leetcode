package frequent;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _94_BinaryTreeInorderTraversal {
	private List<Integer> res = new LinkedList<Integer>();

	public List<Integer> inorderTraversal(TreeNode root) {
		traverse(root);
		return res;
	}

	private void traverse(TreeNode root) {
		if (root == null)
			return;

		traverse(root.left);
		res.add(root.val);
		traverse(root.right);
	}

//		Stack<TreeNode> stack = new Stack<TreeNode>();
//		LinkedList<Integer> res = new LinkedList<Integer>();
//
//		if (root == null)
//			return res;
//
//		stack.add(root);
//
//		while (!stack.isEmpty()) {
//			TreeNode node = stack.pop();
//			res.add(node.val);
//
//			if (node.right != null)
//				stack.add(node.right); // stack add right child first
//
//			if (node.left != null)
//				stack.add(node.left); // stack then add left child
//		}
//		return res;

}
