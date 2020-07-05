package array;

public class _31_NextPermutation {

	private void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	public void nextPermutation(int[] A) {
		int i = A.length - 2;

		while (i >= 0 && A[i] >= A[i + 1])
			i--;
		
		
	}
}
