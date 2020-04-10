package twoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _76_MinWindowSubstring {

	public String minWindow(String s, String target) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < target.length(); i++) {
			int count = map.getOrDefault(target.charAt(i), 0);
			map.put(target.charAt(i), count + 1);
		}

		int window = map.size();

		int l = 0, r = 0;
		
		
		

	}

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 23);
		System.out.println(a);
	}

}
