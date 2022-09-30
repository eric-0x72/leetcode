package backtracking;

/**
 * https://leetcode.com/problems/word-search/discuss/27811/My-Java-solution
 *
 */
public class _79_WordSearch2 {

	boolean[][] visited;
	int m, n;

	public boolean exist(char[][] board, String word) {
		m = board.length;
		n = board[0].length;

		visited = new boolean[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (dfs(board, word, i, j, 0))
					return true;
			}
		}
		return false;
	}

	// return starting from (i,j) if we match the string starting from index
	private boolean dfs(char[][] board, String word, int i, int j, int index) {
		if (index == word.length())
			return true;

		// false condition, return directly not continue recursion
		if (i >= m || j >= n || i < 0 || j < 0)
			return false;
		if (visited[i][j] || word.charAt(index) != board[i][j])
			return false;

		// set state, before recursion
		visited[i][j] = true;

		// do recursion, if not fall into previous false conditions
		if (dfs(board, word, i, j + 1, index + 1) || dfs(board, word, i + 1, j, index + 1)
				|| dfs(board, word, i, j - 1, index + 1) || dfs(board, word, i - 1, j, index + 1))
			return true;

		// restore state
		visited[i][j] = false;

		return false;
	}

}
