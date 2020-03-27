package contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _1389_CreateTargetArrayInGivenOrder {

	public int[] createTargetArray(int[] nums, int[] index) {

		List<Integer> li = new ArrayList<>();

		for (int i = 0; i < index.length; i++)
			li.add(index[i], nums[i]); // position, value

		return li.stream().mapToInt(i -> i).toArray();
	}

  
}
