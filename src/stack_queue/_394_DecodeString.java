// package stack_queue;
//
// import java.util.ArrayDeque;
// import java.util.Deque;
//
// public class _394_DecodeString {
//
// 	public String decodeString(String s) {
// 		Deque<Integer> numStack = new ArrayDeque<>();
// 		Deque<String> strStack = new ArrayDeque<>();\
//
// 		// res is prefix already donef
// 		StringBuilder res = new StringBuilder();
//
// 		int n = s.length();
//
// 		for (int i = 0; i < n; i++) {
// 			char c = s.charAt(i);
//
// 			if (Character.isDigit(c)) {
// 				int num = c - '0';
//
// 				// move forward to get the whole number
// 				while (i + 1 < n && Character.isDigit(s.charAt(i + 1))) {
// 					num = num * 10 + s.charAt(i + 1) - '0';
// 					i++;
// 				}
// 				numStack.push(num);
// 			}
//
// 			// open bracket
// 			else if (c == '[') {
// 				strStack.push(res.toString());
// 				res = new StringBuilder(); // clear tail
// 			}
//
// 			// close bracket
// 			else if (c == ']') {
// 				// initialise cur with string stack
// 				StringBuilder cur = new StringBuilder(strStack.pop());
//
// 				int times = numStack.pop();
// 				for (int j = 0; j < times; j++) {
// 					cur.append(res); // append tail several times
// 				}
// 				res = cur;
// 			}
//
// 			// encounter a normal letter
// 			else {
// 				res.append(c);
// 			}
// 		}
//
// 		// finally, return tail
// 		return res.toString();
// 	}
//
// 	public static void main(String[] args) {
// 		Deque<String> stack = new ArrayDeque<>();
// 		stack.push("a");
// 		stack.push("b");
// 		System.out.println(new StringBuilder(stack.pop()));
// 	}
//
// }
