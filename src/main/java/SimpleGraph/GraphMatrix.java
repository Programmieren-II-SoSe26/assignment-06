package SimpleGraph;

import java.util.ArrayList;
import java.util.HashSet;

public class GraphMatrix {

    private final int[][] adj;
    private final ArrayList<Node> nodes;

    public GraphMatrix(HashSet<Node> nodes) {

        this.nodes = new ArrayList<>(nodes);
        this.adj = new int[nodes.size()][nodes.size()];
    }

    public void addEdge(Node from, Node to) {

        int i = nodes.indexOf(from);
        int j = nodes.indexOf(to);

        adj[i][j] = 1;
        adj[j][i] = 1;
    }

    public boolean hasEdge(Node from, Node to) {

        int i = nodes.indexOf(from);
        int j = nodes.indexOf(to);

        return adj[i][j] == 1;
    }

    public void removeEdge(Node from, Node to) {

        int i = nodes.indexOf(from);
        int j = nodes.indexOf(to);

        adj[i][j] = 0;
        adj[j][i] = 0;
    }

    //Implement
    public HashSet<Node> getNeighbors(Node node) {

        return new HashSet<>();
    }

    public int[][] getMatrix() {
        return adj;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }
}