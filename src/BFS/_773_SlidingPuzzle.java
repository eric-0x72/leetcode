// package bfs;
//
// import java.util.HashSet;
// import java.util.LinkedList;
// import java.util.Queue;
//
// public class _773_SlidingPuzzle {
//
// 	public static int slidingPuzzle(int[][] board) {
// 		String target = "123450";
// 		String start = "";
//
// 		for (int i = 0; i < board.length; i++) {
// 			for (int j = 0; j < board[0].length; j++) {
// 				start += board[i][j];
// 			}
// 		}
//
// 		HashSet<String> visited = new HashSet<>();
// 		int[][] d = new int[][] { { 1, 3 }, { 0, 2, 4 }, { 1, 5 }, { 0, 4 }, { 1, 3, 5 }, { 2, 4 } };
//
// 		Queue<String> q = new LinkedList<>();
// 		q.offer(start);
// 		visited.add(start);
//
// 		int res = 0;
// 		while (!q.isEmpty()) {
// 			int size = q.size();
// 			for (int i = 0; i < size; i++) {
// 				String cur = q.poll();
// 				if (cur.equals(target))
// 					return res;
//
// 				int zero = cur.indexOf('0');
//
// 				for (int direction : d[zero]) {
// 					String next = swap(cur, zero, direction);
//
// 					if (visited.contains(next))
// 						continue;
//
// 					visited.add(next);
// 					q.offer(next);
// 				}
// 				res++;
// 			}
// 			return -1;
// 		}
//
// 		return 0;
// 	}
//
// 	private static String swap(String cur, int zero, int direction) {
//
// 	}
//
// 	public static void main(String[] args) {
// 		int[][] a = { { 1, 2, 3 }, { 4, 0, 5 } };
// 		slidingPuzzle(a);
// 	}
//
// }
