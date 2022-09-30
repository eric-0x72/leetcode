package tree;

import java.util.HashMap;

public class _105_ConstructBinaryTreeFromPreorderAndInorderTraversal {

	HashMap<Integer, Integer> inorder_map = new HashMap<>();
	int[] preorder;
	int[] inorder;
	int pre_index = 0;

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int i = 0;

		// map built from inorder array
		for (Integer val : inorder) {
			inorder_map.put(val, i++);
		}
		return helper(0, inorder.length);
	}

	// returns the root node, from inorder array [inorder_left, inorder_right]
	private TreeNode helper(int inorder_left, int inorder_right) {
		int root_val = preorder[pre_index];
		TreeNode root = new TreeNode(root_val);

		// find the index of root_val from inorder array
		int index = inorder_map.get(root_val);

		pre_index++;

		root.left = helper(inorder_left, index); // [inorder_left, index )
		root.right = helper(index + 1, inorder_right); // [index+1, inorder_right)

		return root;
	}

}
