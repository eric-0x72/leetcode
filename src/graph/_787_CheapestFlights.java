package graph;

import java.util.PriorityQueue;

public class _787_CheapestFlights {
	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
		int[][] graph = new int[n][n];
		for (int[] flight : flights) {
			graph[flight[0]][flight[1]] = flight[2]; // grpah[from][to] = distance
		}

		PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] - b[0]);
		q.offer(new int[] { 0, src, K + 1 }); // price, place, num of steps left

		while (!q.isEmpty()) {

			// poll from queue
			// cost reaching this place is min, so cannot relax from elsewhere
			int[] cur = q.poll();
			int price = cur[0], u = cur[1], remainStop = cur[2];

			if (u == dst)
				return price;

			if (remainStop > 0) {
				for (int v = 0; v < n; v++) {
					// u -> v
					if (graph[u][v] > 0) { // if exist flight
						q.offer(new int[] { price + graph[u][v], v, remainStop - 1 });
					}
				}
			}
		} // end while

		return -1;
	}

	public static void main(String[] args) {
		
	}
}
