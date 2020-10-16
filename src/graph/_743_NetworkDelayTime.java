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
		Map<Integer, List<int[]>> g = new HashMap<>();

		// for each node, add edge outgoing from this node
		// edge contains other node and weight
		for (int[] edge : times) {
			// edge: [start, end, weight]
			if (!g.containsKey(edge[0])) {
				g.put(edge[0], new ArrayList<int[]>());
			}
			// add other node and weight
			g.get(edge[0]).add(new int[] { edge[1], edge[2] });
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
			int d = info[0], u = info[1]; // distance, node

			// if node's shortest dist is confirmed
			if (map.containsKey(u))
				continue;

			map.put(u, d); // add u to result map, shortest dist found

			// do relaxation on u's neighbours
			if (g.containsKey(u)) { // if u has outgoing edges
				// u -> v ; v is u's neighbour
				for (int[] v : g.get(u)) {
					int vid = v[0], weight = v[1]; // v node, weight
					if (!map.containsKey(vid))
						q.offer(new int[] { d + weight, vid });
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
