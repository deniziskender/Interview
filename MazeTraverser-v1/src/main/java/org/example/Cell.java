package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter

public class Cell {
    private int x;
    private int y;
    private int value;
    private boolean isVisited;

    public boolean isNotVisited() {
        return !isVisited;
    }
}
