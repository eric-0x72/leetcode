package array;

import java.util.HashMap;

public class _136_SingleNumber {

	/**
	 * bit manipulation
	 * 
	 * a xor 0 = a, retains the original number
	 * 
	 * a xor a = 0, this makes even appearance cancel out
	 * 
	 * 
	 * 
	 */
	public int singleNumber_1(int[] nums) {
		int res = 0;
		for (int a : nums) {
			res ^= a;
		}
		return res;
	}

	/**
	 * hash map
	 * 
	 */
	public int singleNumber_2(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int a : nums) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}

		for (Integer a : map.keySet()) {
			if (map.get(a) == 1)
				return a;
		}
		return -1;
	}

	public static void main(String[] args) {

	}

}
