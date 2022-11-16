import org.example.Cell;
import org.example.Matrix;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixTest {

    @Test
    public void should_construct() {
        Matrix m = new Matrix(4, 4);
        assertEquals(m.getWidth(), 4);
        assertEquals(m.getHeight(), 4);

        Cell[][] matrix = m.getCells();
        assertEquals(matrix[0].length, 4);
        assertEquals(matrix.length, 4);

        assertEquals(matrix[1][2].getI(), 1);
        assertEquals(matrix[1][2].getJ(), 2);
        assertEquals(matrix[1][2].getValue(), 7);

        assertEquals(matrix[2][1].getI(), 2);
        assertEquals(matrix[2][1].getJ(), 1);
        assertEquals(matrix[2][1].getValue(), 10);
    }
}
