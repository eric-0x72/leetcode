package AprilChallenge;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class __LastStoneWeight {

	public static int lastStoneWeight(int[] stones) {

		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		// PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
		for (int s : stones) {
			q.offer(s);
		}

		while (q.size() > 1) {
			int x = q.poll();
			int y = q.poll();

			if (x != y)
				q.offer(x - y);
		}
		return q.size() == 1 ? q.poll() : 0;
	}

	public static void main(String[] args) {
		int[] a = { 2, 7, 4, 1, 8, 1 };
		int res = lastStoneWeight(a);
		System.out.println(res);
	}

}
