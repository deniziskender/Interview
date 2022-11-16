package org.example;

import org.example.square.NonRecursiveSquareMatrixTraverser;

public class Main {
    public static void main(String[] args) {
        Matrix m = new Matrix(4, 4);
        MatrixTraverser traverser = new NonRecursiveSquareMatrixTraverser(m);
        traverser.traverse();
        System.out.println(traverser.getResult());
    }
}