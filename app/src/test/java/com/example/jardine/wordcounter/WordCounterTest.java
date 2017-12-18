package com.example.jardine.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by jardine on 18/12/2017.
 */

public class WordCounterTest {
    WordCounter wordCounter;

    @Before
    public void before() {
        wordCounter = new WordCounter("This is a sentence that has a number of words.");
    }

    @Test
    public void canPrintWordsArray() {
        assertEquals(10, wordCounter.getWordCount());
    }

    @Test
    public void canPrintWordOccurrences() {
        System.out.println(wordCounter.getOccurrences());
    }

}
