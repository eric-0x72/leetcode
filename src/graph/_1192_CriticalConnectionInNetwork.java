package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1192_CriticalConnectionInNetwork {

	public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {

		int[] id = new int[n], low = new int[n];

		// use adjacency list instead of matrix will save some memory
		List<Integer>[] graph = new ArrayList[n];
		List<List<Integer>> res = new ArrayList<>();

		Arrays.fill(id, -1); // use disc to track if visited (disc[i] == -1)
		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<>();
		}

		// build graph
		for (int i = 0; i < connections.size(); i++) {
			int from = connections.get(i).get(0);
			int to = connections.get(i).get(1);
			graph[from].add(to);
			graph[to].add(from);
		}

		dfs(0, low, id, graph, res, 0);

		return res;
	}

	int time = 0; // time when discover each vertex

	private void dfs(int u, int[] low, int[] id, List<Integer>[] graph, List<List<Integer>> res, int pre) {
		// assign id == low link value
		id[u] = low[u] = time++; // discover u

		// visit u's neighbor v
		for (int v : graph[u]) {
			if (v == pre) {
				continue; // if parent vertex, ignore
			}

			// if v is not discovered
			if (id[v] == -1) {
				dfs(v, low, id, graph, res, u); // visit v
				low[u] = Math.min(low[u], low[v]); // on callback, update low[u]

				if (low[v] > id[u]) {
					// u-v is critical, there is no path for v to reach back to u or previous
					// vertices of u (no loop existed)
					res.add(Arrays.asList(u, v));
				}
			}

			// if v discovered and is not parent of u, update low[u], cannot use low[v]
			// because u is not subtree of v
			else {
				low[u] = Math.min(low[u], id[v]); // update low[u]
			}
		} // end for loop
	}
}
