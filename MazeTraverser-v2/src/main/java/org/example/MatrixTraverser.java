package org.example;

import lombok.Getter;
import org.example.direction.DIRECTION;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class MatrixTraverser {

    protected final Matrix matrix;
    protected List<Cell> path;
    protected Cell current;

    public MatrixTraverser(Matrix matrix, int startX, int startY) {
        this.matrix = matrix;
        this.path = new ArrayList<>();
        moveTo(matrix.getCell(startX, startY));
    }

    public void moveUntilTo(DIRECTION direction) {
        while (true) {
            Cell next = matrix.getNext(current.getI(), current.getJ(), direction);
            if (next == null) break;
            moveTo(next);
        }
    }

    public void moveTo(DIRECTION direction) {
        Cell next = matrix.getNext(current.getI(), current.getJ(), direction);
        if (next == null) return;
        moveTo(next);
    }

    public String getResult() {
        StringBuilder result = new StringBuilder();
        path.forEach(cell -> result.append(cell.getValue()).append(" "));
        return result.toString();
    }

    public boolean isAllVisited() {
        return path.size() == matrix.getNumCells();
    }

    public boolean isAllNotVisited() {
        return !isAllVisited();
    }

    public abstract void traverse();

    private void moveTo(Cell next) {
        current = next;
        current.setVisited(true);
        path.add(current);
    }
}
