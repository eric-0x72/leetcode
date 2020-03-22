package tree;

public class _563_BinaryTreeTile {

	private int res;

	public int findTilt(TreeNode root) {
		sum(root);
		return res;
	}

	// return the total value subtree recursively
	private int sum(TreeNode root) {
		if (root == null)
			return 0;

		int l = sum(root.left);
		int r = sum(root.right);

		res += Math.abs(l - r);

		return l + r + root.val;
	}
}
