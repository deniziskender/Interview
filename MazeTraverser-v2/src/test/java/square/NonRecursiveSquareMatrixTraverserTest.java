package square;

import org.example.Matrix;
import org.example.MatrixTraverser;
import org.example.square.NonRecursiveSquareMatrixTraverser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonRecursiveSquareMatrixTraverserTest {
    @Test
    public void should_traverse_square() {
        Matrix m = new Matrix(3, 3);
        MatrixTraverser traverser = new NonRecursiveSquareMatrixTraverser(m);
        traverser.traverse();
        String result = traverser.getResult();
        assertEquals("1 2 3 6 9 8 7 4 5 ", result);
    }

    @Test
    public void should_traverse_when_the_matrix_is_4_by_3() {
        Matrix m = new Matrix(4, 3);
        MatrixTraverser traverser = new NonRecursiveSquareMatrixTraverser(m);
        traverser.traverse();
        String result = traverser.getResult();
        assertEquals("1 2 3 6 9 12 11 10 7 4 5 8 ", result);
    }

    @Test
    public void should_traverse_when_the_matrix_is_4_by5() {
        Matrix m = new Matrix(4, 5);
        MatrixTraverser traverser = new NonRecursiveSquareMatrixTraverser(m);
        traverser.traverse();
        String result = traverser.getResult();
        assertEquals("1 2 3 4 5 10 15 20 19 18 17 16 11 6 7 8 9 14 13 12 ", result);
    }
}
