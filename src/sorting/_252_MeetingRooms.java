package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class _252_MeetingRooms {

	// see Q56 Merge intervals
	private class MyComparator implements Comparator<int[]> {
		@Override
		public int compare(int[] a, int[] b) {
			return a[0] - b[0];
		}
	}

	// attending all meetings means no overlap in between meetings
	public boolean canAttendMeetings(int[][] intervals) {
		if (intervals == null || intervals.length == 0)
			return true;

		Arrays.sort(intervals, new MyComparator());

		int end = intervals[0][1];

		for (int i = 1; i < intervals.length; i++) {
			if (end > intervals[i][0])
				return false;

			end = intervals[i][1];
		}
		return true;
	}

}
