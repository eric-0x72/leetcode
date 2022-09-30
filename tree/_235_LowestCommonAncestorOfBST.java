package tree;

public class _235_LowestCommonAncestorOfBST {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		int l = p.val, r = q.val;
		int k = root.val;

		// find the nearest parent node of p & q
		if (l > k && r > k) {
			return lowestCommonAncestor(root.right, p, q);
		} else if (l < k && r < k) {
			return lowestCommonAncestor(root.left, p, q);
		} else {
			return root;
		}
	}

}
