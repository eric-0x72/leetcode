package tree;

/**
 * @author zwb
 *
 *         Invert a binary tree.
 * 
 * 
 */
public class _226_InvertBinaryTree {

	// return the root of inverted tree
	public TreeNode invertTree(TreeNode root) {
		if (root == null)
			return null;
		
//		if (root.left == null && root.right == null)
//			return root;

		TreeNode r = root.right; // store left and right subtree
		TreeNode l = root.left;

		root.right = invertTree(l);
		root.left = invertTree(r);

		return root;
	}

}
