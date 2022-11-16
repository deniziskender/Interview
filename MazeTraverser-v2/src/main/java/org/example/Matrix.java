package org.example;

import lombok.Getter;
import org.example.direction.DIRECTION;

@Getter
public class Matrix {
    private final int width;

    private final int height;
    private final Cell[][] cells;

    public Matrix(int width, int height) {
        this.width = width;
        this.height = height;
        this.cells = new Cell[width][height];
        createCells();
    }

    public int getNumCells() {
        return width * height;
    }

    public Cell getCell(int i, int j) {
        return cells[i][j];
    }

    public Cell getNext(int i, int j, DIRECTION direction) {
        if (isOutOfBounds(i, j, direction)) {
            return null;
        }
        Cell cell = null;
        switch (direction) {
            case RIGHT -> cell = cells[i][j + 1];
            case LEFT -> cell = cells[i][j - 1];
            case UP -> cell = cells[i - 1][j];
            case DOWN -> cell = cells[i + 1][j];
        }
        return cell.isVisited() ? null : cell;
    }

    private void createCells() {
        int value = 1;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                cells[i][j] = Cell.builder()
                        .i(i)
                        .j(j)
                        .value(value++)
                        .build();
            }
        }
    }

    private boolean isOutOfBounds(int i, int j, DIRECTION direction) {
        switch (direction) {
            case RIGHT -> j = j + 1;
            case LEFT -> j = j - 1;
            case UP -> i = i - 1;
            case DOWN -> i = i + 1;
        }
        return 0 > j || j >= height ||
                0 > i || i >= width;
    }
}


