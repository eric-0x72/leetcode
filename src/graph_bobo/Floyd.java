package graph_bobo;

import java.util.Arrays;

// https://www.geeksforgeeks.org/floyd-warshall-algorithm-dp-16/
public class Floyd {

	final static int INF = 99999, V = 4;

	public static void floydWarshall(int graph[][]) {
		int dp[][] = new int[V][V];

		for (int i = 0; i < V; i++)
			for (int j = 0; j < V; j++)
				dp[i][j] = graph[i][j];

		for (int k = 0; k < V; k++) {
			for (int i = 0; i < V; i++) {
				for (int j = 0; j < V; j++) {
					dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
				}
			}
		}
		System.out.println(Arrays.deepToString(dp));
	}

	public static void main(String[] args) {

		int graph[][] = { { 0, 5, INF, 10 }, { INF, 0, 3, INF }, { INF, INF, 0, 1 }, { INF, INF, INF, 0 } };
		floydWarshall(graph);
	}
}
