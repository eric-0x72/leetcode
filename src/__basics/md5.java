package __basics;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.*;

//https://www.cnblogs.com/zhuyeshen/p/11424713.html
public class md5 {

	/**
	 * https://www.cnblogs.com/zhuyeshen/p/11424713.html
	 */
	public static String stringToMD5(String plainText) {
		byte[] secretBytes = null;
		try {
			secretBytes = MessageDigest.getInstance("md5").digest(plainText.getBytes());
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("没有这个md5算法！");
		}

		String md5code = new BigInteger(1, secretBytes).toString(16);
		for (int i = 0; i < 32 - md5code.length(); i++) {
			md5code = "0" + md5code;
		}
		return md5code;
	}

	public static String getcode(String s) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		byte[] bytesOfMessage = s.getBytes("UTF-8");
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] thedigest = md.digest(bytesOfMessage);

		return thedigest.toString();
	}

	public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		String res1 = stringToMD5("864454030630234");
		String res2 = stringToMD5("864454030630226");
		System.out.println(res1 + " " + res2);

//		String res = getcode("864454030630234");
//		System.out.println(res);
	}
}
