package frequent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class _139_WordBreak {

	public static boolean wordBreak(String s, List<String> wordDict) {
		return helper(s, new HashSet<String>(wordDict), 0);
	}

	private static boolean helper(String s, HashSet<String> set, int start) {
		if (start == s.length())
			return true;

		for (int end = start + 1; end <= s.length(); end++)
			if (set.contains(s.substring(start, end)) && helper(s, set, end))
				return true;

		return false;
	}

	public static void main(String[] args) {

		List<String> a = new LinkedList<String>();
		wordBreak("applepen", a);
		System.out.println("done this ...");
	}
}
