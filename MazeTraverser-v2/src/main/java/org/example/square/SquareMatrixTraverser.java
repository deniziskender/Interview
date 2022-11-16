package org.example.square;

import org.example.Matrix;
import org.example.MatrixTraverser;

import static org.example.direction.DIRECTION.*;

public abstract class SquareMatrixTraverser extends MatrixTraverser {

    public SquareMatrixTraverser(Matrix matrix) {
        super(matrix, 0, 0);
    }

    public void traverseSquare() {
        moveUntilTo(RIGHT);
        moveUntilTo(DOWN);
        moveUntilTo(LEFT);
        moveUntilTo(UP);
    }
}
