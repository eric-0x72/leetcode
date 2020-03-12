package frequent;

public class _111_MinDepthOfBinaryTree {

	private int min;

	public int minDepth(TreeNode root) {
		min = Integer.MAX_VALUE;

		dfs(root);
		
		return min;
	}

	private int dfs(TreeNode root) {
		if (root == null)
			return 0;

		int l = dfs(root.left);
		int r = dfs(root.right);

		int temp = Math.min(l, r) + 1;
		min = Math.min(min, temp);

		return Math.max(l, r) + 1;
	}
}
