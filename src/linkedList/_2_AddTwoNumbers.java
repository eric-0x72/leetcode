package linkedList;

public class _2_AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode p, ListNode q) {

		ListNode dummy = new ListNode(0); // dummy node for answer
		ListNode cur = dummy;

		int carry = 0;

		// iterate until p and q is both done
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;

			int sum = carry + x + y;
			carry = sum / 10;

			// create next node, move on
			cur.next = new ListNode(sum % 10);
			cur = cur.next;

			// move p and q
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}

		// handle additional carry
		if (carry == 1)
			cur.next = new ListNode(carry);

		return dummy.next;
	}

}
