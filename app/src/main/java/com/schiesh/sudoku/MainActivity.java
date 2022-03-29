package com.schiesh.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private final int[] btn_list = {
            R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8,
            R.id.btn9, R.id.btn10, R.id.btn11, R.id.btn12, R.id.btn13, R.id.btn14, R.id.btn15,
            R.id.btn16, R.id.btn17, R.id.btn18, R.id.btn19, R.id.btn20, R.id.btn21, R.id.btn22,
            R.id.btn23, R.id.btn24, R.id.btn25, R.id.btn26, R.id.btn27, R.id.btn28, R.id.btn29,
            R.id.btn30, R.id.btn31, R.id.btn32, R.id.btn33, R.id.btn34, R.id.btn35, R.id.btn36,
            R.id.btn37, R.id.btn38, R.id.btn39, R.id.btn40, R.id.btn41, R.id.btn42, R.id.btn43,
            R.id.btn44, R.id.btn45, R.id.btn46, R.id.btn47, R.id.btn48, R.id.btn49, R.id.btn50,
            R.id.btn51, R.id.btn52, R.id.btn53, R.id.btn54, R.id.btn55, R.id.btn56, R.id.btn57,
            R.id.btn58, R.id.btn59, R.id.btn60, R.id.btn61, R.id.btn62, R.id.btn63, R.id.btn64,
            R.id.btn65, R.id.btn66, R.id.btn67, R.id.btn68, R.id.btn69, R.id.btn70, R.id.btn71,
            R.id.btn72, R.id.btn73, R.id.btn74, R.id.btn75, R.id.btn76, R.id.btn77, R.id.btn78,
            R.id.btn79, R.id.btn80, R.id.btn81
    };

    int difficulty = 10;
    final int[][] sudokuFin = new int[9][9];
    final int[][] sudokuSol = new int[9][9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Sudoku sudoku = new Sudoku(9, difficulty);
        sudoku.fillValues();
        copy(sudoku, sudokuSol);
        sudoku.removeKDigits();
        fillGrid(sudoku);
        print2DArray(sudokuSol);

        final Button checkBtn = findViewById(R.id.checkBtn);
        checkBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int btnInt = 0;
                for (int i = 0; i<9; i++)
                {
                    for (int j = 0; j<9; j++)
                    {
                        EditText myText = findViewById(btn_list[btnInt]);
                        String val = myText.getText().toString();
                        int finalVal = Integer.parseInt(val);
                        sudoku.setValue(i, j, finalVal);
                        copy(sudoku, sudokuFin);
                        btnInt++;
                    }
                }
                if (equal(sudokuFin, sudokuSol))
                {
                    TextView textView = findViewById(R.id.condition);
                    textView.setText("Congratulations, You Win!!");
                }
                else
                {
                    TextView textView = findViewById(R.id.condition);
                    textView.setText("Congratulations, You Lose!!");
                }

            }
        });

    }

    void fillGrid(Sudoku sudoku) {
        int btnInt = 0;
        for (int i = 0; i<9; i++)
        {
            for (int j = 0; j<9; j++)
            {
                EditText myButton = findViewById(btn_list[btnInt]);
                if(sudoku.getValue(i, j) == 0)
                {
                    myButton.setText("");
                }
                else
                {
                    myButton.setText(String.valueOf(sudoku.getValue(i, j)));
                }

                btnInt++;
            }
        }
    }

    public void copy(Sudoku sudoku, int[][] sudokuSol) {

        for(int i=0; i<sudokuSol.length; i++)
        {
            for(int j=0; j<sudokuSol[i].length; j++)
            {
                sudokuSol[i][j]=sudoku.getValue(i, j);
            }
        }
    }

    public boolean equal(int[][] sudFin, int[][] sudSol) {

        for(int i=0; i<sudSol.length; i++)
        {
            for(int j=0; j<sudSol[i].length; j++)
            {
                if (sudSol[i][j] != sudFin[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    public void print2DArray(int[][] mat)
    {
        for (int i = 0; i<9; i++)
        {
            for (int j = 0; j<9; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

