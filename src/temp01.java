import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class temp01 {

	private static int function(int a, int b, int[] c) {
		int sum = 0;

		for (int i : c) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('c' , 12);
		map.put('b' , 1);
		
		map.remove('c');
		System.out.println(map);
		
	}

}
