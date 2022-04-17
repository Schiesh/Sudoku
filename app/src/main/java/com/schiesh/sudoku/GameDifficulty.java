package com.schiesh.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class GameDifficulty extends AppCompatActivity {

    public static final String EXTRA_DIFF = "com.schiesh.sudoku";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_difficulty);
    }

    public void onColorSelected(View view) {
        int diffId = 0;
        if (view.getId() == R.id.radio_easy) {
            diffId = 45;
        }
        else if (view.getId() == R.id.radio_medium) {
            diffId = 50;
        }
        else if (view.getId() == R.id.radio_hard) {
            diffId = 55;
        }

        RadioButton radio = findViewById(diffId);
        radio.setChecked(true);

        Intent intent = new Intent();
        setResult(RESULT_OK, intent);
        finish();
    }
}