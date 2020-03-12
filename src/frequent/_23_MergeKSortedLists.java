package frequent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class _23_MergeKSortedLists {

	public static ListNode mergeKLists(ListNode[] lists) {

//		Queue<ListNode> q = new PriorityQueue<>(new Comparator<ListNode>() {
//			@Override
//			public int compare(ListNode o1, ListNode o2) {
//
//				return;
//			}
//		});
		ArrayList<Integer> li = new ArrayList<>();
		for (ListNode node : lists) {
			while (node != null) {
				li.add(node.val);
				node = node.next;
			}
		}
		Collections.sort(li);

		ListNode head = new ListNode(0);
		ListNode cur = head;

		for (int val : li) {
			cur.next = new ListNode(val);
			cur = cur.next;
		}
		return head.next;
	}

	public static void main(String[] args) {

		ListNode n11 = new ListNode(1);
		ListNode n12 = new ListNode(4);
		ListNode n13 = new ListNode(5);

		ListNode n21 = new ListNode(1);
		ListNode n22 = new ListNode(3);
		ListNode n23 = new ListNode(4);

		ListNode n31 = new ListNode(2);
		ListNode n32 = new ListNode(6);

		n11.next = n12;
		n12.next = n13;
		n21.next = n22;
		n22.next = n23;
		n31.next = n32;

		ListNode[] a = new ListNode[3];
		a[0] = n11;
		a[1] = n21;
		a[2] = n31;

		ListNode res = mergeKLists(a);

		ListNode cur = res;

		while (cur != null) {
			System.out.print(cur.val + " -> ");
			cur = cur.next;
		}
	}
}
