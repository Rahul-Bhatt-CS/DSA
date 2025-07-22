import java.util.*;

public class DSA_8_GraphList {
    static class Node{
        char data;
        Node(char data){
            this.data = data;
        }
    }

    static class Graph{
        ArrayList<LinkedList<Node>> list;
        Graph(){
            list = new ArrayList<>();
        }
        public void addNode(Node node){
            LinkedList<Node> currlist = new LinkedList<>();
            currlist.add(node);
            list.add(currlist);
        }
        public void addEdge(int src, int dest){
            LinkedList<Node> currlist = list.get(src);
            Node destNode = list.get(dest).get(0);
            currlist.add(destNode);
        }
        public boolean checkEdge(int src, int dest){
            LinkedList<Node> currlist = list.get(src);
            Node destNode = list.get(dest).get(0);
            for(Node node : currlist){
                if(node == destNode){
                    return true;
                }
            }
            return false;
        }
        public void printGraph(){
            for(LinkedList<Node> currlist : list){
                for(Node node : currlist){
                    System.out.print(node.data + "->");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

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

        graph.printGraph();
    }
}