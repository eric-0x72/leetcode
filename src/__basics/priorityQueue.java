package __basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class student {
	int score;

	public student(int score) {
		this.score = score;
	}
}

public class priorityQueue {

	public static void main(String[] args) {

		student s0 = new student(100);
		student s1 = new student(12);
		student s2 = new student(90);

		// PriorityQueue<student> pq = new PriorityQueue<>((o1, o2) -> o1.score - o2.score);
		PriorityQueue<student> pq = new PriorityQueue<>(new Comparator<student>() {
			@Override
			public int compare(student o1, student o2) {
				return o1.score - o2.score;
			}
		});

		pq.add(s1);
		pq.add(s2);
		System.out.println(pq.poll().score);
	}

}
