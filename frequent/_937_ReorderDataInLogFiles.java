package frequent;

import java.util.Arrays;
import java.util.Comparator;

// lc 937
public class _937_ReorderDataInLogFiles {
	public String[] reorderLogFiles(String[] logs) {

		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String log1, String log2) {
				// return negative if first is less

				String[] split1 = log1.split(" ", 2); // apply regex n-1 times, so results <= n
				String[] split2 = log2.split(" ", 2);
				boolean isDigit1 = Character.isDigit(split1[1].charAt(0)); // check if value is digit or not
				boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

				if (!isDigit1 && !isDigit2) { // if both not digits, then compare value, ignoring key
					int comp = split1[1].compareTo(split2[1]);
					if (comp != 0) // ï¿½ï¿½ï¿?
						return comp;

					return split1[0].compareTo(split2[0]); // only compare key if values are equal
				}

				if (isDigit1) {
					if (isDigit2) // if both are digits, then not change order
						return 0;
					else
						return 1; // if log2 is string, log1 is digit, then log2 comes ahead, should make log1
									// greater, so return positive
				} else
					return -1;
			}
		};

		Arrays.sort(logs, c);

		return logs;
	}
}
