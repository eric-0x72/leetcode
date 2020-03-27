package __basics;

/**
 * @author weibang
 *
 *         OR operation is to retain 1
 * 
 *         AND operation is to retain 0
 * 
 *         XOR operation is to detect difference
 *
 *
 */
public class BitOperation {

	public static void main(String[] args) {

		int intmax1 = (1 << 31) - 1; // int is 32 bit, with the highest bit +/- sign
		int intmax2 = Integer.MAX_VALUE;
		String a = Integer.toBinaryString(intmax1);
		System.out.println("max value = " + intmax1 + " == " + intmax2);
		System.out.println(a);

		// count number of 1's in binary representation of integer
		System.out.println("bit count of 3 = " + Integer.bitCount(3));

		// bit operation
		System.out.println("bit operation: " + (1 << 4)); // shift 1 to left 4 times, get 10000 = 16

		// bit wise toggle if vowel
		String input = "ou";
		int cur = 0;
		// uoiea is the position of cur
		for (int i = 0; i < input.length(); i++) {
			cur ^= 1 << ("aeiou".indexOf(input.charAt(i)));
		}
		System.out.println(Integer.toBinaryString(cur));

		// how to get negative?
		// take the positive, invert all bits then add one
		int five = 5; // 00101
		int negativeFive = ~five + 1; // invert get 11010 , add one get 11011 which is -5
		System.out.println(negativeFive);

	}

}
