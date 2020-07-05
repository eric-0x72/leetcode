package graph_bobo;

import java.util.*;
import java.lang.*;

// �ڶѵ��йز����У���Ҫ�Ƚ϶���Ԫ�صĴ�С������Item��Ҫextends Comparable
public class MinHeap<Item extends Comparable> {

	protected Item[] data;
	protected int count;
	protected int capacity;

	// ���캯��, ����һ���ն�, ������capacity��Ԫ��
	public MinHeap(int capacity) {
		data = (Item[]) new Comparable[capacity + 1];
		count = 0;
		this.capacity = capacity;
	}

	// ���캯��, ͨ��һ���������鴴��һ����С��
	// �ù���ѵĹ���, ʱ�临�Ӷ�ΪO(n)
	public MinHeap(Item arr[]) {

		int n = arr.length;

		data = (Item[]) new Comparable[n + 1];
		capacity = n;

		for (int i = 0; i < n; i++)
			data[i + 1] = arr[i];
		count = n;

		for (int i = count / 2; i >= 1; i--)
			shiftDown(i);
	}

	// ���ض��е�Ԫ�ظ���
	public int size() {
		return count;
	}

	// ����һ������ֵ, ��ʾ�����Ƿ�Ϊ��
	public boolean isEmpty() {
		return count == 0;
	}

	// ����С���в���һ���µ�Ԫ�� item
	public void insert(Item item) {

		assert count + 1 <= capacity;
		data[count + 1] = item;
		count++;
		shiftUp(count);
	}

	// ����С����ȡ���Ѷ�Ԫ��, ���������洢����С����
	public Item extractMin() {
		assert count > 0;
		Item ret = data[1];

		swap(1, count);
		count--;
		shiftDown(1);

		return ret;
	}

	// ��ȡ��С���еĶѶ�Ԫ��
	public Item getMin() {
		assert (count > 0);
		return data[1];
	}

	// ������������Ϊi��j������Ԫ��
	private void swap(int i, int j) {
		Item t = data[i];
		data[i] = data[j];
		data[j] = t;
	}

	// ********************
	// * ��С�Ѻ��ĸ�������
	// ********************
	private void shiftUp(int k) {

		while (k > 1 && data[k / 2].compareTo(data[k]) > 0) {
			swap(k, k / 2);
			k /= 2;
		}
	}

	private void shiftDown(int k) {

		while (2 * k <= count) {
			int j = 2 * k; // �ڴ���ѭ����,data[k]��data[j]����λ��
			if (j + 1 <= count && data[j + 1].compareTo(data[j]) < 0)
				j++;
			// data[j] �� data[2*k]��data[2*k+1]�е���Сֵ

			if (data[k].compareTo(data[j]) <= 0)
				break;
			swap(k, j);
			k = j;
		}
	}

	// ���� MinHeap
	public static void main(String[] args) {

		MinHeap<Integer> minHeap = new MinHeap<Integer>(100);
		int N = 100; // ����Ԫ�ظ���
		int M = 100; // ����Ԫ��ȡֵ��Χ[0, M)
		for (int i = 0; i < N; i++)
			minHeap.insert(new Integer((int) (Math.random() * M)));

		Integer[] arr = new Integer[N];
		// ��minheap�е�������ʹ��extractMinȡ����
		// ȡ������˳��Ӧ���ǰ��մ�С�����˳��ȡ������
		for (int i = 0; i < N; i++) {
			arr[i] = minHeap.extractMin();
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// ȷ��arr�����Ǵ�С�������е�
		for (int i = 1; i < N; i++)
			assert arr[i - 1] <= arr[i];
	}
}
