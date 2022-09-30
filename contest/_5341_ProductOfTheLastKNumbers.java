package contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _5341_ProductOfTheLastKNumbers {

	Stack<Integer> stack;
	List<Integer> cum;

	public _5341_ProductOfTheLastKNumbers() {
		stack = new Stack<>();
		cum = new ArrayList<>();
	}

	public void add(int num) {

		stack.add(num);
		int temp = 0;

		if (cum.size() > 0)
			temp = num * cum.get(cum.size() - 1);
		else
			temp = num;

		cum.add(temp);
		System.out.println(cum);
	}

	public int getProduct(int k) {
		return cum.get(cum.size() - 1); // / cum.get(cum.size() - k - 1);

	}

	public static void main(String[] args) {

		_5341_ProductOfTheLastKNumbers productOfNumbers = new _5341_ProductOfTheLastKNumbers();

		productOfNumbers.add(3); // [3]
		productOfNumbers.add(0); // [3,0]
		productOfNumbers.add(2); // [3,0,2]
		productOfNumbers.add(5); // [3,0,2,5]
		productOfNumbers.add(4); // [3,0,2,5,4]
		int res1 = productOfNumbers.getProduct(2); // return 20. The product of the last 2 numbers is 5 * 4 = 20
		int res2 = productOfNumbers.getProduct(3); // return 40. The product of the last 3 numbers is 2 * 5 * 4 = 40

		System.out.println(res1 + " " + res2);
	}
}
