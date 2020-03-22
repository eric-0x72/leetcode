package __basics;

public class AlphabeticalOrder {

	public static void main(String[] args) {

		// lexically (a - b), gives the distance between a and b
		// if want natural alphabetical order, then compareTo(a-b)
		String a = "z";
		String b = "a";
		System.out.println(a.compareTo(b));
	}

}
