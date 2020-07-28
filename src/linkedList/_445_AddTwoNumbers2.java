package linkedList;

import java.util.Stack;

public class _445_AddTwoNumbers2 {

	public ListNode addTwoNumbers(ListNode p, ListNode q) {

		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();

		ListNode dummy = new ListNode(-1);
		ListNode cur = dummy;

		while (p != null) {
			s1.push(p.val);
			p = p.next;
		}
		while (q != null) {
			s2.push(q.val);
			q = q.next;
		}

		int carry = 0;

		while (!s1.isEmpty() || !s2.isEmpty()) {
			int x = s1.isEmpty() ? 0 : s1.pop();
			int y = s2.isEmpty() ? 0 : s2.pop();

			int sum = x + y + carry;
			carry = sum / 10;
			sum %= 10;

			ListNode temp = new ListNode(sum);
			temp.next = cur.next;
			cur.next = temp;
		}

		if (carry >= 1) {
			ListNode temp1 = new ListNode(carry);
			temp1.next = cur.next;
			cur.next = temp1;
		}

		return dummy.next;
	}

}
