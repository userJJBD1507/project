package com.project.id.project.core;

public record Id(int value) {
    public Id {
        if (value <= 0) {
            throw new IllegalArgumentException("ID must be a positive number");
        }
    }
}
