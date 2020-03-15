package tree;

public class _937_RangeSumOfBST {

	int res = 0;
	int l, r;

	public int rangeSumBST(TreeNode root, int L, int R) {
		l = L;
		r = R;
		helper(root);
		return res;
	}

	private void helper(TreeNode root) {
		if (root == null)
			return;

		if (root.val >= l && root.val <= r) {
			res += root.val;
		}

		if (root.left != null && root.left.val >= l)
			rangeSumBST(root.left, l, r);

		if (root.right != null && root.right.val <= r)
			rangeSumBST(root.right, l, r);
	}

}
