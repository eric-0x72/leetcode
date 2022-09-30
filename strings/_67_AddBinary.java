package strings;

public class _67_AddBinary {

	public String addBinary_naive(String a, String b) {
		int aa = Integer.parseInt(a, 2);
		int bb = Integer.parseInt(b, 2);

		return Integer.toBinaryString(aa + bb);
	}

	public String addBinary(String a, String b) {

		StringBuilder sb = new StringBuilder();

		int i = a.length() - 1; // starting from the last digit
		int j = b.length() - 1;

		int carry = 0;

		while (i >= 0 || j >= 0) {
			int sum = carry; // sum add last carry

			if (j >= 0)
				sum += b.charAt(j--) - '0';
			if (i >= 0)
				sum += a.charAt(i--) - '0';

			// calculate current figure
			sb.append(sum % 2); // sum%2 is
			carry = sum / 2; // next carry
		}

		if (carry != 0)
			sb.append(carry);

		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		String s = "1011";
		System.out.println(Integer.parseInt(s, 3));

	}
}
