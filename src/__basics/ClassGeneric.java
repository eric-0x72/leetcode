package __basics;

/**
 * @author zwb
 *
 * @param <T> : generic type of parameter to be passed in when creating the
 *        class
 * 
 * 
 */
public class ClassGeneric<T> {

	private T var1;

	public ClassGeneric(T _var1) {
		var1 = _var1;
	}

	public T getvar1() {
		return var1;
	}

	public static void main(String[] args) {

		ClassGeneric<String> a = new ClassGeneric<>("hello world");
		String res = a.getvar1();
		System.out.println(res);
	}
}
