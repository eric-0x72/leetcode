package math;

public class _50_Pow_x_n {

	/**
	 * brute force, TLE
	 */
	public double myPow_0(double x, int n) {
		long N = n;
		if (N < 0) {
			x = 1 / x;
			N = -N;
		}

		double res = 1;
		for (long i = 0; i < N; i++)
			res = res * x;
		return res;
	}

	/**
	 * fast power algorithm
	 */
	public double myPow_1(double x, int n) {
		long N = n;
		if (N < 0) {
			x = 1 / x;
			N = -N;
		}
		return fastPow(x, N);
	}

	double fastPow(double x, long n) {
		if (n == 0)
			return 1.0;

		// 7/2=3
		double half = fastPow(x, n / 2);

		if (n % 2 == 0)
			return half * half;
		else
			return half * half * x;
	}

}
