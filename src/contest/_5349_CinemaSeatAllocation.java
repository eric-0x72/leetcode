package contest;

import java.util.Arrays;
import java.util.Comparator;

public class _5349_CinemaSeatAllocation {

	public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

		// sort reserved seats
		Arrays.sort(reservedSeats, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if (a[0] != b[0])
					return a[0] - b[0];
				return a[1] - b[1];
			}
		});

		int res = 2 * n; // max families in total

		for (int i = 0; i < reservedSeats.length;) {
			int j = i;

			// find reserved seats in a row
			while (j < reservedSeats.length && reservedSeats[j][0] == reservedSeats[i][0]) {
				j++;
			}
			res -= 2;
			int pattern = 0;

			// k is the starting position of reserved seat in a row
			// note that there is one more bit more, 0
			// 10 9 8 7 6 5 4 3 2 1 | 0
			for (int k = i; k < j; k++) {
				pattern |= 1 << reservedSeats[k][1]; // OR operation, retains 1
			}

			// mask for seat 9 to 2
			if ((pattern & ((1 << 10) - (1 << 2))) == 0)
				res += 2;
			// mask for 7 6 5 4
			else if ((pattern & ((1 << 8) - (1 << 4))) == 0)
				res++;
			// mask for 5 4 3 2
			else if ((pattern & ((1 << 6) - (1 << 2))) == 0)
				res++;
			// mask for 9 8 7 6
			else if ((pattern & ((1 << 10) - (1 << 6))) == 0)
				res++;

			i = j; // update next row reserved position
		}
		return res;
	}

	public static void main(String[] args) {
		int a = (1 << 10) - (1 << 2);
		System.out.println(Integer.toBinaryString(a));

		int b = ((1 << 8) - (1 << 4));
		System.out.println(Integer.toBinaryString(b));

		int[][] arr = { { 1, 2 }, { 1, 3 }, { 1, 8 } };
		int ptn = 0;
		for (int k = 0; k < 3; k++) {
			ptn |= 1 << arr[k][1]; // OR operation, retains 1
		}
		System.out.println(Integer.toBinaryString(ptn));
	}
}
