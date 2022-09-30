package lcOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class _32a_PrintBinaryTree {

	List<Integer> res;

	public int[] levelOrder(TreeNode root) {
		res = new ArrayList<>();

		if (root == null)
			return new int[0];

		traverse(root);

		int[] res1 = new int[res.size()];
		for (int i = 0; i < res.size(); i++)
			res1[i] = res.get(i);

		return res1;
	}

	private void traverse(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();

		q.add(root);
		while (!q.isEmpty()) {
			TreeNode cur = q.poll();
			res.add(cur.val);

			if (cur.left != null)
				q.add(cur.left);
			if (cur.right != null)
				q.add(cur.right);
		}

	}

	public static void main(String[] args) {
		List<Integer> res = new ArrayList<Integer>();
		res.add(1);
		res.add(100);

		System.out.println(Arrays.toString(res.toArray()));
	}

}
