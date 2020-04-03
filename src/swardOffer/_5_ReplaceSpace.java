package swardOffer;

import java.util.Arrays;

public class _5_ReplaceSpace {

	/**
	 * using char array
	 * 
	 */
	public static String replaceSpace(String s) {
		int len = s.length();

		char[] arr = new char[len * 3]; // longest possible string length
		int size = 0;

		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);

			if (c == ' ') {
				arr[size++] = '%';
				arr[size++] = '2';
				arr[size++] = '0';

			} else {
				arr[size++] = c;
			}
		}

		String res = new String(arr, 0, size);
		return res;
	}

	public static String replaceSpace_1(String s) {
		StringBuilder sb = new StringBuilder(s);

		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == ' ') {
				// delete space, which is at [i, i+1), which is just i position
				// replace with the string
				sb.replace(i, i + 1, "%20");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String res = replaceSpace_1("hello world haha");
		System.out.println(res);

		StringBuilder sb = new StringBuilder("testingabcde");
		sb.replace(0, 5, "0000000");
		System.out.println(sb.toString());
	}
}
