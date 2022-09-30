package frequent;

public class _572_SubtreeOfAnotherTree {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// s is big tree, t is subtree
	// todo: redo this question!
	public boolean isSubtree(TreeNode s, TreeNode t) {
		// recursively try left and right child of 's'
		// must check s!=null first, before go in to s.left and s.right
		return s != null && (equals(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t));
	}

	private boolean equals(TreeNode s, TreeNode t) {
		// both trees must reach null at the same time
		if (s == null && t == null)
			return true;

		// if only one of them is null, the false
		if (s == null || t == null)
			return false;

		// two trees are equal if root nodes values are equal, then recursively check
		// subtrees
		return s.val == t.val && equals(s.left, t.left) && equals(s.right, t.right);
	}
}
