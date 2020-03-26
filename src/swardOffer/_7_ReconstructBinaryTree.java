package swardOffer;

import java.util.HashMap;

import heap_pq.heap;

/**
 * @author weibang
 * 
 *         lc 105
 *
 */
public class _7_ReconstructBinaryTree {

	int[] preorder, inorder;
	HashMap<Integer, Integer> mapInorder = new HashMap<Integer, Integer>();
	int preindex = 0;

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		this.preorder = preorder;
		this.inorder = inorder;

		int i = 0;
		// add inorder value and index to map
		for (Integer val : inorder)
			mapInorder.put(val, i++);

		// build map using inorder traversal
		return helper(0, inorder.length - 1);
	}

	//
	private TreeNode helper(int l, int r) {

		int rootvalue = preorder[preindex++];
		TreeNode root = new TreeNode(rootvalue);

		int index = mapInorder.get(rootvalue);

		root.left = helper(l, index - 1); // root of left tree, building from inorder [l, index-1]
		root.right = helper(index + 1, r); // root of right tree

		return root;
	}
}
