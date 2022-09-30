package contest;

public class _184c_HTMLEntityParse {

	public static String entityParser(String text) {
		text = text.replaceAll("&quot;", "\"");
		text = text.replaceAll("&apos;", "'");
		text = text.replaceAll("&amp;", "&");
		text = text.replaceAll("&gt;", ">");
		text = text.replaceAll("&lt;", "<");
		text = text.replaceAll("&frasl;", "/");
		return text;
	}

	public static void main(String[] args) {
		String a = "and I quote: &quot;...&quot;";
		String res = entityParser(a);
		System.out.println(res);
	}
}
