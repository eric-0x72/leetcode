package contest;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _187a_DestinationCity {

	// Uwi solution
	public String destCity(List<List<String>> paths) {
		Set<String> set = new HashSet<>();

		// add from
		for (List<String> row : paths) {
			set.add(row.get(0));
		}

		// if to not in from set, then return
		for (List<String> row : paths) {
			// set.remove(row.get(1))
			if (!set.contains(row.get(1))) {
				return row.get(1);
			}
		}
		return "";
	}

	// using one set
	public String destCity_1(List<List<String>> paths) {
		Set<String> set = new HashSet<>();

		// add to
		for (List<String> l : paths)
			set.add(l.get(1));

		// remove from
		for (List<String> l : paths)
			set.remove(l.get(0));

		return set.iterator().next();
	}

	public static void main(String[] args) {

	}

}
