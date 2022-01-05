// package backtracking;
//
// import java.util.LinkedList;
// import java.util.List;
//
// public class _93_RestoreIpAddresses {
//
// 	int n;
// 	String s;
//
// 	List<String> segments = new LinkedList<>();
// 	List<String> output = new LinkedList<>();
//
// 	public List<String> restoreIpAddresses(String s) {
//
// 	}
//
// 	private void backtrack(int pre, int dots) {
//
// 		int max_pos = Math.min(n - 1, pre + 4);
// 		for (int cur = pre + 1; cur < max_pos; cur++) {
// 			String seg = s.substring(pre + 1, cur + 1);
// 			if (isValid(seg)) {
// 				segments.add(seg);
// 				if (dots - 1 == 0)
// 					update_res(cur);
// 			}
// 		}
//
// 	}
//
// 	private void update_res(int cur) {
// 	}
//
// 	private boolean isValid(String segment) {
// 	}
//
// 	public static void main(String[] args) {
//
// 	}
// }
