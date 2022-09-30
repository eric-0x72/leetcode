package tree;

public class _124_BinaryTreeMaxPathSum {

	int res = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		helper(root);
		return res;
	}

	// return max sum obtained
	// if root extends to the max sum subtree
	private int helper(TreeNode root) {

		if (root == null) {
			return 0;
		}

		int l = helper(root.left);
		int r = helper(root.right);

		l = l > 0 ? l : 0;
		r = r > 0 ? r : 0;

		// update res, extends to both left and right subtree
		res = Math.max(res, l + r + root.val);

		// root only extends to left or right
		// pick the max side
		return Math.max(l, r) + root.val;
	}

}
