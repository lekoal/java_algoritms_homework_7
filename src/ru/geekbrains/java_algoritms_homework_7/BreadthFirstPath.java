package ru.geekbrains.java_algoritms_homework_7;

import java.util.LinkedList;

public class BreadthFirstPath extends SearchPath{ // Поиск в ширину с наследованием

    public BreadthFirstPath(Graph g, int source) {
        super(g, source);
    }

    @Override
    public void sp(Graph g, int v) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(source);
        marked[source] = true;
        while (!queue.isEmpty()) {
            int vertex = queue.removeFirst();
            for (int w : g.getAdjList(vertex)) {
                if (!marked[w]) {
                    marked[w] = true;
                    edgeTo[w] = vertex;
                    queue.addLast(w);
                }
            }
        }
    }
}
