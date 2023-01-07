package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (Map.Entry<String, Integer> entries : sourceMap.entrySet()) {
            Set<String> set;
            if (map.containsKey(entries.getKey().length())) {
                set = new HashSet<>(map.get(entries.getKey().length()));
            } else {
                set = new HashSet<>();
            }
            set.add(entries.getKey());
            map.put(entries.getKey().length(), set);
        }
        return map;
    }
}







