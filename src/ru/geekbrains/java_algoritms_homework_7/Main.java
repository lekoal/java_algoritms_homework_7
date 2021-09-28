/* Алгоритмы и структуры данных на Java
Практическое задание к лекции № 7
Кононов Леонид Александрович
Согласно заданию, в программе реализовано:
1. Реализована программа, в которой задается граф из 10 вершин. Заданы ребра и ищется кратчайший путь с помощью поиска в ширину;
2. Унаследованы классы реализующие алгоритмы с графами от одного класса.
*/

package ru.geekbrains.java_algoritms_homework_7;

public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph(10); // Создание графа с десятью вершинами

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 6);
        graph.addEdge(3, 6);
        graph.addEdge(3, 7);
        graph.addEdge(4, 5);
        graph.addEdge(4, 8);
        graph.addEdge(5, 9);
        graph.addEdge(6, 7);
        graph.addEdge(7, 9);
        graph.addEdge(8, 9);

//        System.out.println(graph.getVertexCount());
//        System.out.println(graph.getEdgeCount());
//        System.out.println(graph.getAdjList(4));

//        DepthFirstPath dfp = new DepthFirstPath(graph, 2);
//        System.out.println(dfp.hasPathTo(0));
//        System.out.println(dfp.pathTo(0));

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 5); // Поиск кратчайшего пути поиском вы ширину
        System.out.println(bfp.hasPathTo(6));
        System.out.println(bfp.pathTo(6));
    }
}
