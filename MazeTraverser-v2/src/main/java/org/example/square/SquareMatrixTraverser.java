package org.example.square;

import org.example.Matrix;
import org.example.MatrixTraverser;

import static org.example.direction.DIRECTION.*;

public abstract class SquareMatrixTraverser extends MatrixTraverser {

    public SquareMatrixTraverser(Matrix matrix) {
        super(matrix, 0, 0);
    }

    public void traverseSquare() {
        moveToMost(RIGHT);
        moveToMost(DOWN);
        moveToMost(LEFT);
        moveToMost(UP);
    }
}
