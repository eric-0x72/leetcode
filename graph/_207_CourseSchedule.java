// package graph;
//
// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.LinkedList;
// import java.util.List;
//
// public class _207_CourseSchedule {
//
// 	private boolean isCyclic(Integer curr, HashMap<Integer, List<Integer>> map, boolean[] path) {
//
// 	}
//
// 	public boolean canFinish(int numCourses, int[][] prerequisites) {
//
// 		// course -> list of course that depends on this one
// 		HashMap<Integer, List<Integer>> map = new HashMap<>();
//
// 		for (int[] pair : prerequisites) {
// 			// relation[0] depends on relation[1]
// 			if (map.containsKey(pair[0])) {
// 				map.get(pair[1]).add(pair[0]);
// 			} else {
// 				List<Integer> temp = new LinkedList<>();
// 				temp.add(pair[0]);
// 				map.put(pair[1], temp);
// 			}
// 		}
//
// 		boolean[] path = new boolean[numCourses];
//
// 	}
//
// 	public static void main(String[] args) {
// 		boolean[] a = new boolean[12];
// 		System.out.println(Arrays.toString(a));
// 	}
// }
