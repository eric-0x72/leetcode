package graph;

public class _785_IsGraphBipartite {

	public boolean isBipartite(int[][] graph) {
		int n = graph.length;
		int[] colors = new int[n];

		for (int i = 0; i < n; i++) {
			if (colors[i] == 0 && !dfs(graph, colors, 1, i)) {
				return false;
			}
		}
		return true;
	}

	// "color" is the color to be painted
	private boolean dfs(int[][] graph, int[] colors, int color, int i) {
		if (colors[i] != 0) {
			return colors[i] == color;
		}

		colors[i] = color;
		for (int nei : graph[i]) {
			if (!dfs(graph, colors, -color, nei)) {
				return false;
			}
		}
		return true;
	}
}
