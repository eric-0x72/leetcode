package contest;

import java.util.ArrayList;
import java.util.List;

public class _184a_StringMatchinginArray {

	public static List<String> stringMatching(String[] words) {
		int n = words.length;
		List<String> res = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			inner: for (int j = 0; j < n; j++) {
				if (j != i) {
					if (words[j].indexOf(words[i]) != -1) {
						res.add(words[i]);
						break inner;
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// String[] a = { "leetcode", "et", "code" };
		String[] a = { "leetcoder", "leetcode", "od", "hamlet", "am" };
		List<String> res = stringMatching(a);
		System.out.println(res);
	}

}
