package contest;

public class __CoinCount {

	public int minCount(int[] coins) {

		int res = 0;
		for (int coin : coins) {
			res += (int) Math.ceil((double) coin / 2);
		}
		return res;
	}
}
