public class Experiment {

    public void runTraversals(Graph g) {

        long startBFS = System.nanoTime();
        g.bfs(0);
        long endBFS = System.nanoTime();

        long startDFS = System.nanoTime();
        g.dfs(0);
        long endDFS = System.nanoTime();

        System.out.println("BFS Time: " + (endBFS - startBFS));
        System.out.println("DFS Time: " + (endDFS - startDFS));
    }

    public void runMultipleTests() {
        int[] sizes = {10, 30, 100};

        for (int size : sizes) {

            Graph g = new Graph();

            for (int i = 0; i < size; i++) {
                g.addVertex(new Vertex(i));
            }

            for (int i = 0; i < size - 1; i++) {
                g.addEdge(i, i + 1);
            }

            System.out.println("\nGraph Size: " + size);

            runTraversals(g);
        }
    }

    public void printResults() {
        System.out.println("Traversal experiments completed.");
    }
}
