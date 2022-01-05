// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;
//
// public class _139_WordBreak {
//
// 	public boolean wordBreak(String s, List<String> wordDict) {
// 		// return backtrack(s, new HashSet<>(wordDict), 0, new Boolean[s.length()]);
//
// 	}
//
// 	/**
// 	 * top down with memo
// 	 */
// 	private boolean backtrack(String s, Set<String> dict, int start, Boolean[] memo) {
// 		if (start == s.length())
// 			return true;
//
// 		if (memo[start] != null) // Boolean is initialised to null
// 			return memo[start];
//
// 		for (int end = start + 1; end <= s.length(); end++) {
// 			String word = s.substring(start, end);
//
// 			if (dict.contains(word) && backtrack(s, dict, end, memo))
// 				return memo[start] = true;
// 		}
// 		return memo[start] = false;
// 	}
//
// 	private boolean wordBreak_dp(String s, List<String> wordDict) {
// 		int n = s.length();
//
// 		boolean[] dp = new boolean[n + 1]; // [0, n]
// 		dp[0] = true;
//
// 		for (int i = 1; i <= s.length(); i++) {
// 			for (int j = 0; j < i; j++) { // [j, i-1]
// 				if (dp[j] && wordDict.contains(s.substring(j, i))) {
// 					dp[i] = true;
// 					break;
// 				}
// 			}
// 		}
// 		return dp[n];
// 	}
//
// 	public static void main(String[] args) {
//
// 		String s = "abcde";
//
// 		CharSequence a = s.subSequence(0, 5);
//
// 	}
//
// }
