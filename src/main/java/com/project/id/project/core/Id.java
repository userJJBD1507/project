package com.project.id.project.core;

import java.io.Serializable;

public record Id(int id) implements Serializable {
    public Id {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be a positive number");
        }
    }
}
