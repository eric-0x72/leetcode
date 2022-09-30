package tree;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}

}

public class _543_DiameterOfBinaryTree {

	private int res = 1;

	public int diameterOfBinaryTree(TreeNode root) {
		height(root);

		return res - 1; // nodes-1 gives the edges
	}

	// return the height of root node
	private int height(TreeNode root) {
		if (root == null)
			return 0;

		// leaf node has height = 1
		int l = height(root.left); // height of root.left
		int r = height(root.right); // height of root.right

		// max nodes along path from left and right subtree
		// add 1 for root itself
		res = Math.max(res, l + r + 1);

		// height of root = max of children + itself
		return Math.max(l, r) + 1;
	}

}
