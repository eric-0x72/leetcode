package lcOffer;

public class _58_ReverseLeftWords {

	public String reverseLeftWords(String s, int n) {

		// 0,1,2,3,4,5
		// n = 2
		// output is then: 2,3,4,5, 0,1
		//

		String res = "";
		res = s.substring(n, s.length()); // n to last
		res += s.substring(0, n); // 1 to n-1

		return res;

	}
}
