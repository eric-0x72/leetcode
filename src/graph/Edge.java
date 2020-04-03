package graph;

/**
 * @author zwb
 *
 * @param weight : weight extends Number&Comparable, implements Comparable
 *               interface
 * 
 *               extends parent class, implements interface
 * 
 */
public class Edge<Weight extends Number & Comparable> implements Comparable<Edge> {

	private int a, b;
	private Weight weight;

	public Edge(int _a, int _b, Weight _weight) {
		a = _a;
		b = _b;
		weight = _weight;
	}

	public Edge(Edge<Weight> e) {
		a = e.a;
		b = e.b;
		weight = e.weight;
	}

	public Weight wt() {
		return weight;
	}

	@Override
	// compare between edges
	public int compareTo(Edge other) {

	}

}
