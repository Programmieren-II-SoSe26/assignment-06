package BusGraph;

class Node {
    String label;
    List<Edge> outgoingEdges = new ArrayList<>();

    public Node(String label) {
        this.label = label;
    }
}