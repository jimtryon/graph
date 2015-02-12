import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Created by jtryon on 2/9/15.
 */
public class GraphTester {
    public static void main(String[] args) {
        System.out.println("This is the graph tester.");

        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");

        Set<Vertex> nodes = new HashSet<Vertex>();
        nodes.add(v1);
        nodes.add(v2);
        nodes.add(v3);
        nodes.add(v4);
        nodes.add(v5);

        Edge e1 = new Edge(v1, v2, 3);
        Edge e2 = new Edge(v2, v3, 6);

        Set<Edge> edges = new HashSet<Edge>();

        edges.add(e1);
        edges.add(e2);

        Graph g = new MyGraph(nodes, edges);

        System.out.println("The vertices in the graph: " + g.vertices());
        System.out.println("The edges in the graph: " + g.edges());
    }
}

