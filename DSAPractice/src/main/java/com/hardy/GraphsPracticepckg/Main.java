package com.hardy.GraphsPracticepckg;

public class Main {

    //was machst du? -> how are you doing;

    public static void main(String[] args) {

    GraphUsingList myGraph = new GraphUsingList(5);

    myGraph.addEdge(0, 3);
    myGraph.addEdge(0, 2);
    myGraph.addEdge(0, 1);

    myGraph.addEdge(1, 2);


    myGraph.addEdge(2, 3);
    myGraph.addEdge(2, 4);


    myGraph.printList();

    System.out.println("---------------------\nBFS");
    myGraph.BFS(0);


    }
}