package org.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class MatrixTraverser {

    public Matrix matrix;
    public List<Cell> path;
    private Cell currentCell;

    public MatrixTraverser(Matrix matrix) {
        this.matrix = matrix;
        this.currentCell = matrix.getCells()[0][0];
        this.path = new ArrayList<>();
        setCurrentCellVisited();
    }

    public void traverseSquare() {
        while (isEligibleToMoveRight()) {
            moveRight();
        }
        while (isEligibleToMoveDown()) {
            moveDown();
        }
        while (isEligibleToMoveLeft()) {
            moveLeft();
        }
        while (isEligibleToMoveUp()) {
            moveUp();
        }
    }

    // still inside the matrix and right cell not visited
    public boolean isEligibleToMoveRight() {
        return currentCell.getY() < matrix.getDimension() - 1 &&
                matrix.getCells()[currentCell.getX()][currentCell.getY() + 1].isNotVisited();
    }

    public boolean isEligibleToMoveDown() {
        return currentCell.getX() < matrix.getDimension() - 1 &&
                matrix.getCells()[currentCell.getX() + 1][currentCell.getY()].isNotVisited();
    }

    public boolean isEligibleToMoveLeft() {
        return 0 < currentCell.getY() &&
                matrix.getCells()[currentCell.getX()][currentCell.getY() - 1].isNotVisited();
    }

    public boolean isEligibleToMoveUp() {
        return 0 < currentCell.getX() &&
                matrix.getCells()[currentCell.getX() - 1][currentCell.getY()].isNotVisited();
    }

    public void moveRight() {
        currentCell = matrix.getCells()[currentCell.getX()][currentCell.getY() + 1];
        setCurrentCellVisited();
    }

    public void moveDown() {
        currentCell = matrix.getCells()[currentCell.getX() + 1][currentCell.getY()];
        setCurrentCellVisited();
    }

    public void moveLeft() {
        currentCell = matrix.getCells()[currentCell.getX()][currentCell.getY() - 1];
        setCurrentCellVisited();
    }

    public void moveUp() {
        currentCell = matrix.getCells()[currentCell.getX()-1][currentCell.getY()];
        setCurrentCellVisited();
    }

    public String getResult() {
        String result = "";
        for (int i = 0; i < path.size(); i++) {
            result += path.get(i).getValue();
            if (i != path.size() - 1) {
                result += " ";
            }
        }
        return result;
    }

    public abstract void traverse();

    private void setCurrentCellVisited() {
        currentCell.setVisited(true);
        path.add(currentCell);
    }
}
