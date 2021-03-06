package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class _225_MyStack {

	Queue<Integer> q;
	int topElement;

	/** Initialize your data structure here. */
	public _225_MyStack() {
		q = new LinkedList<>();
	}

	/** Push element x onto stack. */
	public void push(int x) {
		topElement = x;
		q.offer(x);
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		int size = q.size();
		for (int i = 0; i < size - 1; i++) {
			int temp = q.poll();
			q.add(temp);
		}
		return q.poll();
	}

	/** Get the top element. */
	public int top() {
		return topElement;
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return q.isEmpty();
	}

}
