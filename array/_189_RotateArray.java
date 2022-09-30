package array;

public class _189_RotateArray {

	public void rotate(int[] nums, int k) {
		int n = nums.length;
		k %= n;

		int[] temp = new int[n];

		for (int i = 0; i < n; i++) {
			temp[(i + k) % n] = nums[i];
		}

		for (int i = 0; i < n; i++) {
			nums[i] = temp[i];
		}
	}

	// learnt from discussion zone
	public void rotate_2(int[] nums, int k) {
		int n = nums.length;

		reverse(nums, 0, n); // reverse whole array
		reverse(nums, 0, k - 1); // reverse left side
		reverse(nums, k, n); // reverse right side
	}

	private void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];

			// swap
			nums[start] = nums[end];
			nums[end] = temp;

			start++;
			end--;
		}
	}

}
