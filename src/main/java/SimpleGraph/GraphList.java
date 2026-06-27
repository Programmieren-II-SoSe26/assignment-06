package SimpleGraph;

import java.util.HashSet;
import java.util.HashMap;

public class GraphList {

    private final HashMap<Node, HashSet<Node>> adj = new HashMap<>();

    public void addNode(Node node) {
        adj.putIfAbsent(node, new HashSet<>());
    }

    public void addEdge(Node from, Node to) {
        addNode(from);
        addNode(to);

        adj.get(from).add(to);
        adj.get(to).add(from);
    }

    public boolean hasEdge(Node from, Node to) {
        return adj.getOrDefault(from, new HashSet<>()).contains(to);
    }

    public void removeEdge(Node from, Node to) {
        adj.getOrDefault(from, new HashSet<>()).remove(to);
        adj.getOrDefault(to, new HashSet<>()).remove(from);
    }

    //Implement
    public HashSet<Node> getNeighbors(Node node) {
        return new HashSet<>();
    }

    public HashMap<Node, HashSet<Node>> getAdjacencyList() {
        return adj;
    }
}