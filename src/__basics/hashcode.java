package __basics;

/**
 * Returns a hash code for this string.
 * 
 * The hash code for a String object is computed as
 * 
 * s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
 * 
 * using int arithmetic, where s[i] is the ith character of the string, n is the
 * length of the string, and ^ indicates exponentiation.(The hash value of the
 * empty string is zero.)
 *
 */
public class hashcode {

	public static void main(String args[]) {
		String Str = new String("www.runoob.com °¡¹þ¹þ");
		System.out.println("hashcode of the string is :" + Str.hashCode());

		System.out.println(2 ^ 3);
	}
}
