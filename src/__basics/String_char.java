package __basics;

public class String_char {

	public static void main(String[] args) {
		/**
		 * == operators for reference comparison (address comparison) and .equals()
		 * method for content comparison.
		 * 
		 * In simple words, == checks if both objects point to the same memory location;
		 * whereas .equals() evaluates to the comparison of values in the objects
		 */

		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		String s3 = "hello";
		String s4 = "hello";

		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1.equals(s2) : " + s1.equals(s2)); //

		System.out.println("s3 == s4: " + (s3 == s4)); // true
		System.out.println("s3.equals(s4) : " + s3.equals(s4)); // true

		// --------------------------------------------------------------

		// check if a single character appears in a string
		String a = "abcdefg";
		System.out.println("if 'c' exist in string: " + a.indexOf('c')); // if not returns -1

	}
}
