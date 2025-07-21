import java.util.*;
public class DSA_7_GraphMatrix {

    static class Node{
        char data;
        Node(char data){
            this.data = data;
        }
    }


    static class Graph{
        ArrayList<Node> nodes;
        int[][] matrix;
        Graph(int size){
            nodes = new ArrayList<>();
            matrix = new int[size][size];

        }
        public void addNode(Node node){
            nodes.add(node);
        }
        public void addEdge(int src, int dest){
            matrix[src][dest] = 1;
        }
        public boolean checkEdge(int src, int dest){
            return matrix[src][dest] == 1;
        }
        public void printGraph(){
            System.out.print("  ");
            for(Node node : nodes){
                System.out.print(node.data + " ");
            }
            System.out.println();

            for (int i = 0; i < matrix.length; i++){
                System.out.print(nodes.get(i).data + " ");
                for(int j = 0; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0 , 1);
        graph.addEdge(1 , 2);
        graph.addEdge(2 , 3);
        graph.addEdge(2 , 4);
        graph.addEdge(4 , 0);
        graph.addEdge(4 , 2);

        System.out.println(graph.checkEdge(4,1));

        graph.printGraph();
    }
}