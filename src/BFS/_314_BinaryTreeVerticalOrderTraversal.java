package bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class _314_BinaryTreeVerticalOrderTraversal {

	public List<List<Integer>> verticalOrder(TreeNode root) {

		// res keep the order to return
		List<List<Integer>> res = new ArrayList<>();

		// column: list of node values
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();

		Queue<TreeNode> q = new LinkedList<>();

		// node: column number
		Map<TreeNode, Integer> columns = new HashMap<>();

		// add to queue and columns
		q.offer(root);
		columns.put(root, 0);

		int min = 0;

		while (!q.isEmpty()) {
			TreeNode curnode = q.poll();
			int curcol = columns.get(curnode); // get column number

			if (!map.containsKey(curcol)) {
				map.put(curcol, new ArrayList<>());
			}
			// add to map res
			map.get(curcol).add(curnode.val);

			// add left node
			if (curnode.left != null) {
				q.add(curnode.left); // add to queue
				columns.put(curnode.left, curcol - 1); // add to weight
			}
			// add right node
			if (curnode.right != null) {
				q.add(curnode.right);
				columns.put(curnode.right, curcol + 1);
			}

			// update left min
			min = Math.min(min, curcol);
		}

		// res add each column nodes
		while (map.containsKey(min)) {
			res.add(map.get(min++));
		}
		return res;
	}
}
