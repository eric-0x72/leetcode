// package dfs;
//
// import java.util.ArrayList;
// import java.util.List;
//
// // Definition for a binary tree node.
// public class TreeNode {
// 	int val;
// 	TreeNode left;
// 	TreeNode right;
//
// 	TreeNode() {
// 	}
//
// 	TreeNode(int val) {
// 		this.val = val;
// 	}
//
// 	TreeNode(int val, TreeNode left, TreeNode right) {
// 		this.val = val;
// 		this.left = left;
// 		this.right = right;
// 	}
// }
//
// public class _257_BinaryTreePaths {
//
// 	public List<String> binaryTreePaths(TreeNode root) {
// 		List<String> res = new ArrayList<>();
// 		dfs(root, "", res);
// 		return res;
// 	}
//
// 	private void dfs(TreeNode node, String path, List<String> res) {
//
// 		if (node == null) {
// 			return;
// 		}
// 		if (node.left == null && node.right == null) {
// 			path += node.val;
// 			res.add(path);
// 		}
//
// 		dfs(node.left, path + node.val + "->", res);
// 		dfs(node.right, path + node.val + "->", res);
// 	}
//
// }
