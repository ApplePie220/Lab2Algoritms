package com.company;

public class Main {

    public static void main(String[] args) {
        boolean hasGrapghRoot=false;
        Graph graph = new Graph();
        graph.addVertex('A'); // 0
        graph.addVertex('B'); // 1
        graph.addVertex('C'); // 2
        graph.addVertex('D'); // 3
        graph.addVertex('E'); // 4
        graph.addVertex('F'); // 5
        graph.addVertex('G'); // 6
        graph.addVertex('H'); // 7
        graph.addVertex('I'); // 8

        graph.addEdge(0, 1, 1,0); //A--->B
        graph.addEdge(1, 2, 1,0); //B--->C
        graph.addEdge(2, 3, 1,0); //C--->D
        graph.addEdge(0, 4, 1,0); //A--->E
        graph.addEdge(4, 5, 1,0); //E--->F
        graph.addEdge(5,3,1,0);   //F -->D
        graph.addEdge(4,6,1,0); // E -->G
        graph.addEdge(6,8,1,0); //G-->I
        graph.addEdge(5,7,1,0); //F-->H
        for(int i=0;i< graph.getCurN();i++){
            graph.pass(i);
            if(graph.vertexList[i].isRoot==true) hasGrapghRoot=true;
        }
        if(hasGrapghRoot==true) System.out.println("У графа есть корень");
        else System.out.println("У графа нет корня");
    }
}
