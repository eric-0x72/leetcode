package backtracking;

public class _79_WordSearch {

	private int d[][] = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
	private int row, col;
	private boolean[][] visited;

	public boolean exist(char[][] board, String word) {
		row = board.length;
		col = board[0].length;
		visited = new boolean[row][col];

		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				if (search(board, word, 0, i, j))
					return true;

		return false;
	}

	private boolean search(char[][] board, String word, int index, int x, int y) {

		if (index == word.length() - 1) {
			return board[x][y] == word.charAt(index);
		}

		if (board[x][y] != word.charAt(index)) {
			return false;
		}

		// set state, start recursion
		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int newx = x + d[i][0];
			int newy = y + d[i][1];

			if (inArea(newx, newy) && !visited[newx][newy])
				if (search(board, word, index + 1, newx, newy))
					return true;

			// restore state
			visited[x][y] = false;
		}

		// if not return true after the recursion, then return false
		return false;
	}

	private boolean inArea(int x, int y) {
		return x >= 0 && y >= 0 && x < row && y < col;
	}

	public static void main(String[] args) {

	}
}
