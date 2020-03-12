package __basics;

import java.util.Hashtable;

public class XOR {

	public static void xor() {
		// XOR: ����෴�Ļ����õ�1
		// ~: NOT
		// &: AND

		int num8 = 8; // 1000
		int num11 = 11; // 1011
		// �õ�����0010 = 3

		int res = 8 ^ 11;
		System.out.println(res);

		// ----------------------
		int base = 0;
		int a = 1077;
		int res1 = 0 ^ a; // xorһ�εõ��Ǹ�������
		int res2 = 0 ^ a ^ a; // xor���εõ��㣡��
		System.out.println("res 1 = " + res1 + ", res 2 = " + res2);
	}

	public static void main(String[] args) {

		xor();
	}

}
