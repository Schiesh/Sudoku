package com.schiesh.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Color extends AppCompatActivity {

    public static final String EXTRA_COLOR = "com.schiesh.sudoku";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        //set up to catch like in lightsout game
        Intent intent = getIntent();
        int colorId =  intent.getIntExtra(EXTRA_COLOR, R.color.gray);
        int radioId = R.id.radio_gray;

        if (colorId == R.color.pink) {
            radioId = R.id.radio_pink;
        } else if (colorId == R.color.orange) {
            radioId = R.id.radio_orange;
        } else if (colorId == R.color.green) {
            radioId = R.id.radio_green;
        } else if (colorId == R.color.blue) {
            radioId = R.id.radio_blue;
        } else if (colorId == R.color.purple) {
            radioId = R.id.radio_purple;
        } else if (colorId == R.color.light_green) {
            radioId = R.id.radio_light_green;
        } else if (colorId == R.color.yellow) {
            radioId = R.id.radio_yellow;
        } else if (colorId == R.color.raspberry) {
            radioId = R.id.radio_raspberry;
        }
        RadioButton radio = findViewById(radioId);
        radio.setChecked(true);

    }

    public void onColorButtonClicked(View view) {
        int colorId = R.color.gray;
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
        Intent intent = new Intent();
        intent.putExtra(EXTRA_COLOR, colorId);
        setResult(RESULT_OK, intent);
        finish();
    }
}