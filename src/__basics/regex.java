package __basics;

import java.util.Arrays;

public class regex {

	public static void main(String[] args) {

		String sentence = "this is a proper sentence, hello world! ";
		String temp = sentence.replaceAll("[^a-zA-Z ]", " "); // replace not those, with a space
		String[] words = sentence.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+"); // split with multiple
																								// spaces
		System.out.println(temp); // spaces
		System.out.println(Arrays.toString(words));

	}

}
