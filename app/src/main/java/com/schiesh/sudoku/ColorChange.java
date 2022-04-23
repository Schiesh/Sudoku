package com.schiesh.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class ColorChange extends AppCompatActivity {
    Button backButton;
    public static final String EXTRA_COLOR = "com.schiesh.sudoku";
    int colorId = R.color.gray;
    String color = "gray";

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

        switch(view.getId()) {
            case R.id.radio_pink:
                if(checked) {colorId = R.color.pink;
                color = "pink";

                }
                break;
            case R.id.radio_orange:
                if(checked) { colorId = R.color.orange;
                color = "orange";

                }
                break;
            case R.id.radio_green:
                if(checked) { colorId = R.color.green;
                color = "green";

                }
                break;
            case R.id.radio_blue:
                if(checked) {colorId = R.color.blue;
                color = "blue";

                }
                break;
            case R.id.radio_purple:
                if(checked) { colorId = R.color.purple;
                color = "purple";

                }
                break;
            case R.id.radio_light_green:
                if(checked) { colorId = R.color.light_green;
                color = "light_green";

                }
                break;
            case R.id.radio_yellow:
                if(checked) { colorId = R.color.yellow;
                    color = "yellow";

                }
                break;
            case R.id.radio_raspberry:
                if(checked) { colorId = R.color.raspberry;
                color = "raspberry";

                }
                break;
            }


    }
}