package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * tag: heap, design
 */
public class _295_MedianFinder {

	// small is max heap
	private PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());

	// large is min heap
	private PriorityQueue<Integer> large = new PriorityQueue<>();

	private boolean even = true;

	public _295_MedianFinder() {

	}

	public void addNum(int num) {
		// 1 3 7, 10 17 19
		// add to large part, but need to compare with small part first
		if (even) {
			small.offer(num); // add to small heap
			large.offer(small.poll()); // then remove max of samll add to large
		} else {
			large.offer(num);
			small.add(large.poll());
		}
	}

	public double findMedian() {

		if (even) {
			return (small.peek() + large.peek()) / 2.0;
		}

		// if odd, then get from large heap
		else {
			return large.peek();
		}
	}

	public static void main(String[] args) {

	}
}
