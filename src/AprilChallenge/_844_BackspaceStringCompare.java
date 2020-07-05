package AprilChallenge;

import java.util.Arrays;
import java.util.Stack;

public class _844_BackspaceStringCompare {

	public static boolean backspaceCompare(String S, String T) {
		return helper(S).equals(helper(T));
	}

	private static String helper(String a) {

		Stack<Character> s = new Stack<>();

		for (char c : a.toCharArray()) {
			if (c != '#')
				s.push(c);
			else if (!s.empty()) // pop only if not empty
				s.pop();
		}
		// System.out.println(String.valueOf(s));
		return String.valueOf(s);
	}

	public static void main(String[] args) {
		backspaceCompare("abc", "abc");
	}
}
