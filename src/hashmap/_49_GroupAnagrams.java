package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _49_GroupAnagrams {

	public static List<List<String>> groupAnagrams(String[] strs) {

		// List<List<String>> res = new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();

		for (int i = 0; i < strs.length; i++) {
			String cur = strs[i];
			char[] chars = cur.toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);

			// map.put(sorted, map.getOrDefault(map.get(sorted).add(cur), new
			// ArrayList<>(Arrays.asList(cur))));
			if (map.containsKey(sorted)) {
				List<String> temp = map.get(sorted);
				temp.add(cur);
				map.put(sorted, temp);
			} else {
				List<String> temp = new ArrayList<>();
				temp.add(cur);
				map.put(sorted, temp);
			}

		}

//		map.values() // this gives collections
//		System.out.println(map.values());
//		System.out.println(new ArrayList<>(map.values())); // convert from collection to list
		return new ArrayList<>(map.values());
	}

	public static void main(String[] args) {
		// System.out.println(new ArrayList<>(Arrays.asList('w', "a", "b", 12, 1.1)));
		String[] a = { "eat", "tea", "tan", "ate", "nat", "bat" };
		groupAnagrams(a);
	}
}
