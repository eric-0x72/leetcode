package contest;

import java.math.BigInteger;

public class _183b_NumberOfStepsToReduceNumberInBinaryRepToOne {

	public static int numSteps(String s) {
		long n = Integer.parseInt(s, 10);
		int res = 0;

		while (n != 1) {
			if (n % 2 == 1) {
				n += 1;
			} else {
				n /= 2;
			}
			res += 1;
		}
		return res;
	}

	// ------------------------------------------------------
	/// big integer solution
	// not digging into char array solution first
	public int numSteps_2(String s) {

		BigInteger i = new BigInteger(s, 2);
		int res = 0;
		while (!BigInteger.ONE.equals(i)) {
			if (i.testBit(0)) {
				i = i.add(BigInteger.ONE);
			} else {
				i = i.shiftRight(1);
			}
			res++;
		}
		return res;
	}

	// ------------------------------------------------------
	/**
	 * this solution is learned from Charlesna
	 * 
	 */
	public int numSteps_3(String s) {
		int res = 0;
		while (s.length() > 1) {
			if (s.charAt(s.length() - 1) == '0') {
				s = s.substring(0, s.length() - 1); // divide by 2
			} else {
				s = addOne(s); // add 1 helper
			}
			res++;
		}
		return res;
	}

	private String addOne(String s) {
		StringBuilder sb = new StringBuilder();
		int carry = 1;
		int index = s.length() - 1;

		while (index >= 0 || carry > 0) {
			int cur = index >= 0 ? (s.charAt(index--) - '0') : 0;
			int val = cur + carry;
			carry = val / 2;
			sb.append(val % 2);
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
	}
}
