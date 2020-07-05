package contest;

public class __MinJump {

	public int minJump(int[] jump) {
		int n = jump.length;

		int[][] dp = new int[n][n];

		for (int bound = 0; bound < n; bound++) {
			dp[0][bound] = jump[bound] > bound ? 1 : Integer.MAX_VALUE;
		}

		for (int end = 1; end < n; end++) {
			for (int bound = end; bound < n; bound++) {
				
				int left = Integer.MAX_VALUE;
				int min = Integer.MAX_VALUE;
				for (int i = 0; i < bound; i++) {
					sda = Math.min(min, dp[end][bound]) + 1;
				}
				
			}
		}

	}

}
