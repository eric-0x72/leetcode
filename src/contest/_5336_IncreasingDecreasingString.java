package contest;

import java.util.TreeMap;

public class _5336_IncreasingDecreasingString {

	public static String sortString(String s) {

		StringBuilder sb = new StringBuilder();
		TreeMap<Character, Integer> map = new TreeMap<>(); // treemap has ordered keys

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}

		while (sb.length() < s.length()) {
			for (char c : map.keySet()) {
				if (map.get(c) != 0) {
					sb.append(c);
					map.put(c, map.get(c) - 1);
				}
			}

			for (char c : map.descendingKeySet()) {
				if (map.get(c) != 0) {
					sb.append(c);
					map.put(c, map.get(c) - 1);
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String res = sortString("aaaabbbbcccc");
		System.out.println(res);
	}
}
