package AprilChallenge;

import java.util.Arrays;

public class __PerformStringShifts {

	public static String stringShift(String s, int[][] shift) {

		int l = 0;
		int r = 0;
		for (int[] a : shift) {
			if (a[0] == 0) // left shift
				l += a[1];
			else
				r += a[1];
		}
		// System.out.println(l + ", " + r);
		int len = s.length();

		StringBuilder sb = new StringBuilder(s);

		int abs = l - r;
		if (abs > 0) {
			abs = abs % len;
			sb.insert(sb.length(), s.substring(0, abs)); // <--
			sb.delete(0, abs);
		} else {
			abs = abs % len;
			sb.insert(0, sb.substring(len + abs, len));
			sb.delete(sb.length() + abs, sb.length());

		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "yisxjwry";
		int[][] a = { { 1, 8 }, { 1, 4 }, { 1, 3 }, { 1, 6 }, { 0, 6 }, { 1, 4 }, { 0, 2 }, { 0, 1 } };
		String res = stringShift(s, a);
		System.out.println(res);

//		String a = "mecsk";
//		StringBuilder sb = new StringBuilder(a);
//		sb.insert(0, sb.substring(0, 5));
//		System.out.println(sb.toString());
//		sb.delete(start, end)

	}
}
