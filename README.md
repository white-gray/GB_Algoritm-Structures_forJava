# GB_Algoritm-Structures_forJava HW for lesson 5

Реализовать программу, в которой задается граф из 12 вершин. 
Задать ребра и найти кратчайший путь с помощью поиска в ширину.

сделать рисунок графа
найти кратчайший путь, вывести длину пути

Решение:
    отображается картинка Графа

    В терминале выводится:
        getEdgeCount() = 13
        getAdjList(2) = [1, 3, 6]
        getAdjList(0) = [12, 1]
        getAdjList(7) = [1]
        getAdjList(9) = [6]
        getAdjList(12) = [0]
        dfp.hasPathTo(7) = true
        dfp.pathTo(7) = [7] длина пути = 1
        dfp.hasPathTo(8) = true
        dfp.pathTo(8) = [2, 3, 4, 5, 8] длина пути = 5
        dfp.hasPathTo(1) = true
        dfp.pathTo(1) = [] длина пути = 0
        dfp.hasPathTo(12) = true
        dfp.pathTo(12) = [0, 12] длина пути = 2
        bfp.hasPathTo(7) = true
        bfp.hasPathTo(7) = [7] длина пути = 1
        bfp.hasPathTo(3) = true
        bfp.hasPathTo(3) = [2, 3] длина пути = 2
        bfp.hasPathTo(11) = true
        bfp.hasPathTo(11) = [2, 3, 4, 11] длина пути = 4