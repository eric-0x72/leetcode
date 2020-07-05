package unionFind;

import java.util.HashMap;

public class __UnionFind {

	private int[] id; // 0,1,2,3,4,5
	private int count;

	public __UnionFind(int n) {
		count = n;
		id = new int[n];
		for (int i = 0; i < n; i++) {
			id[i] = i; // id[i] is the father of i, now point to itself
		}
	}

	private int find(int p) {
		return id[p];
	}

	boolean isConnected(int p, int q) {
		return find(p) == find(q);
	}

	void unionElements(int p, int q) {
		int pGroup = find(p);
		int qGroup = find(q);

		if (pGroup == qGroup)
			return;

		for (int i = 0; i < count; i++) {
			if (id[i] == pGroup)
				id[i] = qGroup;
		}
	}

	public static void main(String[] args) {

	}
}
