
class temp01 {

	public static String getRowKeyPrefix(String uid) {
		String rowKeyPrefixDelimiter = "|"; // rowKey与前缀的分隔符
		int value = Integer.parseInt(uid.substring(0, 8), 16);
		System.out.println(value);

		String prefix = String.format("%04d", Math.abs(value % 10000));
		System.out.println(prefix);

		// return Bytes.toBytes(prefix + rowKeyPrefixDelimiter);
		return prefix + rowKeyPrefixDelimiter + uid;
	}

	public static void main(String[] args) {
		String s = "5c0d0125f74a696652158b24";
		// String res = getRowKeyPrefix(s);
		// System.out.println(res);

		String st = "9917|5b98a33d47792e3f658b4711_58b7baad916edfa24cc285bb";
		System.out.println(st.substring(5, 29));
		System.out.println(st.substring(30));

	}

}
