package tree;

public class _654_MaximumBinaryTree {

	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return helper(nums, 0, nums.length);
	}

	private TreeNode helper(int[] nums, int l, int r) {
		if (l == r)
			return null;

		int maxindex = findmaxindex(nums, l, r);
		TreeNode root = new TreeNode(nums[maxindex]);

		root.left = helper(nums, l, maxindex);
		root.right = helper(nums, maxindex, r);

		return root;
	}

	private int findmaxindex(int[] nums, int l, int r) {
		int maxindex = l;
		for (int i = l; i < r; i++)
			if (nums[maxindex] < nums[i])
				maxindex = i;
		return maxindex;
	}

}
