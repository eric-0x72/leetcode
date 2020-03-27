package bitOperation;

public class _476_NumberComplement {

	public int findComplement(int num) {

		// note that (number + complement) = mask
		int mask = (Integer.highestOneBit(num) << 1) - 1;
		return mask - num;
	}

	public static void main(String[] args) {

		// 14 = 1110, highest bit is 1000 which is 8
		System.out.println(Integer.highestOneBit(14));
		System.out.println((Integer.highestOneBit(14) << 1) - 1);

	}
}
