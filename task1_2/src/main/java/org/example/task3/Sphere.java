package org.example.task3;

import java.util.Objects;

public class Sphere implements Figure {

    private Double r;

    public Sphere(Double r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Sphere sphere = (Sphere) o;
        return Objects.equals(r, sphere.r) && Objects.equals(sphere.Volume(), this.Volume());
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }

    @Override
    public Double Volume() {
        return (4 / 3) * Math.PI * Math.pow(r, 3);
    }
}
