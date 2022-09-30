package graph_bobo;

import java.util.*;
import java.lang.*;

// ��С������
public class IndexMinHeap<Item extends Comparable> {

	protected Item[] data; // ��С�������е�����
	protected int[] indexes; // ��С�������е�����, indexes[x] = i ��ʾ����i��x��λ��
	protected int[] reverse; // ��С�������еķ�������, reverse[i] = x ��ʾ����i��x��λ��
	protected int count;
	protected int capacity;

	// ���캯��, ����һ���ն�, ������capacity��Ԫ��
	public IndexMinHeap(int capacity) {
		data = (Item[]) new Comparable[capacity + 1];
		indexes = new int[capacity + 1];
		reverse = new int[capacity + 1];
		for (int i = 0; i <= capacity; i++)
			reverse[i] = 0;

		count = 0;
		this.capacity = capacity;
	}

	// �����������е�Ԫ�ظ���
	public int size() {
		return count;
	}

	// ����һ������ֵ, ��ʾ���������Ƿ�Ϊ��
	public boolean isEmpty() {
		return count == 0;
	}

	// ����С�������в���һ���µ�Ԫ��, ��Ԫ�ص�����Ϊi, Ԫ��Ϊitem
	// �����i���û�����,�Ǵ�0������
	public void insert(int i, Item item) {

		assert count + 1 <= capacity;
		assert i + 1 >= 1 && i + 1 <= capacity;

		// �ٲ���һ����Ԫ��ǰ,����Ҫ��֤����i���ڵ�λ����û��Ԫ�ص�
		assert !contain(i);

		i += 1;
		data[i] = item;
		indexes[count + 1] = i;
		reverse[i] = count + 1;
		count++;

		shiftUp(count);
	}

	// ����С��������ȡ���Ѷ�Ԫ��, �������������洢����С����
	public Item extractMin() {
		assert count > 0;

		Item ret = data[indexes[1]];
		swapIndexes(1, count);
		reverse[indexes[count]] = 0;
		count--;
		shiftDown(1);

		return ret;
	}

	// ����С��������ȡ���Ѷ�Ԫ�ص�����
	public int extractMinIndex() {
		assert count > 0;

		int ret = indexes[1] - 1;
		swapIndexes(1, count);
		reverse[indexes[count]] = 0;
		count--;
		shiftDown(1);

		return ret;
	}

	// ��ȡ��С�������еĶѶ�Ԫ��
	public Item getMin() {
		assert count > 0;
		return data[indexes[1]];
	}

	// ��ȡ��С�������еĶѶ�Ԫ�ص�����
	public int getMinIndex() {
		assert count > 0;
		return indexes[1] - 1;
	}

	// ������i���ڵ�λ���Ƿ����Ԫ��
	boolean contain(int i) {
		assert i + 1 >= 1 && i + 1 <= capacity;
		return reverse[i + 1] != 0;
	}

	// ��ȡ��С������������Ϊi��Ԫ��
	public Item getItem(int i) {
		assert contain(i);
		return data[i + 1];
	}

	// ����С������������Ϊi��Ԫ���޸�ΪnewItem
	public void change(int i, Item newItem) {

		assert contain(i);

		i += 1;
		data[i] = newItem;

		// ���� reverse ֮��,
		// ���ǿ��Էǳ��򵥵�ͨ��reverseֱ�Ӷ�λ����i��indexes�е�λ��
		shiftUp(reverse[i]);
		shiftDown(reverse[i]);
	}

	// �����������е�����i��j
	// �������˷�������reverse���飬
	// indexes���鷢���ı��Ժ� ��Ӧ�ľ���Ҫά��reverse����
	private void swapIndexes(int i, int j) {
		int t = indexes[i];
		indexes[i] = indexes[j];
		indexes[j] = t;

		reverse[indexes[i]] = i;
		reverse[indexes[j]] = j;
	}

	// ********************
	// * ��С�����Ѻ��ĸ�������
	// ********************

	// ��������, ����֮��ıȽϸ���data�Ĵ�С���бȽ�, ��ʵ�ʲ�����������
	private void shiftUp(int k) {

		while (k > 1 && data[indexes[k / 2]].compareTo(data[indexes[k]]) > 0) {
			swapIndexes(k, k / 2);
			k /= 2;
		}
	}

	// ��������, ����֮��ıȽϸ���data�Ĵ�С���бȽ�, ��ʵ�ʲ�����������
	private void shiftDown(int k) {

		while (2 * k <= count) {
			int j = 2 * k;
			if (j + 1 <= count && data[indexes[j + 1]].compareTo(data[indexes[j]]) < 0)
				j++;

			if (data[indexes[k]].compareTo(data[indexes[j]]) <= 0)
				break;

			swapIndexes(k, j);
			k = j;
		}
	}

	// ���� IndexMinHeap
	public static void main(String[] args) {

		int N = 1000000;

		System.out.println("starting...");
		IndexMinHeap<Integer> indexMinHeap = new IndexMinHeap<Integer>(N);
		for (int i = 0; i < N; i++) {
			indexMinHeap.insert(i, (int) (Math.random() * N));
		}
		System.out.println("end");
	}
}