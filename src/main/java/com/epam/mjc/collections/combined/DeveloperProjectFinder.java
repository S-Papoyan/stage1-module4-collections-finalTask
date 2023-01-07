package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entries : projects.entrySet()) {
            if (entries.getValue().contains(developer)) {
                result.add(entries.getKey());
            }
        }
        result.sort(new ListComparator());
        return result;
    }

    static class ListComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            if (a.length() - b.length() != 0) {
                return b.length() - a.length();
            } else {
                return b.compareTo(a);
            }
        }
    }
}

