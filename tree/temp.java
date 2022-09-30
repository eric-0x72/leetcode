package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class temp {
	Map<TreeNode, TreeNode> parent = new HashMap();
	Set<TreeNode> seen = new HashSet();
	Queue<TreeNode> q = new LinkedList();

	public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
		dfs(root, null);
		q.add(target);
		seen.add(target);

		int curlayer = 0;
		while (!q.isEmpty()) {
			if (curlayer == K) {
				List<Integer> res = new ArrayList<>();
				for (TreeNode node : q) {
					res.add(node.val);
				}
				return res;
			}

			int layersize = q.size();
			for (int i = 0; i < layersize; i++) {
				TreeNode cur = q.poll();

				if (cur.left != null && !seen.contains(cur.left)) {
					seen.add(cur.left);
					q.offer(cur.left);
				}

				if (cur.right != null && !seen.contains(cur.right)) {
					seen.add(cur.right);
					q.offer(cur.right);
				}

				TreeNode par = parent.get(cur);
				if (par != null && !seen.contains(par)) {
					seen.add(par);
					q.offer(par);
				}
			}
			curlayer++;
		}
		return new ArrayList<Integer>();
	}

	private void dfs(TreeNode root, TreeNode p) {
		if (root == null) {
			return;
		}
		parent.put(root, p);

		dfs(root.left, root);
		dfs(root.right, root);
	}

}