package __basics;

/**
 *
 * If you define a method to be static, you will be given a rude message by the
 * compiler if you try to access any instance variables. You can access static
 * variables, but except for constants, this is unusual.
 * 
 * Static methods typically take all they data from parameters and compute
 * something from those parameters, with no reference to variables. This is
 * typical of methods which do some kind of generic calculation.
 * 
 * Although a static method can't access instance variables, it can access
 * static variables. A common use of static variables is to define "constants".
 * 
 * 
 * 
 * 
 */
public class StaticMethod {

	private int a = 8;
	private String instanceString = "instance string ";

	public static int staticmethod(int a) {
		int var1 = 12;
		int var2 = 34;
		int res = var1 + a;
		System.out.println(instanceString);

		return res;
	}

	public static void main(String[] args) {

	}

}
