package org.example;

import lombok.Getter;
import org.example.direction.DIRECTION;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class MatrixTraverser {

    protected Matrix matrix;
    protected List<Cell> path;
    protected Cell current;

    private int startX;

    private int startY;

    public MatrixTraverser(Matrix matrix, int startX, int startY) {
        this.matrix = matrix;
        this.path = new ArrayList<>();
        this.startX = startX;
        this.startY = startY;
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
        // todo: java 8
        for (int i = 0; i < path.size(); i++) {
            result.append(path.get(i).getValue());
            if (i != path.size() - 1) {
                result.append(" ");
            }
        }
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
