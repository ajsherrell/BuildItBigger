package com.ajsherrell.androidjokeslib;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.udacity.gradle.builditbigger.R;

public class AndroidJokesDisplay extends AppCompatActivity {

    public static final String JOKE_KEY = "JOKE_KEY";

    TextView jokeTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes_display);

        jokeTextView = (TextView) findViewById(R.id.joke_display_text);

        String jokeString = null;
        Intent intent = getIntent();
        jokeString = intent.getStringExtra(AndroidJokesDisplay.JOKE_KEY);

        if (jokeString != null) {
            jokeTextView.setText(jokeString);
        } else {
            jokeTextView.setText(R.string.no_jokes);
        }
    }
}
