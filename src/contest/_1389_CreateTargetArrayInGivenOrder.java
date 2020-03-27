package contest;

import java.util.ArrayList;
import java.util.List;

public class _1389_CreateTargetArrayInGivenOrder {

	public int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> li = new ArrayList<>();

		for (int i = 0; i < index.length; i++)
			li.add(index[i], nums[i]); // position, value

		return li.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(0, 2); // [2]
		li.add(1, 9); // [2, 9]
		li.add(1, 71); // [2, 71, 9], note 9 got shifted back

		System.out.println(li.stream().mapToInt(i -> i).toArray());
	}
}
