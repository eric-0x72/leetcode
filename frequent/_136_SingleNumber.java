package frequent;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class _136_SingleNumber {

	public int singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			if (!map.containsKey(num))
				map.put(num, 1);
			else
				map.put(num, map.get(num) + 1);
		}

		for (int i : map.keySet()) {
			if (map.get(i) == 1)
				return i;
		}
		return -1;
	}

	public static int singleNumber2(int[] nums) {
		int res = 0;
		for (int i : nums)
			res = res ^ i;
		return res;
	}

	public static void main(String[] args) {
		int[] a = { 2, 2, 1, 1, 1977 };
		int res = singleNumber2(a);

		System.out.println(res);
	}
}
