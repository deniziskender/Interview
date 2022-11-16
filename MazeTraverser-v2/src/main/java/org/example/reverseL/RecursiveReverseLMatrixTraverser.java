package org.example.reverseL;


import org.example.Matrix;

public class RecursiveReverseLMatrixTraverser extends ReverseLMatrixTraverser {

    public RecursiveReverseLMatrixTraverser(Matrix matrix) {
        super(matrix);
    }

    @Override
    public void traverse() {
        if (isAllVisited()) {
            return;
        }
        traverseL();
        traverse();
    }
}