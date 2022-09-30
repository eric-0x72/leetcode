package AprilChallenge;

import java.util.Stack;

public class _155_MinStack {

	Stack<Integer> data;
	Stack<Integer> min;
	int curmin;

	public _155_MinStack() {
		data = new Stack<>();
		min = new Stack<>();
	}

	public void push(int x) {
		data.push(x);

		// if empty, or need to update min
		if (min.isEmpty() || x < min.peek())
			min.push(x);
		else
			min.push(min.peek());
	}

	// remove top
	public void pop() {
		data.pop();
		min.pop();
	}

	// peek data
	public int top() {
		return data.peek();
	}

	// only get the value
	public int getMin() {
		return min.peek();
	}

	public void print() {
		System.out.println(min);
	}

	public static void main(String[] args) {
//		_155_MinStack a = new _155_MinStack();
//		a.push(-2);
//		a.push(0);
//		a.push(-1);
//		a.print();
//
//		System.out.println(a.getMin());
//		System.out.println(a.top());
//		a.pop();
//		System.out.println(a.getMin());

		System.out.println(Integer.MAX_VALUE);
	}

}
