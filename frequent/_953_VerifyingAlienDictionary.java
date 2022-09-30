package frequent;

import java.util.Arrays;

public class _953_VerifyingAlienDictionary {

	public static boolean isAlienSorted(String[] words, String order) {

		int[] index = new int[26];
		for (int i = 0; i < 26; i++) {
			index[order.charAt(i) - 'a'] = i;
		}

		for (int i = 0; i < words.length - 1; i++) {
			String word1 = words[i];
			String word2 = words[i + 1];

			int len = Math.min(word1.length(), word2.length());

			for (int k = 0; k < len; k++) {
				char char1 = word1.charAt(k);
				char char2 = word2.charAt(k);

				if (char1 != char2) {

					System.out.println("not equal char " + char1 + " " + char2);

					if (index[char1 - 'a'] > index[char2 - 'a']) {
						System.out.println("before return false");
						return false;
					} else
						break;
				} else {
					if (k == len - 1) {
						if (word1.length() > word2.length())
							return false;
					}
				}
			}
		}

		return true;

	}

	public static void main(String[] args) {

		String[] words = { "kuvp", "q" };
		String order = "ngxlkthsjuoqcpavbfdermiywz";

		boolean res = isAlienSorted(words, order);
		System.out.println(res);

	}
}
