package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Definition for a Node
// every node has a value, and a list of neighbours
class Node {
	public int val;
	public List<Node> neighbors;

	public Node() {
		val = 0;
		neighbors = new ArrayList<Node>();
	}

	public Node(int _val) {
		val = _val;
		neighbors = new ArrayList<Node>();
	}

	public Node(int _val, ArrayList<Node> _neighbors) {
		val = _val;
		neighbors = _neighbors;
	}
}

public class _133_CloneGraph {

	// map stores
	private HashMap<Node, Node> visited = new HashMap<>();

	public Node cloneGraph(Node node) {

		if (node == null)
			return null;

		if (visited.containsKey(node))
			return visited.get(node);

		// new clone node
		Node clone = new Node(node.val, new ArrayList<>());
		visited.put(node, clone);

		for (Node neighbor : node.neighbors) {
			clone.neighbors.add(cloneGraph(neighbor));
		}
		return clone;
	}
}
