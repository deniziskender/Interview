package org.example;


public class RecursiveMatrixTraverser extends MatrixTraverser {

    public RecursiveMatrixTraverser(Matrix matrix) {
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

    private boolean isAllVisited() {
        return path.size() == matrix.getDimension() * matrix.getDimension();
    }
}