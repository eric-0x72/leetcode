package frequent;

import java.util.ArrayList;
import java.util.List;

public class _17_LetterCombinationsOfPhoneNumber {

	private static String[] map = { " ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	// private static List<String> res;

	public static List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<>();

		res = new ArrayList<>(); // ��ʼ��������

		if (digits.equals(""))
			return res;

		backtrack(res, digits, 0, "");
		return res;
	}

	// ���ݣ���ǰ���indexλ�õ�����char
	private static void backtrack(List<String> res, String digits, int index, String cur) {

		if (index == digits.length()) { // ���ݽ���������ռ���һ����?
			res.add(cur);
			return;
		}

		Character ch = digits.charAt(index);
		String letters = map[ch - '0']; // ch���ִ������ĸ����letters

		for (int i = 0; i < letters.length(); i++)
			backtrack(res, digits, index + 1, cur + letters.charAt(i));
	}

	public static void main(String[] args) {

		List<String> res = letterCombinations("23");
		System.out.println(res);
	}

}
