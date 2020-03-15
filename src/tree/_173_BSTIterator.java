package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _173_BSTIterator {
	List<Integer> list = new LinkedList<>();
	int n = 0;

	public _173_BSTIterator(TreeNode root) {
		inorder(root);
	}

	private void inorder(TreeNode root) {
		if (root == null)
			return;

		inorder(root.left);
		list.add(root.val);
		inorder(root.right);
	}

	/** @return the next smallest number */
	public int next() {
		return list.get(n--);
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return n != list.size();
	}

}
