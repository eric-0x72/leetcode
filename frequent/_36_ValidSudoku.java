package frequent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _36_ValidSudoku {

	public static boolean isValidSudoku(char[][] board) {

		HashMap<Integer, Integer>[] rows = new HashMap[9];
		HashMap<Integer, Integer>[] cols = new HashMap[9];
		HashMap<Integer, Integer>[] boxes = new HashMap[9]; // box index = (row/3)*3 + (col/3)*3

		for (int i = 0; i < 9; i++) {
			rows[i] = new HashMap<>();
			cols[i] = new HashMap<>();
			boxes[i] = new HashMap<>();
		}

		// rows
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				char value = board[i][j];

				if (value != '.') {
					int n = (int) value;

					rows[i].put(n, rows[i].getOrDefault(n, 0) + 1);

					if (rows[i].get(n) > 1) {
						System.out.println("return from rows");
						return false;
					}
				}
			}
		}

		// cols
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				char value = board[i][j];

				if (value != '.') {
					int n = (int) value;

					cols[j].put(n, cols[j].getOrDefault(n, 0) + 1);

					if (cols[j].get(n) > 1) {
						System.out.println("return from cols");
						System.out.println(cols[0].toString());
						return false;
					}
				}
			}
		}

		// boxes
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				char value = board[i][j];

				if (value != '.') {
					int n = (int) value;

					int box_index = (i / 3) * 3 + (j / 3) * 3;

					boxes[box_index].put(n, boxes[box_index].getOrDefault(n, 0) + 1);

					if (boxes[box_index].get(n) > 1) {
						System.out.println("return from boxes");
						return false;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		char[][] a = { { '8', '3', '.', '.', '7', '.', '.', '.', '.' }, { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
				{ '.', '9', '8', '.', '.', '.', '.', '6', '.' }, { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
				{ '4', '.', '.', '8', '.', '3', '.', '.', '1' }, { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
				{ '.', '6', '.', '.', '.', '.', '2', '8', '.' }, { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
				{ '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		boolean res = isValidSudoku(a);
		System.out.println(res);
	}

}
