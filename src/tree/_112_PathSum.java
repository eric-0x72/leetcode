package tree;

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
}
