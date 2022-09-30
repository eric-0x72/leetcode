package lcOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _54_KthLargestInBST {

	List<Integer> sorted = new ArrayList<Integer>();

	public int kthLargest(TreeNode root, int k) {
		inorder(root);

		Collections.sort(sorted);

		return sorted.get(sorted.size() - k);

	}

	private void inorder(TreeNode root) {
		if (root == null)
			return;

		inorder(root.left);
		sorted.add(root.val);
		inorder(root.right);
	}

}
