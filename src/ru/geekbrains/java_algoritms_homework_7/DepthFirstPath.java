package ru.geekbrains.java_algoritms_homework_7;

public class DepthFirstPath extends SearchPath{ // Поиск в глубину с наследованием

    public DepthFirstPath(Graph g, int source) {
        super(g, source);
    }

    @Override
    public void sp(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                sp(g, w);
            }
        }
    }
}
