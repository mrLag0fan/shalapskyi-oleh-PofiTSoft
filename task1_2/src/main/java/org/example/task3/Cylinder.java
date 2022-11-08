package org.example.task3;

import java.util.Objects;

public class Cylinder implements Figure {

    private Double r;
    private Double h;

    public Cylinder(Double r, Double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public Double Volume() {
        return Math.pow(r, 2) * Math.PI * h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cylinder cylinder = (Cylinder) o;
        return Objects.equals(r, cylinder.r) && Objects.equals(h, cylinder.h) &&
            Objects.equals(cylinder.Volume(), this.Volume());
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, h);
    }
}
