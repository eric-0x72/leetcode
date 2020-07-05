package graph_bobo;

import java.util.Vector;
import java.util.Stack;

// Dijkstra�㷨�����·��
public class Dijkstra<Weight extends Number & Comparable> {

	private WeightedGraph G; // ͼ������
	private int s; // ��ʼ��
	private Number[] distTo; // distTo[i]�洢����ʼ��s��i�����·������
	private boolean[] marked; // �������, ���㷨���й����б�ǽڵ�i�Ƿ񱻷���
	private Edge<Weight>[] from; // from[i]��¼���·����, ����i��ı�edge����һ��; ���������ָ��������·��

	// ���캯��
	public Dijkstra(WeightedGraph graph, int s) {
		// �㷨��ʼ��
		G = graph;

		// assert s >= 0 && s < G.V();
		this.s = s;

		distTo = new Number[G.V()];
		marked = new boolean[G.V()];
		from = new Edge[G.V()];

		for (int i = 0; i < G.V(); i++) {
			distTo[i] = 0.0;
			marked[i] = false;
			from[i] = null;
		}

		// ʹ�������Ѽ�¼��ǰ�ҵ��ĵ���ÿ���������̾���
		IndexMinHeap<Weight> q = new IndexMinHeap<Weight>(G.V()); // index pq

		// ������ʼ��s���г�ʼ��
		distTo[s] = 0.0;
		from[s] = new Edge<Weight>(s, s, (Weight) (Number) (0.0));
		q.insert(s, (Weight) distTo[s]);
		marked[s] = true;

		while (!q.isEmpty()) {
			int v = q.extractMinIndex(); // v is index of node

			// distTo[v]����s��v����̾���
			marked[v] = true;

			// ��v���������ڽڵ���и���
			for (Object item : G.adj(v)) { // for each edge adjacent to v

				Edge<Weight> e = (Edge<Weight>) item;
				int w = e.other(v); // w is the other node for edge e

				// �����s�㵽w������·����û���ҵ�
				if (!marked[w]) {

					// ���w����ǰû�з��ʹ�,
					// ���߷��ʹ�, ����ͨ����ǰ��v�㵽w��������, ����и���w�����·��
					if (from[w] == null || distTo[v].doubleValue() + e.wt().doubleValue() < distTo[w].doubleValue()) {
						distTo[w] = distTo[v].doubleValue() + e.wt().doubleValue(); // update w
						from[w] = e; // reach w from edge e

						if (q.contain(w)) // update w's path sum
							q.change(w, (Weight) distTo[w]);
						else
							q.insert(w, (Weight) distTo[w]);
					}
				}
			}
		}
	}

	// ���ش�s�㵽w������·������
	private Number shortestPathTo(int w) {
		// assert w >= 0 && w < G.V();
		// assert hasPathTo(w);
		return distTo[w];
	}

	// �жϴ�s�㵽w���Ƿ���ͨ
	private boolean hasPathTo(int w) {
		// assert w >= 0 && w < G.V();
		return marked[w];
	}

	// Ѱ�Ҵ�s��w�����·��, ������·�������ıߴ����vec��
	private Vector<Edge<Weight>> shortestPath(int w) {
		// assert w >= 0 && w < G.V();
		// assert hasPathTo(w);

		// ͨ��from����������ҵ���s��w��·��, ��ŵ�ջ��
		Stack<Edge<Weight>> s = new Stack<Edge<Weight>>();
		Edge<Weight> e = from[w];
		while (e.v() != this.s) {
			s.push(e);
			e = from[e.v()];
		}
		s.push(e);

		// ��ջ������ȡ��Ԫ��, ���˳��Ĵ�s��w��·��
		Vector<Edge<Weight>> res = new Vector<Edge<Weight>>();
		while (!s.empty()) {
			e = s.pop();
			res.add(e);
		}
		return res;
	}

	// ��ӡ����s�㵽w���·��
	private void showPath(int w) {
		// assert w >= 0 && w < G.V();
		// assert hasPathTo(w);

		Vector<Edge<Weight>> path = shortestPath(w);
		for (int i = 0; i < path.size(); i++) {
			System.out.print(path.elementAt(i).v() + " -> ");
			if (i == path.size() - 1)
				System.out.println(path.elementAt(i).w());
		}
	}
}
