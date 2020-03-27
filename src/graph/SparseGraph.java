package graph;

import java.util.Vector;

public class SparseGraph {

	private int somevariable;

	private int vertex;
	private int edge;

	private boolean directed;
	private Vector<Integer>[] g; //

	// constructor
	public SparseGraph(int _vertex, boolean _directed) {
		vertex = _vertex;
		directed = _directed;
		edge = 0; // no edge when created

		g = new Vector[vertex];

		for (int i = 0; i < vertex; i++) {
			g[i] = new Vector<Integer>();
		}
	}

	void addEdge(int v, int v_other) {
		g[v].add(v_other);

		if (v != v_other && !directed)
			g[v_other].add(v);

		edge++;
	}

	boolean hasEdge(int v, int v1) {
		for (int i = 0; i < g[v].size(); i++) {
			if (g[v].elementAt(i) == v1)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Vector<Integer>[] v = new Vector[7];
		for (int i = 0; i < v.length; i++) {
			v[i] = new Vector<>();
		}

	}

}
