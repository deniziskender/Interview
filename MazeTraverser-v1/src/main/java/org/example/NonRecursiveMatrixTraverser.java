package org.example;

import java.util.ArrayList;
import java.util.List;

public class NonRecursiveMatrixTraverser extends MatrixTraverser {

    public NonRecursiveMatrixTraverser(Matrix matrix) {
        super(matrix);
    }

    @Override
    public void traverse() {
        while (isAllNotVisited()) {
            traverseSquare();
        }
    }

    private boolean isAllNotVisited() {
        return path.size() != matrix.getDimension() * matrix.getDimension();
    }
}

