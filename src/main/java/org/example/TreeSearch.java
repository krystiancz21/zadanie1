package org.example;
public class TreeSearch {
    public static void DFS(Node node) {
        if(node == null) return;

        System.out.println("Odwiedzono element: " + node.value);
        DFS(node.left);
        DFS(node.right);
    }
}
