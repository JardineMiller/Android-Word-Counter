package com.example.jardine.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    Button countButton;
    EditText phraseText;
    TextView countText;
    TextView occurencesText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        countButton = findViewById(R.id.count_button);
        phraseText = findViewById(R.id.phrase_text);
        countText = findViewById(R.id.count_text);
        occurencesText = findViewById(R.id.occurrences_text);
    }

    public void onCountButtonClicked(View button) {
        String phrase = phraseText.getText().toString();
        WordCounter wordCounter = new WordCounter(phrase);
        countText.setText(wordCounter.getWordCount());
        occurencesText.setText(wordCounter.getOccurrences());
    }
}
