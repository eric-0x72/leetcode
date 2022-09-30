package tree;

public class _98_ValidateBST {

	public boolean isValidBST(TreeNode root) {
		return helper(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
	}

	private boolean helper(TreeNode root, double minValue, double maxValue) {
		if (root == null)
			return true;

		int val = root.val;
		if (val > maxValue || val < minValue)
			return false;

		boolean a = helper(root.left, minValue, val);
		boolean b = helper(root.right, val, maxValue);
		return a && b;
	}

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE); // (2^31)-1
		System.out.println((1 << 31) - 1);
	}

}
