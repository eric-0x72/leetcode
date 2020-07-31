package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _119_PascalsTriangle2 {

	public List<Integer> getRow(int k) {
		return generate(k).get(k);
	}

	public List<List<Integer>> generate(int k) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < k; i++) {
			// add 1 at the beginning
			list.add(0, 1);

			for (int j = 1; j < list.size() - 1; j++) {
				// sum of current and next
				list.set(j, list.get(j) + list.get(j + 1));
			}
			res.add(new ArrayList<>(list));
		}
		return res;
	}

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>(12);
		arr.add(12);
		arr.add(7);

		System.out.println(arr);
	}

}
