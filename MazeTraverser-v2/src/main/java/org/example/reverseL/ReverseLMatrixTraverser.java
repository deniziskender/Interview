package org.example.reverseL;

import org.example.Matrix;
import org.example.MatrixTraverser;

import static org.example.direction.DIRECTION.*;

public abstract class ReverseLMatrixTraverser extends MatrixTraverser {

    public ReverseLMatrixTraverser(Matrix matrix) {
        super(matrix, matrix.getWidth() - 1, 0);
    }

    public void traverseL() {
        moveUntilTo(RIGHT);
        moveUntilTo(UP);
        moveTo(LEFT);
        moveUntilTo(DOWN);
        moveUntilTo(LEFT);
        moveTo(UP);
    }
}
