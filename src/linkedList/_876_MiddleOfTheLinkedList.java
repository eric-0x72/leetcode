package linkedList;

// Definition for singly-linked list
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class _876_MiddleOfTheLinkedList {

	public ListNode middleNode(ListNode head) {
		ListNode h = head; // h here point to original head

		int len = 0;

		while (head != null) {
			head = head.next;
			len++;
		}

		int mid = len / 2;
		for (int i = 0; i < mid; i++) {
			h = h.next;
		}
		return h;
	}

	public ListNode middleNode_2(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
