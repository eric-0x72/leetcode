package frequent;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class _994_RottingOranges {

	private int[][] d = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };

	public int orangesRotting(int[][] grid) {

		int rows = grid.length;
		int cols = grid[0].length;

		Queue<Integer> q = new LinkedList<>();
		Map<Integer, Integer> depth = new HashMap<>();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				if (grid[i][j] == 2) {
					int code = i * cols + j;
					q.add(code);
					depth.put(code, 0);
				}
				// todo
			}
		}
		return 0 ;
	}

	private void bfs(int x, int y) {

//		for (int i = 0; i < 4; i++) {
//			int newx = x + d[i][0];
//			int newy = y + d[i][1];
//
//			if(inArea(x, y ) && )
//
//		}

	}
}
