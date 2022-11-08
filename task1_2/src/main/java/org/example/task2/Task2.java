package org.example.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
        HashMap<String, Integer> allHashtags = new HashMap<>();
        if (hashtags != null) {
            for (String hashtag : hashtags) {
                Set<String> listOfHashtags = new HashSet<String>(List.of(hashtag
                    .replaceFirst("#", "")
                    .split("#")));
                for (String h : listOfHashtags) {
                    if (allHashtags.get(h) == null) {
                        allHashtags.put(h, 1);
                    } else {
                        int prevCount = allHashtags.get(h);
                        allHashtags.replace(h, ++prevCount);
                    }
                }
            }
            List<Map.Entry<String, Integer>> entries = new ArrayList<>(allHashtags.entrySet());
            entries = entries.stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList();
            HashMap<String, Integer> top5 = new HashMap<>();
            for (int i = 0; i < 5; i++) {
                top5.put(entries.get(i).getKey(), entries.get(i).getValue());
            }
            return top5;
        }
        throw new IllegalArgumentException("List of strings is null");
    }
}
