package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1424_DiagonalTraverse2 {

	public int[] findDiagonalOrder(List<List<Integer>> nums) {
		int n = 0;
		int maxKey = 0;
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();

		// traverse all elements
		// traverse row from downwards, since diagonal is from down-left corner
		for (int r = nums.size() - 1; r >= 0; r--) {
			for (int c = 0; c < nums.get(r).size(); c++) {
				map.putIfAbsent(r + c, new ArrayList<>());
				ArrayList<Integer> cur = map.get(r + c); // a reference to List
				cur.add(nums.get(r).get(c)); // update List using reference

				maxKey = Math.max(maxKey, r + c);
				n++;
			}
		}

		int[] res = new int[n];
		int i = 0;
		for (int j = 0; j <= maxKey; j++) {
			List<Integer> value = map.get(j);
			for (int val : value) {
				res[i++] = val;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 4);

	}
}
