package org.example.task3;

import java.util.Objects;

public class Cube implements Figure {

    private Double a;

    public Cube(Double a) {
        this.a = a;
    }

    @Override
    public Double Volume() {
        return Math.pow(a, 3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cube cube = (Cube) o;
        return Objects.equals(a, cube.a) && Objects.equals(cube.Volume(), this.Volume());
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
