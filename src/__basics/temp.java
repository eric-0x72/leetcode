package __basics;

public class temp {
	public int findTheDistanceValue(int[] a, int[] b, int d) {
		int ret = a.length;
		outer: for (int v : a) {
			for (int w : b) {
				if (Math.abs(v - w) <= d) {
					ret--;
					continue outer;
				}
			}
		}
		return ret;
	}
}
