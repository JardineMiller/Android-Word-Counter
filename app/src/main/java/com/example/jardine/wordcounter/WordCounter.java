package com.example.jardine.wordcounter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by jardine on 18/12/2017.
 */

public class WordCounter {
    private String phrase;
    private String[] words;
    private HashMap<String, Integer> occurrences;

    public WordCounter(String phrase) {
        this.phrase = phrase;
        this.words = phrase.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        this.occurrences = new HashMap<>();
    }

    public String getPhrase() {
        return phrase;
    }

    public String getWordCount() {
       return Integer.toString(words.length);
    }

    public String[] getWords() {
        return words;
    }

    public String getOccurrences() {
        String occurrencesString = new String();
        for(String word : words) {
            if(!occurrences.containsKey(word)) {
                occurrences.put(word, 1);
            } else {
                occurrences.put(word, occurrences.get(word) + 1);
            }
        }

        Set<String> keySet = occurrences.keySet();
        Iterator<String> keySetIterator = keySet.iterator();
        while(keySetIterator.hasNext()) {
            String key = keySetIterator.next();
            occurrencesString += key + ": " + occurrences.get(key) + "\n";
        }
        return occurrencesString;

    }

}
