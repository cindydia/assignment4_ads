public class Main {

    public static void main(String[] args) {

        Graph g = new Graph();

        for (int i = 0; i < 10; i++) {
            g.addVertex(new Vertex(i));
        }

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        System.out.println("Graph:");
        g.printGraph();

        System.out.println("\nBFS Traversal:");
        g.bfs(0);

        System.out.println("\nDFS Traversal:");
        g.dfs(0);

        Experiment exp = new Experiment();

        exp.runMultipleTests();
        exp.printResults();
    }
}