package frequent;

public class _79_WordSearch {

	private boolean[][] visited;
	int row, col;
	int[][] d = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };

	public boolean exist(char[][] board, String word) {

		row = board.length;
		col = board[0].length;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				boolean found = search(board, word, 0, i, j);
				if (found)
					return true;
			}
		}
		return false;
	}

	// index�ǵ�ǰ�ڼ�����ĸλ��, ��startx starty��ʼ��
	// �����Ƿ��ҵ��������ַ���
	private boolean search(char[][] board, String word, int index, int startx, int starty) {

		if (index == word.length() - 1)
			return word.charAt(index) == board[startx][starty];

		if (board[startx][starty] == word.charAt(index)) {

			visited[startx][starty] = true; // ״̬��Ϊ���ʹ�

			for (int i = 0; i < 4; i++) {
				int newx = startx + d[i][0];
				int newy = starty + d[i][1];

				if (isValid(newx, newy) && !visited[newx][newy]) {
					boolean found = search(board, word, index + 1, newx, newy);
					if (found)
						return true;
				}
			}

			visited[startx][starty] = false; // ����״̬

		}
		return false;
	}

	private boolean isValid(int x, int y) {
		return x >= 0 && x < row && y >= 0 && y < col;
	}
}
