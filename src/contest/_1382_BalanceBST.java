package contest;

import java.util.ArrayList;
import java.util.List;

/**
 * A BST is balanced if and only if the depth of the two subtrees of every node
 * never differ by more than 1. ( <=1 )
 * 
 */
public class _1382_BalanceBST {

	List<Integer> sorted = new ArrayList<>();

	public TreeNode balanceBST(TreeNode root) {
		inorder(root);
		return helper(0, sorted.size() - 1);
	}

	private void inorder(TreeNode root) {
		if (root == null)
			return;

		inorder(root.left);
		sorted.add(root.val);
		inorder(root.right);
	}

	private TreeNode helper(int l, int r) {
		if (l > r)
			return null;

		int mid = (l + r) / 2;
		TreeNode root = new TreeNode(sorted.get(mid));
		root.left = helper(l, mid - 1);
		root.right = helper(mid + 1, r);

		return root;
	}

}
