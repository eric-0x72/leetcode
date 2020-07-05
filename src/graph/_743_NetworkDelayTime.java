package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class _743_NetworkDelayTime {

	public int networkDelayTime(int[][] times, int N, int K) {

		// from : [to, weight]
		Map<Integer, List<int[]>> G = new HashMap<>();

		// for each node, add edge outgoing from this node
		// edge contains other node and weight
		for (int[] edge : times) {
			// edge: [start, end, weight]
			if (!G.containsKey(edge[0])) {
				G.put(edge[0], new ArrayList<int[]>());
			}
			// add other node and weight
			G.get(edge[0]).add(new int[] { edge[1], edge[2] });
		}

		// pq, sort by dist to origin
		PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] - b[0]);
		q.offer(new int[] { 0, K }); // shortest dist, source node

		// map stores dist result
		// [node, shortest dist confirmed]
		Map<Integer, Integer> map = new HashMap<>();

		while (!q.isEmpty()) {
			// info is the shortest dist of them, thus cannot relax
			// therefore its shortest dist is confirmed
			int[] info = q.poll();
			int d = info[0], node = info[1]; // distance, node

			// if node's shortest dist is confirmed
			if (map.containsKey(node))
				continue;

			map.put(node, d);

			// do relaxation on node
			if (G.containsKey(node)) { // if node has outgoing edges
				// node->i
				for (int[] i : G.get(node)) {
					int nei = i[0], weight = i[1]; // toNode, weight
					if (!map.containsKey(nei))
						q.offer(new int[] { d + weight, nei });
				}
			}
		} // end while

		if (map.size() != N)
			return -1;

		int res = 0;
		for (int cand : map.values()) {
			res = Math.max(res, cand);
		}
		return res;
	}

	public static void main(String[] args) {

	}
}
