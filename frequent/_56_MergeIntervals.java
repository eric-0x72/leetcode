package frequent;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class _56_MergeIntervals {

	private class IntervalComparator implements Comparator<int[]> {
		@Override
		public int compare(int[] a, int[] b) {
			int a0 = a[0], b0 = b[0];

			return a0 < b0 ? -1 : a0 == b0 ? 0 : 1;
		}
	}

	public int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, new IntervalComparator());

		LinkedList<int[]> merged = new LinkedList<>();

		for (int[] interval : intervals) {
			// ���merged�����һ�����Ҷ�? < ���ڼ�����ˣ���ô���ڼ�����䲻��֮ǰ������������merged
			if (merged.isEmpty() || merged.getLast()[1] < interval[0])
				merged.add(interval);
			else
				merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
		}

		// convert linkedlist back to array!!
		int[][] ret = new int[merged.size()][2];
		for (int i = 0; i < merged.size(); i++)
			ret[i] = merged.get(i);

		return ret;
	}

}
