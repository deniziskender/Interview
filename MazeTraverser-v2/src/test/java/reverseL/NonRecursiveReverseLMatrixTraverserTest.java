package reverseL;

import org.example.Matrix;
import org.example.MatrixTraverser;
import org.example.reverseL.NonRecursiveReverseLMatrixTraverser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonRecursiveReverseLMatrixTraverserTest {
    @Test
    public void should_traverse_square() {
        Matrix m = new Matrix(3, 3);
        MatrixTraverser traverser = new NonRecursiveReverseLMatrixTraverser(m);
        traverser.traverse();
        String result = traverser.getResult();
        assertEquals("7 8 9 6 3 2 5 4 1", result);
    }

    @Test
    public void should_traverse_when_the_matrix_is_4_by_3() {
        Matrix m = new Matrix(4, 3);
        MatrixTraverser traverser = new NonRecursiveReverseLMatrixTraverser(m);
        traverser.traverse();
        String result = traverser.getResult();
        assertEquals("10 11 12 9 6 3 2 5 8 7 4 1", result);
    }

    @Test
    public void should_traverse_when_the_matrix_is_4_by5() {
        Matrix m = new Matrix(4, 5);
        MatrixTraverser traverser = new NonRecursiveReverseLMatrixTraverser(m);
        traverser.traverse();
        String result = traverser.getResult();
        assertEquals("16 17 18 19 20 15 10 5 4 9 14 13 12 11 6 7 8 3 2 1", result);
    }
}
