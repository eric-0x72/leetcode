package greedy;

import java.util.Arrays;
import java.util.Stack;

public class _455_AssignCookies {

	public int findContentChildren(int[] greedy, int[] size) {
		Arrays.sort(greedy);
		Arrays.sort(size);

		int i = 0; // child

		// j is cookie size
		for (int j = 0; i < greedy.length && j < size.length; j++) {

			// fulfil i child first, before moving to next child, i++
			// this reflects that i-th child is greedy
			// greedy: he will continue asking for bigger cookie until he is fulfilled
			if (greedy[i] <= size[j])
				i++; // only increase child if he has been fulfilled

		}
		return i;
	}
}
