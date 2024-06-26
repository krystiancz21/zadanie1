package org.example;

import static org.example.TreeSearch.DFS;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left = new Node(8);

        System.out.println("Zadanie 1 - przeszukiwanie drzewa");
        DFS(root);
    }
}