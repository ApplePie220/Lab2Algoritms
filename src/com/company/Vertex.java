package com.company;

public class Vertex {
    public char name;
    public boolean isVisited;
    public boolean isRoot;
    public Vertex(char name) {
        this.name=name;
        isVisited=false;
        isRoot=false;
    }
}
