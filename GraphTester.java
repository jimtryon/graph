/**
 *
 * Created by jtryon on 2/9/15.
 */

import java.util.HashSet;
import java.util.Set;

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

        Edge e1 = new Edge(v1, v2, 1);  // A to B
        Edge e2 = new Edge(v1, v3, 2);  // A to C
        Edge e3 = new Edge(v1, v4, 10);  // A to D
        Edge e4 = new Edge(v2, v3, 5);  // B to C
        Edge e5 = new Edge(v2, v5, 9); // B to E
        Edge e6 = new Edge(v3, v4, 3);  // C to D
        Edge e7 = new Edge(v4, v5, 4);  // D to E

        Set<Edge> edges = new HashSet<Edge>();

        edges.add(e1);
        edges.add(e2);
        edges.add(e3);
        edges.add(e4);
        edges.add(e5);
        edges.add(e6);
        edges.add(e7);


        Graph g = new MyGraph(nodes, edges);

        System.out.println("The vertices in the graph: " + g.vertices());
        System.out.println("The edges in the graph: " + g.edges());
        System.out.println();

        System.out.println("The adjacent vertices of A: " + g.adjacentVertices(v1));
        System.out.println("The adjacent vertices of B: " + g.adjacentVertices(v2));
        System.out.println("The adjacent vertices of C: " + g.adjacentVertices(v3));
        System.out.println("The adjacent vertices of D: " + g.adjacentVertices(v4));
        System.out.println();

        System.out.println("The reachable vertices of A: " + g.reachableVertices(v1));
        System.out.println("The reachable vertices of B: " + g.reachableVertices(v2));
        System.out.println("The reachable vertices of C: " + g.reachableVertices(v3));
        System.out.println("The reachable vertices of D: " + g.reachableVertices(v4));

        System.out.println();
        System.out.println("A is adjacent to B: " + g.isAdjacent(v1, v2));
        System.out.println("B is adjacent to C: " + g.isAdjacent(v2, v3));
        System.out.println("C is adjacent to D: " + g.isAdjacent(v3, v4));
        System.out.println("D is adjacent to E: " + g.isAdjacent(v1, v4));

        System.out.println("Topological sort: " + g.topologicalSort());
    }
}

