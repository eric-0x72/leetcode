package contest;

public class _187b_CheckIfAll1sAreAtLeastLengthKPlacesAway {

	public static boolean kLengthApart(int[] nums, int k) {
		int cum = 100000;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				cum++;
			} else {

				System.out.println(cum);
				if (cum < k) {
					return false;
				}
				cum = 0;
			}
			System.out.println(cum);
		}
		return true;
	}

	public static void main(String[] args) {
		int a[] = { 1, 0, 0, 1, 0, 1 };
		boolean res = kLengthApart(a, 2);
		System.out.println(res);
	}

}
