package tree;

import java.util.ArrayList;
import java.util.List;

public class _257_BinaryTreePaths {

	public List<String> binaryTreePaths(TreeNode root) {
		List<String> res = new ArrayList<>();
		helper(root, res, "");
		return res;
	}

	private void helper(TreeNode node, List<String> res, String temp) {
		if (node == null)
			return;

		if (node.left == null && node.right == null) {
			res.add(temp + node.val);
			return;
		}

		temp += node.val + "->";

		helper(node.left, res, temp);
		helper(node.right, res, temp);
	}

}
