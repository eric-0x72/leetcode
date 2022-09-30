package tree;

public class _450_DeleteNodeInBST {

	public TreeNode deleteNode(TreeNode root, int key) {
		if (root == null)
			return null;

		if (root.val < key) { // key is in right subtree
			root.right = deleteNode(root.right, key);
		} else if (root.val > key) { // key is in left subtree
			root.left = deleteNode(root.left, key);
		}
		// delete root itself
		else {
			if (root.left == null) {
				TreeNode temp = root.right;
				root.right = null; // garbage root
				return temp;
			} else if (root.right == null) {
				TreeNode temp = root.left;
				root.left = null; // garbage root
				return temp;
			} else {
				// find successor: one step right, then all the way left
				TreeNode succ = root.right;
				while (succ.left != null) {
					succ = succ.left;
				}
				root.val = succ.val;
				root.right = deleteNode(root.right, succ.val);
			}
		}
		return root;
	}

}
