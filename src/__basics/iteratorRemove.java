package __basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorRemove {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);

//		for (Integer a : li) {
//			if (a == 3) {
//				li.remove(3); // ConcurrentModificationException, cannot delete from iterator!
//				// iterator do not allow changing while working
//			}
//
//		}

		Iterator<Integer> it_b = li.iterator();
		while (it_b.hasNext()) {
			Integer a = it_b.next();
			if (a == 3) {
				it_b.remove();
			}
		}

		for (Integer b : li) {
			System.out.println(b);
		}
	}
}
