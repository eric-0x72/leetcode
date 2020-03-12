package frequent;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _412_FizzBuzz {

	public static List<String> fizzBuzz(int n) {

		LinkedList<String> res = new LinkedList<String>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				res.add("FizzBuzz");
			else if (i % 3 == 0)
				res.add("Fizz");
			else if (i % 5 == 0)
				res.add("Buzz");
			else
				res.add("" + i);
		}
		return res;
	}

	public static void main(String[] args) {

		List<String> a = fizzBuzz(15);
//		System.out.println(Arrays.toString(a));
		System.out.println(a);
	}
}
