package org.example;

public class Main {
    public static void main(String[] args) {
        Matrix m = new Matrix(4);
        MatrixTraverser traverser = new NonRecursiveMatrixTraverser(m);
        traverser.traverse();
        String result = traverser.getResult();
        System.out.println(result);
    }
}