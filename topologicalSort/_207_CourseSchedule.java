package topologicalSort;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class _207_CourseSchedule {

	public boolean canFinish(int total, int[][] prerequisites) {

		int[] V = new int[total]; // end
		List<Integer>[] U = new ArrayList[total]; // start

		// create space
		for (int i = 0; i < total; i++) {
			U[i] = new ArrayList<>();
		}

		for (int i = 0; i < prerequisites.length; i++) {
			// u1 : [v1, v2, ..., vk]
			// for every node, a list of nodes that depend on it
			U[prerequisites[i][1]].add(prerequisites[i][0]);

			// v's indgree ++
			// no. of nodes depend on i
			V[prerequisites[i][0]]++;
		}

		Queue<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < V.length; i++) {
			if (V[i] == 0)
				q.offer(i);
		}

		int count = 0;
		while (!q.isEmpty()) {
			int cur = q.poll();

			// add n to tail of sorted elements
			count++;

			int affects = U[cur].size();
			// for all nodes that depend on cur
			for (int i = 0; i < affects; i++) {
				int pointer = U[cur].get(i);

				// remove edge coming from cur, node pointer's indegree
				V[pointer]--;

				if (V[pointer] == 0)
					q.add(pointer);
			}
		}

		// check if all nodes are sorted
		return count == total;
	}

}
