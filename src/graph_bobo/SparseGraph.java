package graph_bobo;

import java.util.Vector;

/**
 * from 07 graph chapter
 *
 */
public class SparseGraph {

	private int vertex; // no. of vertices
	private int edge; // number of edges

	private boolean directed;
	private Vector<Integer>[] g;

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

	public int getVertex() {
		return vertex;
	}

	public int getEdge() {
		return edge;
	}

	void addEdge(int v, int v_other) {

		// add v -> other
		g[v].add(v_other);

		if (v != v_other && !directed)
			// add other -> v
			g[v_other].add(v);

		edge++;
	}

	boolean hasEdge(int v, int v1) {

		// check all vertices connected to v, check if equals to v1
		for (int i = 0; i < g[v].size(); i++) {
			if (g[v].elementAt(i) == v1)
				return true;
		}
		return false;
	}

	public Iterable<Integer> adj(int v) {
		return g[v]; // return vector, as Iterable
	}

	public static void main(String[] args) {

		Vector<Integer>[] g = new Vector[7]; // g is an array of Vectors
		// System.out.println(g[0]);

		for (int i = 0; i < g.length; i++) {
			g[i] = new Vector<Integer>();
		}
	}

}
