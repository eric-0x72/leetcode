package frequent;

import java.util.HashMap;

public class _138_CopyListWithRandomPointer {

	class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}
	}

	HashMap<Node, Node> map = new HashMap<>();

	public Node copyRandomList(Node head) {

		Node a = head;

		// 创建新的节点
		Node cur = a;
		while (head != null) {
			map.put(head, new Node(0)); // key, value
			head = head.next;
		}

		head = a;
		while (head != null) {
			Node newnode = map.get(head); // 新的node

			newnode.val = head.val;
			newnode.next = map.get(head.next);
			newnode.random = map.get(head.random);

			head = head.next;
		}
		return map.get(a);
	}

	public static void main(String[] args) {

	}
}
