import org.example.Cell;
import org.example.Matrix;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {
    @Test
    public void should_check_is_not_visited() {
        Cell cell = Cell.builder().isVisited(true).build();
        assertEquals(cell.isNotVisited(), false);
    }
}
