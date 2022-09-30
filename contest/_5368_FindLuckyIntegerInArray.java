package contest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class _5368_FindLuckyIntegerInArray {

	static HashMap<Integer, Integer> map = new HashMap<>();

	public static int findLucky(int[] arr) {
		for (int e : arr) {
			int count = map.getOrDefault(e, 0);
			map.put(e, count + 1);
		}

		int res = -1;
		for (int e : map.keySet())
			if (e == map.get(e))
				res = Math.max(res, e);
		
		return res;
	}

	public static int findLucky2(int[] arr) {
		int[] count = new int[501];

		for (int a : arr) {
			count[a]++;
		}
		for (int i = 0; i < 500; i++) {
			if (count[i] == i)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 2, 2, 2, 3, 3, 7 };
		int res = findLucky(a);
		System.out.println(res);
	}

}
