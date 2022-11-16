import org.example.Cell;
import org.example.Matrix;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixTest {

    @Test
    public void should_construct() {
        Matrix m = new Matrix(4);
        assertEquals(m.getDimension(), 4);

        Cell[][] matrix = m.getCells();
        assertEquals(matrix[0].length, 4);
        assertEquals(matrix.length, 4);

        assertEquals(matrix[1][2].getX(), 1);
        assertEquals(matrix[1][2].getY(), 2);
        assertEquals(matrix[1][2].getValue(), 7);

        assertEquals(matrix[2][1].getX(), 2);
        assertEquals(matrix[2][1].getY(), 1);
        assertEquals(matrix[2][1].getValue(), 10);
    }
}
