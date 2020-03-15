package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * find all nodes away from target node for a distance of k
 * 
 * idea 1: use map to store node's parent, then we know distance 1 from node
 * then do a BFS
 * 
 */
public class _863_AllNodesDistanceKInBinaryTree {

	HashMap<TreeNode, TreeNode> parent = new HashMap<>();
	HashSet<TreeNode> seen = new HashSet<>();
	Queue<TreeNode> q = new LinkedList<>();

	public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
		// build parent map
		dfs(root, null);

		// add target, which is 0 distance from itself. NOT ROOT!
		q.add(target);
		seen.add(target);

		int curlayer = 0;

		while (!q.isEmpty()) {
			// if the current level == K
			if (curlayer == K) {
				List<Integer> res = new ArrayList<>();
				for (TreeNode node : q) {
					res.add(node.val);
				}
				return res;
			}

			int layerSize = q.size();
			for (int i = 0; i < layerSize; i++) {

				TreeNode cur = q.poll();

				// add left, right child and parent of cur node
				if (cur.left != null && !seen.contains(cur.left)) {
					q.add(cur.left);
					seen.add(cur.left);
				}

				if (cur.right != null && !seen.contains(cur.right)) {
					q.add(cur.right);
					seen.add(cur.right);
				}

				TreeNode par = parent.get(cur);
				if (par != null && !seen.contains(par)) {
					q.add(par);
					seen.add(par);
				}
			}
			curlayer++;
		}
		return new ArrayList<Integer>();
	}

	private void dfs(TreeNode root, TreeNode p) {
		if (root == null)
			return;

		parent.put(root, p);
		dfs(root.left, root);
		dfs(root.right, root);
	}

}
