package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Definition for a binary tree node. 
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class _102_BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if (root == null)
			return res;

		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);

		while (!q.isEmpty()) {
			List<Integer> li = new ArrayList<>();

			// go thru element in existing queue
			int s = q.size(); // why must store s first???
			
			for (int i = 0; i < s; i++) {
				TreeNode cur = q.poll();
				li.add(cur.val);

				if (cur.left != null)
					q.add(cur.left);
				if (cur.right != null)
					q.add(cur.right);
			}
			res.add(li);
		}
		return res;
	}

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(12);
		q.offer(8);
		System.out.println(q.size());

		q.poll();
		System.out.println(q.size());

	}

}
