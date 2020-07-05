import java.util.Arrays;

public class temp01 {

	public static void main(String[] args) {
		int[] count = { 1, 2, 3 };

		for (int i = 0; i < 3; count[i++] += 10)
			;

		System.out.println(Arrays.toString(count));
	}

}
