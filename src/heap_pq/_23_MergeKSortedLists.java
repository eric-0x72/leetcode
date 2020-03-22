package heap_pq;

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

		// add first nodes into queue
		for (ListNode node : lists) {
			if (node != null)
				q.add(node);
		}

		ListNode dummy = new ListNode(-1);
		ListNode cur = dummy; // used for construct list

		while (!q.isEmpty()) {
			cur.next = q.poll();
			cur = cur.next;

			if (cur.next != null)
				q.add(cur.next);
		}
		return dummy.next;
	}

}
