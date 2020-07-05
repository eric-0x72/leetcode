package AprilChallenge;

// Definition for a binary tree node
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class __ConstructBSTFromPreorderTraversal {

	// 8 | 5 1 7 | 10 12
	public TreeNode bstFromPreorder(int[] preorder) {
		return helper(preorder, 0, preorder.length - 1);
	}

	private TreeNode helper(int[] preorder, int l, int r) {
		if (l > r)
			return null;
		if (l == r)
			return new TreeNode(preorder[l]);

		TreeNode root = new TreeNode(preorder[l]);

		int mid = l;
		while (true) {
			// if reach the end, stop mid
			if (mid + 1 > r)
				break;

			// if the next is greater, stop mid on predecessor
			// or, 4 8 situation so mid still point on root 4
			if (preorder[mid + 1] > preorder[l]) {
				break;
			}
			mid++;
		}

		root.left = helper(preorder, l + 1, mid);
		root.right = helper(preorder, mid + 1, r);

		return root;
	}

}
