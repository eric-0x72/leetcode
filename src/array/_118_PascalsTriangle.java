package array;

import java.util.ArrayList;
import java.util.List;

public class _118_PascalsTriangle {

	public List<List<Integer>> generate(int k) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < k; i++) {
			list.add(0, 1);

			for (int j = 1; j < list.size() - 1; j++) {
				list.set(j, list.get(j) + list.get(j + 1));
			}
			res.add(new ArrayList<>(list));
		}
		return res;
	}
}
