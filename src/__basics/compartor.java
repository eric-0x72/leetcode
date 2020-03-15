package __basics;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class compartor {

	public static void main(String[] args) {

		Queue<Integer> q = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});

		Queue<String> q1 = new PriorityQueue<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// return o1.compareTo(o2); 
				return o2.compareTo(o1); 
			}
		});

		q.add(12);
		q.add(7);
		q.add(79);
		System.out.println(q);

		System.out.println("a".compareTo("b")); // a-b=-1 ; a<b
		q1.add("a");
		q1.add("b");
		System.out.println(q1);

	}
}
