package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _51_NQueens {

	Set<Integer> colSet = new HashSet<>();
	Set<Integer> hillSet = new HashSet<>(); // hill /
	Set<Integer> daleSet = new HashSet<>(); // dale \

	public List<List<String>> solveNQueens(int n) {
		List<List<String>> res = new ArrayList<>();
		backtrack(res, new ArrayList<String>(), 0, n);
		return res;
	}

	private void backtrack(List<List<String>> res, ArrayList<String> li, int r, int n) {

		if (r == n) {
			res.add(new ArrayList<>(li));
			return;
		}

		// go through every column
		// iterate all possible candidates
		for (int c = 0; c < n; c++) {
			if (colSet.contains(c) || hillSet.contains(r + c) || daleSet.contains(r - c))
				continue;

			char[] arr = new char[n];
			Arrays.fill(arr, '.');

			arr[c] = 'Q'; // put queen on that column
			String rowString = new String(arr);

			// set state
			li.add(rowString);
			colSet.add(c);
			hillSet.add(r + c);
			daleSet.add(r - c);

			// do backtracking
			backtrack(res, li, r + 1, n);

			// restore state
			li.remove(li.size() - 1);
			colSet.remove(c);
			hillSet.remove(r + c);
			daleSet.remove(r - c);
		} // end for

	}

}
