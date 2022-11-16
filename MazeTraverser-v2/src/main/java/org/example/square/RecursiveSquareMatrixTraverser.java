package org.example.square;


import org.example.Matrix;

public class RecursiveSquareMatrixTraverser extends SquareMatrixTraverser {

    public RecursiveSquareMatrixTraverser(Matrix matrix) {
        super(matrix);
    }

    @Override
    public void traverse() {
        if (isAllVisited()) {
            return;
        }
        traverseSquare();
        traverse();
    }
}