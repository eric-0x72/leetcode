package tree;

import java.util.ArrayList;
import java.util.List;

public class _366_FindLeavesOfBinaryTree {

	List<List<Integer>> res = new ArrayList<>();

	public List<List<Integer>> findLeaves(TreeNode root) {
		helper(root);
		return res;
	}

	// return the height of tree at root
	// the height is greatest no. of edge to leaf node
	private int helper(TreeNode root) {
		if (root == null)
			return -1;

		int height = Math.max(helper(root.left), helper(root.right)) + 1;
		if (height == res.size())
			res.add(new ArrayList<>());

		res.get(height).add(root.val);

		return height;

	}

	public static void main(String[] args) {
		System.out.println(new ArrayList<>().size());
	}

}
