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

	private int res;

	public int diameterOfBinaryTree(TreeNode root) {
		res = 1;

		depth(root);

		return res - 1; // nodes-1 gives the edges
	}

	private int depth(TreeNode root) {
		if (root == null)
			return 0;

		int l = depth(root.left);
		int r = depth(root.right);

		// add one for the current root, gives the number of nodes along the path
		res = Math.max(res, l + r + 1);

		return Math.max(l, r) + 1;
	}

}
