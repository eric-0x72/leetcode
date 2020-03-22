package contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _5350_SortIntegersByPowerValue {

	public int getKth(int lo, int hi, int k) {
		
		List<Integer> li = new ArrayList<>();
		while (lo <= hi) {
			li.add(lo);
			lo += 1;
		}

		Collections.sort(li, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				int pa = getPower(a);
				int pb = getPower(b);
				return pa == pb ? a - b : pa - pb;
			}
		});
		return li.get(k - 1);
	}

	private int getPower(int a) {
		int power = 0;

		while (a != 1) {
			if (a % 2 == 0) {
				a /= 2;
			} else {
				a = a * 3 + 1;
			}
			power += 1;
		}
		return power;
	}
}
