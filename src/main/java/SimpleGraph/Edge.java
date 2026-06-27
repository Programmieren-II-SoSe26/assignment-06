package SimpleGraph;

public class Edge {

    private final Node from;
    private final Node to;

    public Edge(Node from, Node to) {
        this.from = from;
        this.to = to;
    }

    public Node getFrom() {
        return from;
    }

    public Node getTo() {
        return to;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Edge other)) {
            return false;
        }

        return (from.equals(other.from) && to.equals(other.to))
                || (from.equals(other.to) && to.equals(other.from));
    }

    @Override
    public int hashCode() {
        return from.hashCode() + to.hashCode();
    }

    @Override
    public String toString() {
        return from + " <-> " + to;
    }
}