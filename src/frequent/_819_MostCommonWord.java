package frequent;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class _819_MostCommonWord {

	public static String mostCommonWord(String paragraph, String[] banned) {

		HashMap<String, Integer> map = new HashMap<>();

		String[] words = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+"); // ��һ�仰�����ո�

		for (String word : words) {
			if (!map.containsKey(word))
				map.put(word, 1);
			else
				map.put(word, map.get(word) + 1);
		}
		System.out.println(map);

		for (String word : banned) {
			if (map.containsKey(word))
				map.remove(word);
		}
		System.out.println(map);

		int max = 0;
		String res = null;
		for (String k : map.keySet()) {
			if (map.get(k) > max) {
				res = k;
				max = map.get(k);
			}
		}
		return res;
	}

	public static void main(String[] args) {

		String in = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] ban = { "hit" };

		String res = mostCommonWord(in, ban);
		System.out.println(res);
	}
}
