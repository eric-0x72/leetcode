package __basics;

import java.util.Arrays;

public class Char {

	public static void main(String[] args) {

		String order = "abcdefghijklmnopqrstuvwxyz";
		int[] index = new int[26];

		for (int i = 0; i < order.length(); i++) {
			index[order.charAt(i) - 'a'] = i;
		}

		System.out.println(Arrays.toString(index));
	}

}
