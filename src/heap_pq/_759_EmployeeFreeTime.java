package heap_pq;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

//Definition for an Interval
class Interval {
	public int start;
	public int end;

	public Interval() {
	}

	public Interval(int _start, int _end) {
		start = _start;
		end = _end;
	}
}

public class _759_EmployeeFreeTime {

	public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
		List<Interval> res = new ArrayList<>();

		PriorityQueue<Interval> q = new PriorityQueue<>((a, b) -> a.start - b.start);
		schedule.forEach(e -> q.addAll(e));

		Interval temp = q.poll();
		while (!q.isEmpty()) {
			// there is a gap
			if (temp.end < q.peek().start) {
				res.add(new Interval(temp.end, q.peek().start));
				temp = q.poll();
			}
			// there is no gap
			else {
				// temp = temp.end < q.peek().end ? q.peek() : temp;
				if (temp.end < q.peek().end)
					temp = q.poll(); // use q.peek() as temp

				// if temp.end > q.peek.end, then temp completely overlaps next,
				else {
					q.poll(); // q must be polled anyway
				}

			}
		}
		return res;
	}
}
