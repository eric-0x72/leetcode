package swardOffer;

public class _15_BinaryNumberOfOnes {

	// you need to treat n as an unsigned value
	public int hammingWeight2(int n) {
		return Integer.bitCount(n);
	}

	public int hammingWeight(int n) {
		int res = 0;

		while (n != 0) {
			res += n & 00000001; // mask the last bit
			n = n >>> 1;
		}
		return res;
	}

	public static void main(String[] args) {

		System.out.println(5 & 00000001); // 101, mask last bit, get 1
		System.out.println(2 & 00000001);

	}

}
