package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        sentence = sentence.toLowerCase();
        StringTokenizer str = new StringTokenizer(sentence, List.of(" ", ",", ".").toString());
        Map<String, Integer> map = new LinkedHashMap<>();
        while(str.hasMoreTokens()) {
            String s = str.nextToken();
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        return map;
    }
}
