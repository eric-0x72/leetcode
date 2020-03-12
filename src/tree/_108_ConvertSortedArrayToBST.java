package tree;

public class _108_ConvertSortedArrayToBST {

	public TreeNode sortedArrayToBST(int[] nums) {
		return helper(nums, 0, nums.length - 1);
	}

	// return the root of tree, which is make up of [l, r]
	private TreeNode helper(int[] nums, int l, int r) {

		if (l > r)
			return null;

		int mid = (l + r) / 2; // choose mid-left node as root

		TreeNode root = new TreeNode(nums[mid]);

		root.left = helper(nums, l, mid - 1);
		root.right = helper(nums, mid + 1, r);

		return root;
	}

}
