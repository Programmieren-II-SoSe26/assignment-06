package SimpleGraph;

import java.util.*;

public class SimpleGraph {

    private final HashSet<Node> nodes = new HashSet<>();
    private final HashSet<Edge> edges = new HashSet<>();

    public HashSet<Node> getNodes() { return nodes; }

    public HashSet<Edge> getEdges() { return edges; }

    public void addNode(Node node) { nodes.add(node); }

    public void addEdge(Node from, Node to) {

        if (!nodes.contains(from) || !nodes.contains(to)) {
            throw new IllegalArgumentException("Node not contained in graph.");
        }

        edges.add(new Edge(from, to));
    }

    //Implement
    public HashSet<Node> getNeighbors(Node node) {

        return new HashSet<>();
    }

    //Implement
    public GraphList toAdjacencyList() {

        return new GraphList();
    }

    //Implement
    public GraphMatrix toAdjacencyMatrix() {

        return new GraphMatrix(new HashSet<>());
    }

    //Implement
    public ArrayList<Node> shortestPath(Node start, Node target) {

        return new ArrayList<>();
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("Nodes:\n");

        for (Node node : nodes) {
            builder.append(node).append("\n");
        }

        builder.append("\nEdges:\n");

        for (Edge edge : edges) {
            builder.append(edge).append("\n");
        }

        return builder.toString();
    }
}