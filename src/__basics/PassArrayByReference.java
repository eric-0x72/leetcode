package __basics;

import java.util.Arrays;

public class PassArrayByReference {

	/**
	 * pass nums by reference, aka a pointer to the array
	 * 
	 * any modifications will also affect the original nums
	 */
	private static void modify(int[] nums) {
		nums[0] = 999;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, };
		modify(a);
		System.out.println(Arrays.toString(a));
	}

}
