package org.example;

import lombok.Getter;

@Getter
public class Matrix {
    private int dimension;
    private Cell[][] cells;

    public Matrix(int dimension) {
        this.dimension = dimension;
        this.cells = new Cell[dimension][dimension];
        setCells(dimension);
    }

    private void setCells(int dimension) {
        int value = 1;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                cells[i][j] = Cell.builder()
                        .x(i)
                        .y(j)
                        .value(value++)
                        .build();
            }
        }
    }
}


