package bfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class _314_BinaryTreeVerticalOrderTraversal_ {

	public List<List<Integer>> verticalOrder(TreeNode root) {

		List<List<Integer>> res = new ArrayList<>();

		if (root == null)
			return res;

		Queue<TreeNode> q = new ArrayDeque<>();

		// column number : list of nodes
		HashMap<Integer, List<Integer>> map = new HashMap<>();

		// node : column number
		HashMap<TreeNode, Integer> columns = new HashMap<>();

		columns.put(root, 0);
		q.offer(root);

		int min = 0;

		while (!q.isEmpty()) {
			TreeNode curnode = q.poll();
			int curcol = columns.get(curnode);

			if (!map.containsKey(curcol)) {
				map.put(curcol, new ArrayList<>());
			}
			map.get(curcol).add(curnode.val);

			min = Math.min(min, curcol);

			if (curnode.left != null) {
				columns.put(curnode.left, curcol - 1);
				q.add(curnode.left);
			}

			if (curnode.right != null) {
				columns.put(curnode.right, curcol + 1);
				q.add(curnode.right);
			}

		}

		while (map.containsKey(min)) {
			res.add(map.get(min++));
		}

		return res;
	}
}
