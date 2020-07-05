package binarySearch;

import java.util.Arrays;

public class _4_MedianOfTwoSortedArrays {

	// merge 2 arrays
	// time: O(m+n)
	public static double findMedianSortedArrays_0(int[] A, int[] B) {
		int p1 = 0, p2 = 0;
		int len1 = A.length, len2 = B.length;
		int len = len1 + len2;
		int[] merged = new int[len];

		int i = 0;
		while (p1 < len1 && p2 < len2) {
			if (A[p1] <= B[p2]) {
				merged[i++] = A[p1++];
			} else {
				merged[i++] = B[p2++];
			}
			// merged[i++] = A[p1]<B[p2] ? A[p1++] : B[p2++];
		}

		while (p1 <= len1 - 1) {
			merged[i++] = A[p1++];
		}
		while (p2 <= len2 - 1) {
			merged[i++] = B[p2++];
		}

		return len % 2 == 0 ? (merged[len / 2] + merged[len / 2 + 1]) / 2 : merged[len / 2];
	}

	// binary search
	public static double findMedianSortedArrays_1(int[] a, int[] b) {
		int lenA = a.length, lenB = b.length;

		if (lenA > lenB)
			return findMedianSortedArrays_1(b, a);

		if (lenA == 0)
			return (double) (b[lenB] / 2 + b[lenB / 2 - 1]) / 2;

		int len = lenA + lenB;
		int l = 0, r = lenA;

		int cutA, cutB; // contribution
		while (l <= r) {
			cutA = (l + r) / 2;
			cutB = (len + 1) / 2 - cutA; // len+1 why?

			double l1 = (cutA == 0) ? Integer.MIN_VALUE : a[cutA - 1];
			double l2 = (cutB == 0) ? Integer.MIN_VALUE : b[cutB - 1];

			double r1 = (cutA == lenA) ? Integer.MAX_VALUE : a[cutA];
			double r2 = (cutB == lenB) ? Integer.MAX_VALUE : b[cutB];

			if (l1 > r2) {
				r = cutA - 1;
			} else if (l2 > r1) {
				l = cutA + 1;
			} else {
				if (len % 2 == 0) {
					return (Math.max(l1, l2) + Math.min(r1, r2)) / 2;
				} else {
					return Math.max(l1, l2);
				}
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println((double) 5 / 2);

		// double res = findMedianSortedArrays(a, b);
		// System.out.println(res);
	}

}
