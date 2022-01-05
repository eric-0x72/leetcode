// package lcOffer;
//
// import java.util.ArrayList;
// import java.util.List;
//
// /**
//  * 输入：s = "abc"
//  *
//  * 输出：["abc","acb","bac","bca","cab","cba"]
//  *
//  */
// public class _38_Permutation {
//
// 	List<String> res = new ArrayList<>();
// 	boolean[] visited;
//
// 	public String[] permutation(String s) {
// 		visited = new boolean[s.length()];
// 		backtrack(s, 0);
// 	}
//
// 	private void backtrack(String s, int index, String cur) {
//
// 		if (cur.length() == s.length())
// 			res.add(cur);
//
// 		for (int i = 0; i < s.length(); i++) {
// 			if(visited [i])
// 				continue ;
//
// 			visited[ i ] = true ;
//
//
// 		}
//
// 	}
//
// }
