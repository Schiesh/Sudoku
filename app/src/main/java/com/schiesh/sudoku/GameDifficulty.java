package com.schiesh.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class GameDifficulty extends AppCompatActivity {
    Button backButton;
    public static final String EXTRA_DIFF = "com.schiesh.sudoku";
    String diff = "n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_difficulty);
        backButton = findViewById(R.id.switchButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent switchActivityIntent = new Intent(GameDifficulty.this, MainActivity.class);
                switchActivityIntent.putExtra("message", diff);
                startActivity(switchActivityIntent);
                finish();
            }
        });


    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_easy:
                if (checked)
                    diff = "easy";
                Log.v("easy", diff);
                // Pirates are the best
                break;
            case R.id.radio_hard:
                if (checked)
                    diff = "hard";
                Log.v("hard", diff);
                // Ninjas rule
                break;
            case R.id.radio_medium:
                if (checked)
                    diff = "medium";
                Log.v("hard", diff);
                // Ninjas rule
                break;
        }
    }


}