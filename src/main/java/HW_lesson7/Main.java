package HW_lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(12);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(3,2);
        graph.addEdge(4,2);
        graph.addEdge(4,3);
//        graph.addEdge(1,2);

//        System.out.println(graph.getEdgeCount());
//        System.out.println(graph.getAdjList(2));

//        DepthFirstPaths dfp = new DepthFirstPaths(graph, 1);
//        System.out.println(dfp.hasPathTo(0));
//        System.out.println(dfp.pathTo(0));

        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, 1);
        System.out.println(bfp.hasPathTo(0));
        System.out.println(bfp.pathTo(0));

    }
}
