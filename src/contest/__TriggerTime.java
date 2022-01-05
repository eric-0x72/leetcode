// package contest;
//
// import java.util.Arrays;
// import java.util.HashMap;
//
// public class __TriggerTime {
//
// 	// requirements are trigger for scenarios
// 	// return the time for each scenario
// 	// TLE
// 	public int[] getTriggerTime_1(int[][] increase, int[][] requirements) {
//
// 		int C = 0;
// 		int R = 0;
// 		int H = 0;
// 		int[] res = new int[requirements.length];
//
// 		HashMap<Integer, Integer> map = new HashMap<>();
//
// 		// day i
// 		for (int i = 0; i < increase.length; i++) {
// 			C += increase[i][0];
// 			R += increase[i][1];
// 			H += increase[i][2];
//
// 			// for every scenario j
// 			// check if requirements are met
// 			for (int j = 0; j < requirements.length; j++) {
// 				int c = requirements[j][0];
// 				int r = requirements[j][1];
// 				int h = requirements[j][2];
//
// 				if (c == 0 && r == 0 && h == 0) {
// 					map.putIfAbsent(j, 0);
// 				}
//
// 				// if all conditions are met
// 				if (C >= c && R >= r && H >= h) {
// 					map.putIfAbsent(j, i + 1);
// 				}
// 			}
// 		}
//
// 		for (int i = 0; i < res.length; i++) {
// 			res[i] = map.containsKey(i) ? map.get(i) : -1;
// 		}
// 		return res;
// 	}
//
// 	public int[] getTriggerTime_2(int[][] increase, int[][] requirements) {
//
// 	}
//
// }
