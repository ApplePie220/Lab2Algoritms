package com.company;

public class Graph {
    private int maxN = 10;
    private int[][] mas;
    Vertex[] vertexList;
    private int curN;
    private Data data = new Data();

    public Graph() {
        vertexList = new Vertex[maxN];
        mas = new int[maxN][maxN];
        curN = 0;
    }

    public int getCurN() {
        return curN;
    }

    public void addVertex(char name) {
        vertexList[curN++] = new Vertex(name);
    }

    public void addEdge(int start, int end, int val,int val1) {
        mas[start][end] = val;
        mas[end][start] = val1;
    }

    public int check(int v) {
        for (int i = 0; i < curN; i++) {
            if (mas[v][i] == 1 && vertexList[i].isVisited == false) {
                return i;
            }
        }
        return -1;
    }

    public void pass(int index) {
        vertexList[index].isVisited = true;
        data.push(index);
        while (!data.isEmpty()) {
            int neigh = check(data.peek());
            if (neigh == -1) {
                neigh = data.pop();
            } else {
                vertexList[neigh].isVisited = true;
                data.push(neigh);
            }

        }
        rootIsIt(index);
        for (int i = 0; i < curN; i++) {
            vertexList[i].isVisited = false;
        }
    }

    public void rootIsIt(int index) {
        int count =0;
        for (int i = 0; i < curN; i++) {
            if (vertexList[i].isVisited ) {
                count++;
            }
            System.out.println(vertexList[i].name+" is visited? "+vertexList[i].isVisited);
        }
        System.out.println();
        if(count==curN)vertexList[index].isRoot=true;

        System.out.println(vertexList[index].name+" is root? "+vertexList[index].isRoot);
        System.out.println("------------------------");
    }
}
