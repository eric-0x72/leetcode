package __basics;

public class stringbuilder {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("mystring"); // sb.length() == 8
		System.out.println(sb.length());
		System.out.println(sb.deleteCharAt(7)); // 0-7 gives length 8

	}
}
