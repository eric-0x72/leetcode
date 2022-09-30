package AprilChallenge;

public class __BitwiseANDofNumbersRange {

	/**
	 * brute force, TLE
	 */
	public static int rangeBitwiseAnd_0(int m, int n) {
		int res = 2147483647;

		for (int i = m; i <= n; i++) {
			res &= i;
		}
		return res;
	}

	/**
	 * bit shifting solution
	 * 
	 * equivalent to: find the common prefix of m and n binary
	 */
	public static int rangeBitwiseAnd_1(int m, int n) {
		int shift = 0;

		while (m < n) {
			m >>= 1;
			n >>= 1;
			shift++;
		}
		return n << shift;
	}

	public static void main(String[] args) {
		int res = rangeBitwiseAnd_0(5, 7);
		System.out.println(Integer.toBinaryString(res));
	}

}
