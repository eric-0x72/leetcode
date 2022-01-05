// package contest;
//
// import java.util.Arrays;
// import java.util.PriorityQueue;
//
// public class _1383_MaximumPerfoRrmanceOfTeam {
//
// 	public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
// 		int arr[][] = new int[n][2];
// 		for (int i = 0; i < n; i++) {
// 			arr[i] = new int[] { efficiency[i], speed[i] };
// 		}
//
// 		// sort by efficiency, descending order!!
// 		Arrays.sort(arr, (a, b) -> b[0] - a[0]);
//
// 		// priority queue to store speed
// 		PriorityQueue<Integer> q = new PriorityQueue<>(k, (a, b) -> a - b);
//
// 		long max = 0;
// 		long sumSpeed = 0;
//
// 		for (int[] es : arr) { // efficiency and speed of engineer
// 			q.add(es[1]); // add speed to queue
// 			sumSpeed += es[1];
//
// 			if (q.size() > k)
// 				sumSpeed -= q.poll();
//
// 			long temp = sumSpeed * es[0];
// 			max = Math.max(max, temp);
// 		}
// 		return (int) (max %);
// 	}
//
// }
