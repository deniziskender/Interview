package reverseL;

import org.example.Matrix;
import org.example.MatrixTraverser;
import org.example.reverseL.RecursiveReverseLMatrixTraverser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursiveReverseLMatrixTraverserTest {

    @Test
    public void should_traverse_with_dimension_three() {
        Matrix m = new Matrix(3, 3);
        MatrixTraverser traverser = new RecursiveReverseLMatrixTraverser(m);
        traverser.traverse();
        String result = traverser.getResult();
        assertEquals("7 8 9 6 3 2 5 4 1", result);
    }

    @Test
    public void should_traverse_with_dimension_four() {
        Matrix m = new Matrix(4, 4);
        MatrixTraverser traverser = new RecursiveReverseLMatrixTraverser(m);
        traverser.traverse();
        String result = traverser.getResult();
        assertEquals("13 14 15 16 12 8 4 3 7 11 10 9 5 6 2 1", result);
    }
}
