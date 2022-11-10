package org.example.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {

    private Task1() {
    }

    public static int[] filter(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        if (array != null) {
            for (int i : array) {
                if (i >= 0) {
                    result.add(i);
                }
            }
            Collections.reverse(result);
            return result.stream().mapToInt((i) -> i).toArray();
        }
        throw new IllegalArgumentException("Array is null!");
    }

}
