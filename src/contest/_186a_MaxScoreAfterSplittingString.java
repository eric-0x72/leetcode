package contest;

public class _186a_MaxScoreAfterSplittingString {

	public int maxScore(String s) {
		int n = s.length();
		int res = 0;

		// [l, r)
		for (int i = 1; i <= n - 1; i++) {
			String left = s.substring(0, i);
			String right = s.substring(i, n);

			int l = (int) left.chars().filter(ch -> ch == '0').count();
			int r = (int) right.chars().filter(ch -> ch == '1').count();

			res = Math.max(res, l + r);
		}
		return res;
	}

	public static void main(String[] args) {
		String s = "11";
		int n = s.length();
		int i = 1;
		String left = s.substring(0, i);
		String right = s.substring(i, n);

		System.out.println(left + "\t" + right);
	}
}
