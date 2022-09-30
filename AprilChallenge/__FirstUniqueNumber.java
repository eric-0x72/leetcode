package AprilChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class __FirstUniqueNumber {

	Queue<Integer> q = new LinkedList<>();
	HashSet<Integer> set = new HashSet<>();

	public __FirstUniqueNumber(int[] nums) {

		for (int i : nums) {
			if (!set.contains(i)) {
				q.add(i);
				set.add(i);
			} else {
				q.remove(i);
			}

		}

	}

	public int showFirstUnique() {
		return q.isEmpty() ? -1 : q.peek();
	}

	public void add(int v) {
		if (set.contains(v)) {
			q.remove(v);
		} else {
			q.add(v);
		}
		set.add(v);
	}

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);

		// remove the first value in the queue
		q.remove(4);

		for (Integer i : q) {
			System.out.println(i);
		}

	}
}
