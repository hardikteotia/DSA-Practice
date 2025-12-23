package com.hardy.GraphsPracticepckg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphUsingList {

    private int numberOfVertices;
    List<List<Integer>> adjacencyList;

    public GraphUsingList(int numberOfVertices){
        this.numberOfVertices = numberOfVertices;


        //this one is giving me an arrayList like ListOfVertices = [an empty list which can                  contains the list of                     edges]
        //or i can say it's the outer list
        adjacencyList = new ArrayList<>();


        //so what this is doing - it's adding new array lists of EDGES in List of VERTICES
        for (int i = 0; i < numberOfVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }


        //the whole concept is like this
        //Vertices -> [ Edge[],Edge[],Edge[],Edge[],Edge[] ]
    }

    public void addEdge(int vertex, int edge){
        adjacencyList.get(vertex).add(edge);
        adjacencyList.get(edge).add(vertex);
    }

    public void printList(){
        for(int i=0;i<numberOfVertices;i++){
            System.out.print(i + " -> ");
            for(int n: adjacencyList.get(i)){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public void BFS(int startVertex){

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[numberOfVertices];
        //[false,false,false,false,false]

        visited[startVertex] = true;
        queue.add(startVertex);



        while(!queue.isEmpty()){
            int vertex = queue.remove();
            System.out.print(vertex + " ");
            for(int n: adjacencyList.get(vertex)){
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }


    }

}
