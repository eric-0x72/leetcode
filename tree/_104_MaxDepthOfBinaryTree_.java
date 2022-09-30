package tree;

public class _104_MaxDepthOfBinaryTree_ {

	public int maxDepth(TreeNode root) {
		return helper(root);
	}

	private int helper(TreeNode node) {

		if (node == null)
			return 0;

		int l = helper(node.left);
		int r = helper(node.right);

		return Math.max(l, r) + 1;
	}
}
