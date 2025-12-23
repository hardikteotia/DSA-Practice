package com.hardy.GraphsPracticepckg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyGraph {


    //this is the node class for nodes/vertices of graph
    private class Node{

        private String label;

        public Node(String label){
            this.label=label;
        }
        @Override
        public String toString(){
            return label;
        }
    }

    private Map<String, Node> nodes = new HashMap<>();
    //Nodes [String(key), Node(value)] = [0, addressof[0]]
    private Map<Node, List<Node>> adjacencyList = new HashMap<>();

    public void addNode(String label){//[0]
        var node = new Node(label);//[node = addressof[0]]
        nodes.putIfAbsent(label,node);//[0, addressof[0]]
        adjacencyList.putIfAbsent(node,new ArrayList<>());
    }

    public void addEdge(String from,String to){
        var fromNode = nodes.get(from);
        if (fromNode == null){
            throw new IllegalArgumentException();
        }
        var toNode = nodes.get(to);
        if (toNode == null){
            throw new IllegalArgumentException();
        }
        adjacencyList.get(fromNode).add(toNode);
    }

    public void print(){
        for (var source: adjacencyList.keySet()){
            var targets = adjacencyList.get(source);
            if(!targets.isEmpty()){
                System.out.println(source + " -> " + targets);
            }
        }
    }

}
