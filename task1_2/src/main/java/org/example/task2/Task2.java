package org.example.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {

    private Task2() {
    }

    public static HashMap<String, Integer> countHashtags(List<String> hashtags) {
        HashMap<String, Integer> result = new HashMap<>();
        if (hashtags != null) {
            for (String hashtag : hashtags) {
                Set<String> listOfHashtags = new HashSet<String>(List.of(hashtag
                    .replaceFirst("#", "")
                    .split("#")));
                for (String h : listOfHashtags) {
                    if (result.get(h) == null) {
                        result.put(h, 1);
                    } else {
                        int prevCount = result.get(h);
                        result.replace(h, ++prevCount);
                    }
                }
            }
            return result;
        }
        throw new IllegalArgumentException("List of strings is null");
    }
}
