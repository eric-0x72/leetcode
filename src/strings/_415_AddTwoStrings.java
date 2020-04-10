package strings;

public class _415_AddTwoStrings {

	public String addStrings(String s1, String s2) {
		
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		int sum = 0;

		int i = s1.length() - 1;
		int j = s2.length() - 1;

		while (i >= 0 || j >= 0) { // must finish both, thus OR

			sum = carry; // initialise sum as the carry from previous

			if (i >= 0)
				sum += s1.charAt(i) - '0';
			if (j >= 0)
				sum += s2.charAt(j) - '0';

			// sb.append(sum % 10);
			sb.insert(0, sum % 10);
			carry = sum / 10;

			i--;
			j--;
		}
		if (carry != 0)
			// sb.append(carry);
			sb.insert(0, carry);

		// return sb.reverse().toString();
		return sb.toString();
	}

	public static void main(String[] args) {
		String a = "abcde";
		StringBuilder sb = new StringBuilder(a);

//		System.out.println(sb.reverse());
		System.out.println(sb.insert(0, '-'));
	}

}
