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

    public void moveToMost(DIRECTION direction) {
        matrix.getNext(current.getI(), current.getJ(), direction)
                .ifPresent(nextCell -> {
                    this.moveTo(nextCell);
                    moveToMost(direction);
                });
    }

    public void moveTo(DIRECTION direction) {
        matrix.getNext(current.getI(), current.getJ(), direction)
                .ifPresent(this::moveTo);
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
