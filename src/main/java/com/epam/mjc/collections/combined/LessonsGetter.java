package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> set = new LinkedHashSet<>();
        Set<Map.Entry<String, List<String>>> entries = timetable.entrySet();
        for (Map.Entry<String, List<String>> entry : entries) {
            List<String> value = entry.getValue();
            set.addAll(value);
        }
        return set;
    }
}