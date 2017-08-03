package com.developer.shorabhd.tictactoe;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    char chance = 'X';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b1.getText().toString().equals(""))
                    if(chance == 'X'){
                        chance = 'O';
                        b1.setText("X");
                        b1.setTextColor(Color.BLUE);
                    }
                    else {
                        chance = 'X';
                        b1.setText("O");
                        b1.setTextColor(Color.RED);
                    }
                endGame();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b2.getText().toString().equals(""))
                    if(chance == 'X'){
                        chance = 'O';
                        b2.setText("X");
                        b2.setTextColor(Color.BLUE);
                    }
                    else {
                        chance = 'X';
                        b2.setText("O");
                        b2.setTextColor(Color.RED);
                    }
                endGame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b3.getText().toString().equals(""))
                    if(chance == 'X'){
                        chance = 'O';
                        b3.setText("X");
                        b3.setTextColor(Color.BLUE);
                    }
                    else {
                        chance = 'X';
                        b3.setText("O");
                        b3.setTextColor(Color.RED);
                    }
                endGame();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b4.getText().toString().equals(""))
                    if(chance == 'X'){
                        chance = 'O';
                        b4.setText("X");
                        b4.setTextColor(Color.BLUE);
                    }
                    else {
                        chance = 'X';
                        b4.setText("O");
                        b4.setTextColor(Color.RED);
                    }
                endGame();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b5.getText().toString().equals(""))
                    if(chance == 'X'){
                        chance = 'O';
                        b5.setText("X");
                        b5.setTextColor(Color.BLUE);
                    }
                    else {
                        chance = 'X';
                        b5.setText("O");
                        b5.setTextColor(Color.RED);
                    }
                endGame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b6.getText().toString().equals(""))
                    if(chance == 'X'){
                        chance = 'O';
                        b6.setText("X");
                        b6.setTextColor(Color.BLUE);
                    }
                    else {
                        chance = 'X';
                        b6.setText("O");
                        b6.setTextColor(Color.RED);
                    }
                endGame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b7.getText().toString().equals(""))
                    if(chance == 'X'){
                        chance = 'O';
                        b7.setText("X");
                        b7.setTextColor(Color.BLUE);
                    }
                    else {
                        chance = 'X';
                        b7.setText("O");
                        b7.setTextColor(Color.RED);
                    }
                endGame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b8.getText().toString().equals(""))
                    if(chance == 'X'){
                        chance = 'O';
                        b8.setText("X");
                        b8.setTextColor(Color.BLUE);
                    }
                    else {
                        chance = 'X';
                        b8.setText("O");
                        b8.setTextColor(Color.RED);
                    }
                endGame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b9.getText().toString().equals(""))
                    if(chance == 'X'){
                        chance = 'O';
                        b9.setText("X");
                        b9.setTextColor(Color.BLUE);
                    }
                    else {
                        chance = 'X';
                        b9.setText("O");
                        b9.setTextColor(Color.RED);
                    }
                endGame();
            }
        });
    }

    public boolean endGame(){
        String a,b,c,d,e,f,g,h,i;
        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();
        if((a.equals("X") && b.equals("X") && c.equals("X")) ||
                (d.equals("X") && e.equals("X") && f.equals("X")) ||
                (g.equals("X") && h.equals("X") && i.equals("X")) ||
                (a.equals("X") && d.equals("X") && g.equals("X")) ||
                (b.equals("X") && e.equals("X") && h.equals("X")) ||
                (c.equals("X") && f.equals("X") && i.equals("X")) ||
                (a.equals("X") && e.equals("X") && i.equals("X")) ||
                (c.equals("X") && e.equals("X") && g.equals("X"))) {
            showDialog("Winner 'X' !!");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            return true;
        }
        else if((a.equals("O") && b.equals("O") && c.equals("O")) ||
                (d.equals("O") && e.equals("O") && f.equals("O")) ||
                (g.equals("O") && h.equals("O") && i.equals("O")) ||
                (a.equals("O") && d.equals("O") && g.equals("O")) ||
                (b.equals("O") && e.equals("O") && h.equals("O")) ||
                (c.equals("O") && f.equals("O") && i.equals("O")) ||
                (a.equals("O") && e.equals("O") && i.equals("O")) ||
                (c.equals("O") && e.equals("O") && g.equals("O"))) {
            showDialog("Winner 'O' !!");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            return true;
        }
        else if(!a.equals("") && !b.equals("") && !c.equals("") &&
                !d.equals("") && !e.equals("") && !f.equals("") &&
                !g.equals("") && !h.equals("") && !i.equals("")){
            showDialog("It's a DRAW !!");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            return true;
        }
        return false;
    }

    public void showDialog(String s){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(s+" Do you want to Restart?")
                .setTitle("Game Over")
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                recreate();
            }
        });
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });
        builder.create().show();
    }
}
