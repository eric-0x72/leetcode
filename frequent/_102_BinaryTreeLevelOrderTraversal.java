package frequent;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _102_BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
		
		List<List<Integer>> res = new ArrayList<>();

		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			
			List<Integer> cur = new ArrayList<>();
			int size = q.size();

			for (int i = 0; i < size; i++) { // forloop������ǰ��һ�㣬����queue�м������ǵ��ӽڵ�
				
				TreeNode n = q.poll();
				cur.add(n.val);

				if (n.left != null)
					q.add(n.left);

				if (n.right != null)
					q.add(n.right);
			}
			res.add(cur);
		}
		return res;
	}

	public static void main(String[] args) {
		
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
