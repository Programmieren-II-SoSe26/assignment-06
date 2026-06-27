package SimpleGraph;

public class Main {

    public static void main(String[] args) {

        //Example Graph
        SimpleGraph simpleGraph = new SimpleGraph();

        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");

        simpleGraph.addNode(a);
        simpleGraph.addNode(b);
        simpleGraph.addNode(c);
        simpleGraph.addNode(d);
        simpleGraph.addNode(e);
        simpleGraph.addNode(f);

        simpleGraph.addEdge(a, b);
        simpleGraph.addEdge(a, c);
        simpleGraph.addEdge(b, d);
        simpleGraph.addEdge(c, d);
        simpleGraph.addEdge(d, e);
        simpleGraph.addEdge(e, f);

        System.out.println(simpleGraph);

        //Should each print B, C, E
        System.out.println("Nachbarn von D: " + simpleGraph.getNeighbors(d));
        System.out.println("Nachbarn von D: " + simpleGraph.toAdjacencyMatrix().getNeighbors(d));
        System.out.println("Nachbarn von D: " + simpleGraph.toAdjacencyList().getNeighbors(d));

        //Should print A, B, D, E, F
        System.out.println("Kürzester Pfad A -> F:\n" + simpleGraph.shortestPath(a, f));
    }

}