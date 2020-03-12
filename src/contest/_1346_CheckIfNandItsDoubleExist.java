package contest;

import java.util.HashSet;

public class _1346_CheckIfNandItsDoubleExist {

	public static boolean checkIfExist(int[] arr) {

		HashSet<Integer> set = new HashSet<>();

		for (int n : arr) {

			if ((n % 2 == 0 && set.contains(n / 2)) || set.contains(n * 2)) {
				return true;
			}
			set.add(n); // ���ں����set��ԭ���ǣ������0�Ļ�����ǰ������ˣ�����if�жϻ�����⣬��Ϊ0/2==0������return true�ˣ�����
		}
		return false;
	}

	public static void main(String[] args) {

		int arr[] = { 3, 7, 14 };
		boolean res = checkIfExist(arr);
		System.out.println(res);
	}
}
