package com.schiesh.sudoku;

import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class ColorChange extends AppCompatActivity {
    Button backButton;
    public static final String EXTRA_COLOR = "com.schiesh.sudoku";
    int colorId = R.color.gray;
    String color = "gray";
    //ShapeDrawable shapeDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_change);

        backButton = findViewById(R.id.switchColorButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent switchColorIntent = new Intent(ColorChange.this, MainActivity.class);
                switchColorIntent.putExtra("message", color);
                startActivity(switchColorIntent);
                finish();
            }
        });

    }

    public void onColorButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

       // shapeDrawable = (ShapeDrawable) getDrawable(R.drawable.border);
        switch(view.getId()) {
            case R.id.radio_pink:
                if(checked) {colorId = R.color.pink;
                color = "pink";
                    //shapeDrawable.getPaint().setColor(Color.parseColor("R.color.pink"));

                    Log.v("pink", color);}
                break;
            case R.id.radio_orange:
                if(checked) { colorId = R.color.orange;
                color = "orange";
                    //shapeDrawable.getPaint().setColor(Color.parseColor("R.color.orange"));

                    Log.v("orange", color);}
                break;
            case R.id.radio_green:
                if(checked) { colorId = R.color.green;
                color = "green";
                   // shapeDrawable.getPaint().setColor(Color.parseColor("R.color.green"));

                    Log.v("green", color);}
                break;
            case R.id.radio_blue:
                if(checked) {colorId = R.color.blue;
                color = "blue";
                   // shapeDrawable.getPaint().setColor(Color.parseColor("R.color.blue"));

                    Log.v("blue", color);}
                break;
            case R.id.radio_purple:
                if(checked) { colorId = R.color.purple;
                color = "purple";
                    //shapeDrawable.getPaint().setColor(Color.parseColor("R.color.purple"));
                    Log.v("purple", color);}
                break;
            case R.id.radio_light_green:
                if(checked) { colorId = R.color.light_green;
                color = "light_green";
                    //shapeDrawable.getPaint().setColor(Color.parseColor("R.color.light_green"));
                    Log.v("light_green", color);}
                break;
            case R.id.radio_yellow:
                if(checked) { colorId = R.color.yellow;
                    color = "yellow";
                    //shapeDrawable.getPaint().setColor(Color.parseColor("R.color.yellow"));
                    Log.v("yellow", color);}
                break;
            case R.id.radio_raspberry:
                if(checked) { colorId = R.color.raspberry;
                color = "raspberry";
                    //shapeDrawable.getPaint().setColor(Color.parseColor("R.color.raspberry"));
                    Log.v("raspberry", color);}
                break;
            }


    }
}