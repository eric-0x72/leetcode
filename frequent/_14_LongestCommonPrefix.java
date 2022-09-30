package frequent;

public class _14_LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";

		for (int i = 0; i < strs[0].length(); i++) {
			char c = strs[0].charAt(i);

			// vertical scan every string
			for (int j = 1; j < strs.length; j++) {
				// if strs[j] has ended (note that his must come first!!)
				// since if strs[j] has ended, then second condition will null pointer
				// if j-th string's i-th char does not match c
				if (strs[j].length() == i || strs[j].charAt(i) != c)
					return strs[0].substring(0, i);
			}
		}
		return strs[0];
	}

	public static void main(String[] args) {
		String[] a;
		a = null; // a = new String[12] ;

		System.out.println(a == null);
	}
}
