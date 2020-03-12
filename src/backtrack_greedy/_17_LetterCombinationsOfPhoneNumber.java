package backtrack_greedy;

import java.util.ArrayList;
import java.util.List;

public class _17_LetterCombinationsOfPhoneNumber {

	private static String map[] = { " ", // 0
			"", // 1
			"abc", // 2
			"def", // 3
			"ghi", // 4
			"jkl", // 5
			"mno", // 6
			"pqrs", // 7
			"tuv", // 8
			"wxyz" // 9
	};

	private static ArrayList<String> res;

	public static List<String> letterCombinations(String digits) {

		res = new ArrayList<>();

		if (digits.equals(""))
			return res;

		backtrack(digits, 0, "");
		return res;
	}

	// s�б����˴�ʱ��digits[0 ... index-1]����õ���
	// ��ε�����Ѱ��digits[index]ƥ�����ĸ�����digits[0...index]������s��
	private static void backtrack(String digits, int index, String s) {

		if (index == digits.length()) { // �ݹ����ֹ���������index������
			res.add(s);
			// System.out.println(s);
			return;
		}

		Character c = digits.charAt(index); // c��Ҫ���������
		String letters = map[c - '0']; // letters��c��Ӧ����ĸ��

		// ѭ������letters, �ݹ����helper��ÿ�ζ�����index+1�����ҰѴ�s������ε�letter
		for (int i = 0; i < letters.length(); i++)
			backtrack(digits, index + 1, s + letters.charAt(i)); // ���Һ�һλindex+1, ͬʱ����λ�Ľ������s
	}

	public static void main(String[] args) {

		List<String> res = letterCombinations("23");
		System.out.println(res.toString());
	}
}
