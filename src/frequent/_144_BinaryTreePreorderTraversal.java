package frequent;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _144_BinaryTreePreorderTraversal {

//// Recursive way
//	private List<Integer> res = new LinkedList<Integer>();
//	public List<Integer> preorderTraversal(TreeNode root) {
//
//		traverse(root);
//		return res;
//	}
//
//	private void traverse(TreeNode root) {
//		if (root == null)
//			return;
//
//		res.add(root.val);
//		traverse(root.left);
//		traverse(root.right);
//	}

	public static List<Integer> preorderTraversal(TreeNode root) {

		// LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		LinkedList<Integer> res = new LinkedList<Integer>();

		if (root == null)
			return res;

		stack.add(root);

		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();

			res.add(node.val);

			if (node.right != null)
				stack.add(node.right); // stack add right child first

			if (node.left != null)
				stack.add(node.left); // stack then add left child
		}
		return res;
	}

	public static void main(String[] args) {

	}

}
