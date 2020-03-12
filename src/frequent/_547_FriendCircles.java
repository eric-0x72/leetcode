package frequent;

import java.util.Arrays;

public class _547_FriendCircles {

	private static boolean[] visited;
	private static int n;
	private static int res = 0;

	public static int findCircleNum(int[][] M) {

		n = M.length;
		visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				dfs(M, i);
				res++;
			}
		}
		return res;
	}

	private static void dfs(int[][] M, int x) {

		for (int j = 0; j < n; j++) { // j��x�������ǣ�����j

			if (!visited[j] && M[x][j] == 1) {
				visited[j] = true;
				dfs(M, j);
			}
		}
	}

	public static void main(String[] args) {

		int[][] a = { { 1, 0, 0, 1 }, { 0, 1, 1, 0 }, { 0, 1, 1, 1 }, { 1, 0, 1, 1 } };
		int res = findCircleNum(a);
		System.out.println(res);
	}

}
