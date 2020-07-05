package AprilChallenge;

public class _678_ValidParenthesisString {

	public static boolean checkValidString(String s) {

		// open parenthesis in range [cmin, cmax]
		int min = 0; // min count of open bracket, including *
		int max = 0;

		for (char c : s.toCharArray()) {
			if (c == '(') {
				max++;
				min++;
			} else if (c == ')') {
				max--;
				min = (min - 1 < 0) ? 0 : min - 1; // floor min to 0
			}

			// now, if char is *
			else {
				max++; // if * represents (
				min = (min - 1 < 0) ? 0 : min - 1; // if * represents ), decrease open count
			}

			// if in short of open bracket -> invalid
			if (max < 0)
				return false;
		}

		// min must be 0 in the end
		return min == 0;
	}

	public static void main(String[] args) {
		String a = "((())";
		boolean res = checkValidString(a);
		System.out.println(res);
	}
}
