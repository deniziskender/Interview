import org.example.Cell;
import org.example.Matrix;
import org.example.MatrixTraverser;
import org.example.NonRecursiveMatrixTraverser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonRecursiveMatrixTraverserTest {


    @Test
    public void should_construct() {
        Matrix m = new Matrix(4);
        MatrixTraverser traverser = new NonRecursiveMatrixTraverser(m);
        assertEquals(traverser.getMatrix(), m);
        assertEquals(traverser.getCurrentCell(), m.getCells()[0][0]);
        assertEquals(traverser.getCurrentCell().isVisited(), true);
        assertEquals(traverser.getPath().size(), 1);
    }

    @Test
    public void is_eligible_to_move_right_when_out_of_index() {
        Matrix m = new Matrix(3);
        MatrixTraverser traverser = new NonRecursiveMatrixTraverser(m);
        assertEquals(traverser.isEligibleToMoveRight(), true);
        traverser.moveRight();
        assertEquals(traverser.isEligibleToMoveRight(), true);
        traverser.moveRight();
        assertEquals(traverser.isEligibleToMoveRight(), false);
    }

    @Test
    public void is_eligible_to_move_right_when_it_is_already_visited() {
        Matrix m = new Matrix(3);
        MatrixTraverser traverser = new NonRecursiveMatrixTraverser(m);
        traverser.moveRight();
        traverser.moveLeft();
        assertEquals(traverser.isEligibleToMoveRight(), false);
    }

    @Test
    public void is_eligible_to_move_down_when_out_of_index() {
        Matrix m = new Matrix(3);
        MatrixTraverser traverser = new NonRecursiveMatrixTraverser(m);
        assertEquals(traverser.isEligibleToMoveDown(), true);
        traverser.moveDown();
        assertEquals(traverser.isEligibleToMoveDown(), true);
        traverser.moveDown();
        assertEquals(traverser.isEligibleToMoveDown(), false);
    }

    @Test
    public void is_eligible_to_move_down_when_it_is_already_visited() {
        Matrix m = new Matrix(3);
        MatrixTraverser traverser = new NonRecursiveMatrixTraverser(m);
        traverser.moveDown();
        traverser.moveUp();
        assertEquals(traverser.isEligibleToMoveDown(), false);
    }

    @Test
    public void is_eligible_to_move_left_when_out_of_index() {
        Matrix m = new Matrix(3);
        MatrixTraverser traverser = new NonRecursiveMatrixTraverser(m);
        assertEquals(traverser.isEligibleToMoveLeft(), false);
    }

    @Test
    public void is_eligible_to_move_left_when_it_is_already_visited() {
        Matrix m = new Matrix(3);
        MatrixTraverser traverser = new NonRecursiveMatrixTraverser(m);
        traverser.moveRight();
        traverser.moveLeft();
        assertEquals(traverser.isEligibleToMoveRight(), false);
    }

    @Test
    public void is_eligible_to_move_up() {
        Matrix m = new Matrix(3);
        MatrixTraverser traverser = new NonRecursiveMatrixTraverser(m);
        assertEquals(traverser.isEligibleToMoveUp(), false);
    }

    @Test
    public void is_eligible_to_move_up_when_it_is_already_visited() {
        Matrix m = new Matrix(3);
        MatrixTraverser traverser = new NonRecursiveMatrixTraverser(m);
        traverser.moveDown();
        traverser.moveUp();
        assertEquals(traverser.isEligibleToMoveUp(), false);
    }

    @Test
    public void should_move_right() {
        Matrix m = new Matrix(3);
        MatrixTraverser traverser = new NonRecursiveMatrixTraverser(m);
        Cell old = traverser.getCurrentCell();
        traverser.moveRight();
        Cell right = traverser.getCurrentCell();
        assertEquals(right, m.getCells()[old.getX()][old.getY() + 1]);
    }

    @Test
    public void should_move_down() {
        Matrix m = new Matrix(3);
        MatrixTraverser traverser = new NonRecursiveMatrixTraverser(m);
        Cell old = traverser.getCurrentCell();
        traverser.moveDown();
        Cell down = traverser.getCurrentCell();
        assertEquals(down, m.getCells()[old.getX() + 1][old.getY()]);
    }

    @Test
    public void should_move_left() {
        Matrix m = new Matrix(3);
        MatrixTraverser traverser = new NonRecursiveMatrixTraverser(m);
        traverser.moveRight();
        traverser.moveRight();
        Cell old = traverser.getCurrentCell();
        traverser.moveLeft();
        Cell left = traverser.getCurrentCell();
        assertEquals(left, m.getCells()[old.getX()][old.getY() - 1]);
    }

    @Test
    public void should_move_up() {
        Matrix m = new Matrix(3);
        MatrixTraverser traverser = new NonRecursiveMatrixTraverser(m);
        traverser.moveDown();
        traverser.moveDown();
        Cell old = traverser.getCurrentCell();
        traverser.moveUp();
        Cell up = traverser.getCurrentCell();
        assertEquals(up, m.getCells()[old.getX() - 1][old.getY()]);
    }

    @Test
    public void should_traverse_square() {
        Matrix m = new Matrix(3);
        MatrixTraverser traverser = new NonRecursiveMatrixTraverser(m);
        traverser.traverseSquare();
        String result = traverser.getResult();
        assertEquals("1 2 3 6 9 8 7 4", result);
    }

    @Test
    public void should_traverse_when_dimension_three() {
        Matrix m = new Matrix(3);
        MatrixTraverser traverser = new NonRecursiveMatrixTraverser(m);
        traverser.traverse();
        String result = traverser.getResult();
        assertEquals("1 2 3 6 9 8 7 4 5", result);
    }

    @Test
    public void should_traverse_when_dimension_four() {
        Matrix m = new Matrix(4);
        MatrixTraverser traverser = new NonRecursiveMatrixTraverser(m);
        traverser.traverse();
        String result = traverser.getResult();
        assertEquals("1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10", result);
    }
}
