package linkedList;

public class _141_LinkedListCycle {

	public boolean hasCycle(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		
		// until fast is the last node
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;

			if (fast == slow) {
				return true;
			}
		}
		return false;
	}

}
