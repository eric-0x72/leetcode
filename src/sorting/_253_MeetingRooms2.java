package sorting;

import java.util.Arrays;
import java.util.PriorityQueue;

// find the min number of conference rooms required
public class _253_MeetingRooms2 {

	public int minMeetingRooms(int[][] intervals) {

		if (intervals.length == 0)
			return 0;

		// sort by start time
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		PriorityQueue<Integer> q = new PriorityQueue<>(); // (a, b) -> a - b

		q.add(intervals[0][1]);

		for (int i = 1; i < intervals.length; i++) {

			// if can reuse old room, then poll q
			if (intervals[i][0] >= q.peek()) {
				q.poll(); // reuse old room
				q.add(intervals[i][1]); // update new event end time
			} else {
				q.add(intervals[i][1]); // allocate new room
			}
		}
		return q.size();
	}

}
