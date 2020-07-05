package heap;

import java.util.PriorityQueue;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class _23_MergeKSortedLists {

	public ListNode mergeKLists(ListNode[] lists) {

		// min heap
		PriorityQueue<ListNode> q = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);

		// add all heads into q
		for (ListNode node : lists) {
			if (node != null)
				q.add(node);
		}

		ListNode dummy = new ListNode(-1);
		ListNode cur = dummy; // cur is used to construct LinkedList

		while (!q.isEmpty()) {
			cur.next = q.poll(); // build res linkedlist with q
			cur = cur.next;

			if (cur.next != null)
				q.add(cur.next);
		}
		return dummy.next;
	}

}
