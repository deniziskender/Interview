package org.example.square;

import org.example.Matrix;

public class NonRecursiveSquareMatrixTraverser extends SquareMatrixTraverser {

    public NonRecursiveSquareMatrixTraverser(Matrix matrix) {
        super(matrix);
    }

    @Override
    public void traverse() {
        while (isAllNotVisited()) {
            traverseSquare();
        }
    }
}

