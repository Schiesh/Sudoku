package com.schiesh.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Color extends AppCompatActivity {
    Button backButton;
    public static final String EXTRA_COLOR = "com.schiesh.sudoku";
    int colorId = R.color.gray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);


        backButton = findViewById(R.id.switchButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent switchColorIntent = new Intent(Color.this, MainActivity.class);
                switchColorIntent.putExtra("message", colorId);
                startActivity(switchColorIntent);
                finish();
            }
        });

    }

    public void onColorButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        if(checked) {
            if (view.getId() == R.id.radio_pink) {
                colorId = R.color.pink;
            } else if (view.getId() == R.id.radio_orange) {
                colorId = R.color.orange;
            } else if (view.getId() == R.id.radio_green) {
                colorId = R.color.green;
            } else if (view.getId() == R.id.radio_blue) {
                colorId = R.color.blue;
            } else if (view.getId() == R.id.radio_purple) {
                colorId = R.color.purple;
            } else if (view.getId() == R.id.radio_light_green) {
                colorId = R.color.light_green;
            } else if (view.getId() == R.id.radio_yellow) {
                colorId = R.color.yellow;
            } else if (view.getId() == R.id.radio_raspberry) {
                colorId = R.color.raspberry;
            }
        }

    }
}