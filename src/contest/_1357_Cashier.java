package contest;

import java.util.HashMap;
import java.util.HashSet;

public class _1357_Cashier {

	private int n;
	private int discount;
	private int[] products;
	private int[] prices;
	private int count;

	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	public _1357_Cashier(int n, int discount, int[] products, int[] prices) {
		this.n = n;
		this.discount = discount;
		this.products = products;
		this.prices = prices;
		count = 0;

		for (int i = 0; i < products.length; i++) {
			map.put(products[i], prices[i]);
		}
	}

	public double getBill(int[] product, int[] amount) {
		count++;
		double res = 0.0;

		for (int i = 0; i < product.length; i++) { // product id
			res += map.get(product[i]) * amount[i];
		}

		if (count == n) {
			res = res - res * discount / 100;
			count = 0;
		}
		return res;
	}

	public static void main(String[] args) {

		_1357_Cashier a = new _1357_Cashier(5, 50, new int[] { 1, 2, 3 }, new int[] { 100, 200, 300 });
		double res = a.getBill(new int[] { 2, 3 }, new int[] { 5, 7 });

		System.out.println(res);
	}
}
