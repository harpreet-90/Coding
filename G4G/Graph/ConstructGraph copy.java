package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class ConstructGraph {
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> directGraph()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of vertices:");
        int v = sc.nextInt();
        for(int i=0; i<v; i++){
            graph.add(new ArrayList<>());
        }
        System.out.println("enter no. of edges:");
        int e = sc.nextInt();
        for(int i=0; i<e; i++){
            System.out.println("enter "+ i +"th of edges:");
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            addEdge(v1, v2);
        }
        return graph;
    }

    private void addEdge(int v1, int v2) 
    {
        graph.get(v1).add(v2);
    }
}
