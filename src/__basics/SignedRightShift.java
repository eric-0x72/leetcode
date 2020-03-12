package __basics;

public class SignedRightShift {

	public static void main(String[] args) {
		int a = -60;
		int b = 60;
		System.out.println("a = " + Integer.toBinaryString(a));
		System.out.println("b = " + Integer.toBinaryString(b));

		// signed right shift:
		// if positive, fill left position with 0
		// if negative, fill left position with 1
		System.out.println("a >> 1, gives " + Integer.toBinaryString(a >> 1) + ", " + (a >> 1));
		System.out.println("b >> 1, gives " + Integer.toBinaryString(b >> 1) + ", " + (b >> 1));

		// now, for unsigned right shift,
		// both fill left positions with 0
		System.out.println("a >>> 1, gives " + Integer.toBinaryString(a >>> 1) + ", " + (a >>> 1));
		System.out.println("b >>> 1, gives " + Integer.toBinaryString(b >>> 1) + ", " + (b >>> 1));

	}
}
