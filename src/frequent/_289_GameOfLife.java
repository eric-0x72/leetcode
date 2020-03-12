package frequent;

import java.util.Arrays;

public class _289_GameOfLife {

	public static void gameOfLife(int[][] board) {

		int[] direction = { 0, 1, -1 };

		int rows = board.length;
		int cols = board[0].length;

		// int[][] copy = board.clone(); // ǳ������������
		int[][] copy = new int[rows][cols];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				copy[row][col] = board[row][col];
			}
		}

		for (int row = 0; row < rows; row++)
			for (int col = 0; col < cols; col++) {

				int liveNeighbours = 0;

				for (int i = 0; i < 3; i++)
					for (int j = 0; j < 3; j++) {

						if (!(direction[i] == 0 && direction[j] == 0)) {
							int newRow = row + direction[i];
							int newCol = col + direction[j];

							if ((newRow < rows && newRow >= 0) && (newCol < cols && newCol >= 0)
									&& copy[newRow][newCol] == 1)
								liveNeighbours += 1;
						}
					}

				// rule 1 and 3: under and over population
				if ((copy[row][col] == 1) && (liveNeighbours < 2 || liveNeighbours > 3))
					board[row][col] = 0;

				// rule 4: new birth
				if ((copy[row][col] == 0) && liveNeighbours == 3)
					board[row][col] = 1;
			}

	}

	public static void main(String[] args) {

		int[][] input = { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 }, { 0, 0, 0 } };
		int[][] test = input.clone();

		input[0][1] = 999 ;

		for (int i = 0; i < 4; i++)
			System.out.println(Arrays.toString(test[i]));

		// gameOfLife(input);

//		for (int i = 0; i < 4; i++)
//			System.out.println(Arrays.toString(input[i]));
	}
}
