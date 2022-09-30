// package array;
//
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
//
// public class _412_FizzBuzz {
//
// 	public static List<String> fizzBuzz(int n) {
//
// 		List<String> res = new ArrayList<>();
//
// 		for (int i = 1; i <= n; i++) {
//
// 			if (i % 15 == 0) {
// 				res.add("FizzBuzz");
// 			} else if (i % 3 == 0) {
// 				res.add("Fizz");
// 			} else if (i % 5 == 0) {
// 				res.add("Buzz");
// 			} else {
// 				res.add(i + "");
// 			}
// 		}
// 		return res;
// 	}
//
// 	public static void main(String[] args) {
// 		List<String> res = fizzBuzz(12);
// 		System.out.println(Arrays.toString(res));
// 	}
//
// }
