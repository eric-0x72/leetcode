package backtracking;

import java.util.Arrays;

public class _547_FriendCircles {

	static boolean[] visited;
	static int[][] mat;
	static int n;
	static int res = 0;

	public static int findCircleNum(int[][] M) {
		n = M.length;
		mat = M;
		visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (!visited[i]) { // then i is a new component
				backtrack(i);
				res++;
			}
		}
		return res;
	}

	private static void backtrack(int i) {

		// set i visited when entering the function
		visited[i] = true;

		for (int j = 0; j < n; j++) { // all students

			// j is the neighbour, if not visited, then visit j
			if (!visited[j] && mat[i][j] == 1)
				backtrack(j);
		}
	}

	public static void main(String[] args) {
		int[][] m = new int[][] { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		int res = findCircleNum(m);
		System.out.println(res);
	}
}
