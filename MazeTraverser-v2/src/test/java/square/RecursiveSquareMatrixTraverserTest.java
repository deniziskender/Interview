package square;

import org.example.Matrix;
import org.example.MatrixTraverser;
import org.example.square.RecursiveSquareMatrixTraverser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursiveSquareMatrixTraverserTest {

    @Test
    public void should_traverse_with_dimension_three() {
        Matrix m = new Matrix(3, 3);
        MatrixTraverser traverser = new RecursiveSquareMatrixTraverser(m);
        traverser.traverse();
        String result = traverser.getResult();
        assertEquals("1 2 3 6 9 8 7 4 5 ", result);
    }

    @Test
    public void should_traverse_with_dimension_four() {
        Matrix m = new Matrix(4, 4);
        MatrixTraverser traverser = new RecursiveSquareMatrixTraverser(m);
        traverser.traverse();
        String result = traverser.getResult();
        assertEquals("1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 ", result);
    }
}
