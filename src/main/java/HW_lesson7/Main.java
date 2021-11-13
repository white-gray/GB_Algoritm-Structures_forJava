package HW_lesson7;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * рисунок рассматриваемого шрафа
         *  */
        ImageFrame frame = new ImageFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        /*
         * настройка графа по рисунку
         * */
        Graph graph = new Graph(13);
        graph.addEdge(0, 12);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 7);
        graph.addEdge(2, 3);
        graph.addEdge(2, 6);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(4, 11);
        graph.addEdge(5, 8);
        graph.addEdge(8, 10);
        graph.addEdge(10, 6);
        graph.addEdge(6, 9);

        System.out.println("getEdgeCount() = " + graph.getEdgeCount());
        System.out.println("getAdjList(2) = " + graph.getAdjList(2));
        System.out.println("getAdjList(0) = " + graph.getAdjList(0));
        System.out.println("getAdjList(7) = " + graph.getAdjList(7));
        System.out.println("getAdjList(9) = " + graph.getAdjList(9));
        System.out.println("getAdjList(12) = " + graph.getAdjList(12));

        DepthFirstPaths dfp = new DepthFirstPaths(graph, 1);
        System.out.println("dfp.hasPathTo(7) = " + dfp.hasPathTo(7));
        System.out.println("dfp.pathTo(7) = " + dfp.pathTo(7) + " длина пути = " + dfp.pathTo(7).size());
        System.out.println("dfp.hasPathTo(8) = " + dfp.hasPathTo(8));
        System.out.println("dfp.pathTo(8) = " + dfp.pathTo(8) + " длина пути = " + dfp.pathTo(8).size());
        System.out.println("dfp.hasPathTo(1) = " + dfp.hasPathTo(1));
        System.out.println("dfp.pathTo(1) = " + dfp.pathTo(1) + " длина пути = " + dfp.pathTo(1).size());
        System.out.println("dfp.hasPathTo(12) = " + dfp.hasPathTo(12));
        System.out.println("dfp.pathTo(12) = " + dfp.pathTo(12) + " длина пути = " + dfp.pathTo(12).size());

        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, 1);
        System.out.println("bfp.hasPathTo(7) = " + bfp.hasPathTo(7));
        System.out.println("bfp.hasPathTo(7) = " + bfp.pathTo(7) + " длина пути = " + bfp.pathTo(7).size());
        System.out.println("bfp.hasPathTo(3) = " + bfp.hasPathTo(3));
        System.out.println("bfp.hasPathTo(3) = " + bfp.pathTo(3) + " длина пути = " + bfp.pathTo(3).size());
        System.out.println("bfp.hasPathTo(11) = " + bfp.hasPathTo(11));
        System.out.println("bfp.hasPathTo(11) = " + bfp.pathTo(11) + " длина пути = " + bfp.pathTo(11).size());

    }

    static class ImageFrame extends JFrame {

        private ImageFrame() {
            setTitle("ShowImage");
            setSize(310, 240);
            ImageComponent component = new ImageComponent();
            add(component);
        }
    }

    static class ImageComponent extends JComponent {
        private Image image;

        private ImageComponent() {
            try {
                image = ImageIO.read(new File("src/main/resources/screen_HW_lesson7.jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        protected void paintComponent(Graphics g) {
            if (image == null) return;
            g.drawImage(image, 0, 0, null);
        }
    }
}
