package ru.geekbrains.java_algoritms_homework_7;

import java.util.LinkedList;

public class SearchPath { // Родительский класс для поисков в глубину и в ширину
    public boolean[] marked;
    public int[] edgeTo;
    public int source;

    public SearchPath(Graph g, int source) {
        this.source = source;
        edgeTo = new int[g.getVertexCount()];
        marked = new boolean[g.getVertexCount()];
        sp(g, source);
    }

    public void sp(Graph g, int v) {

    }

    public boolean hasPathTo(int dist) {
        return marked[dist];
    }

    public LinkedList<Integer> pathTo(int dist) {
        if (!hasPathTo(dist)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = dist;
        while (vertex != source) {
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }

}
