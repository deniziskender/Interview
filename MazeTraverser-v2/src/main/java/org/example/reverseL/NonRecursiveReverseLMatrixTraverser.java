package org.example.reverseL;

import org.example.Matrix;

public class NonRecursiveReverseLMatrixTraverser extends ReverseLMatrixTraverser {

    public NonRecursiveReverseLMatrixTraverser(Matrix matrix) {
        super(matrix);
    }

    @Override
    public void traverse() {
        while (isAllNotVisited()) {
            traverseL();
        }
    }
}

