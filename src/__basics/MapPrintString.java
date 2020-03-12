package __basics;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPrintString {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("beijing", 46);
		map.put("shanghai", 78);
		System.out.println(map.toString().replace("=", ":"));

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}

		// map to list
		List<String> li = new LinkedList<String>();
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> e : entrySet) {
			li.add(e.getKey() + ":"+ e.getValue());
		}
		System.out.println(li.toString().replace("[", "").replace("]", ""));
	}
}
