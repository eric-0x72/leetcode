package graph;

/**
 * @author zwb
 *
 * @param <Weight> : generic, pass in weight parameter when creating the class
 * 
 * 
 */
public interface WeightedGraph<Weight extends Number & Comparable> {

	public int V();

	public int E();

	public void addEdge(Edge<Weight> e);

	boolean hasEdge(int v, int v1);

	void show();

	public Iterable<Edge<Weight>> adj(int v);
}
