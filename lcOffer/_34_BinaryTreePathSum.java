package lcOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _34_BinaryTreePathSum {

	List<List<Integer>> res = new ArrayList<List<Integer>>();
	LinkedList<Integer> path = new LinkedList<>();

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		dfs(root, sum);
		return res;
	}

	private void dfs(TreeNode root, int remain) {

		if (root == null)
			return;

		path.add(root.val);
		remain -= root.val;

		if (remain == 0 && root.left == null && root.right == null)
			res.add(new LinkedList<>(path));

		dfs(root.left, remain);
		dfs(root.right, remain);

		path.removeLast();
	}

}
