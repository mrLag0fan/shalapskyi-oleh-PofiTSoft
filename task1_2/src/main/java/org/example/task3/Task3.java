package org.example.task3;

import java.util.Comparator;
import java.util.List;

public class Task3 {

    private Task3(){}

    public static void sort(List<Figure> figures){
        if(figures != null){
            figures.sort(new Comparator<Figure>() {
                @Override
                public int compare(Figure o1, Figure o2) {
                    return o1.Volume().compareTo(o2.Volume());
                }
            });
        }else {
            throw new IllegalArgumentException("List of figures is null");
        }
    }
}
