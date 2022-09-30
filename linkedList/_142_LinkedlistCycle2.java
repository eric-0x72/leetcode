package linkedList;

import java.util.HashSet;
import java.util.Set;

public class _142_LinkedlistCycle2 {

	public ListNode detectCycle(ListNode head) {
		Set<ListNode> set = new HashSet<>();

		while (head.next != null) {
			if (set.contains(head)) {
				return head;
			}
			set.add(head);
			head = head.next;
		}
		return null;
	}

	public ListNode detectCycle_tortoise(ListNode head) {
		return null;
	}
}
