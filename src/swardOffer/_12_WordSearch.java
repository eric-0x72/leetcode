package swardOffer;

public class _12_WordSearch {

	private int[][] d = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
	private int rows, cols;
	private boolean[][] visited;

	public boolean exist(char[][] board, String word) {
		rows = board.length;
		cols = board[0].length;
		visited = new boolean[rows][cols];

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				if (search(board, word, 0, r, c) == true)
					return true;
			}
		}
		return false;
	}

	private boolean search(char[][] board, String word, int index, int x, int y) {

		if (index == word.length() - 1)
			return board[x][y] == word.charAt(index);

		// if char match
		if (board[x][y] == word.charAt(index)) {
			visited[x][y] = true;

			for (int i = 0; i < 4; i++) {

				int newx = x + d[i][0];
				int newy = y + d[i][1];

				if (inArea(newx, newy) && !visited[newx][newy])
					if (search(board, word, index + 1, newx, newy) == true)
						return true;

			}
			visited[x][y] = false;
		}
		return false;
	}

	private boolean inArea(int x, int y) {
		return x >= 0 && y >= 0 && x < rows && y < cols;
	}

}
