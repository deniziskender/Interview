package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter

public class Cell {
    private int i;
    private int j;
    private int value;
    private boolean isVisited;

    public boolean isNotVisited() {
        return !isVisited;
    }
}
