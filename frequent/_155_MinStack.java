package frequent;

import java.util.Stack;

public class _155_MinStack {

	private Stack<Integer> data;
	private Stack<Integer> min;

	public _155_MinStack() {
		data = new Stack<>();
		min = new Stack<>();
	}

	public void push(int x) {

		data.push(x);
		if (min.size() == 0 || x < min.peek()) // ����½�����С��minջ���ģ���ôminջ���Ĳ���
			min.push(x);
		else
			min.push(min.peek());
	}

	public void pop() {
		if (data.size() > 0) {
			data.pop();
			min.pop();
		}
	}

	public int top() {
		return data.peek();
	}

	public int getMin() {
		return min.peek();
	}

	public static void main(String[] args) {
//
//		 * Your MinStack object will be instantiated and called as such:
//			 * MinStack obj = new MinStack();
//			 * obj.push(x);
//			 * obj.pop();
//			 * int param_3 = obj.top();
//			 * int param_4 = obj.getMin();

		_155_MinStack a = new _155_MinStack();
		a.push(3);
		a.push(4);
		a.top();
		a.pop();
		a.top();

	}

}
