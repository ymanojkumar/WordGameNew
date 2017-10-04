package com.example.manu.eightgridwordgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonSubmit = (Button)findViewById(R.id.buttonSubmit);
        final Button button11 = (Button)findViewById(R.id.button11);
        final Button button12 = (Button)findViewById(R.id.button12);
        final Button button13 = (Button)findViewById(R.id.button13);
        final Button button14 = (Button)findViewById(R.id.button14);
        final Button button15 = (Button)findViewById(R.id.button15);
        final Button button16 = (Button)findViewById(R.id.button16);
        final Button button17 = (Button)findViewById(R.id.button17);
        final Button button18 = (Button)findViewById(R.id.button18);


        buttonSubmit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String allchars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                char singleletter[] = new char[26];

                Random gen = new Random();


                for(int i=0;i<12;i++) {
                    singleletter[i] = allchars.charAt(gen.nextInt(allchars.length()));
                    allchars = allchars.replace(String.valueOf(singleletter[i]), "");
                }

                button11.setText(String.valueOf(singleletter[0]));
                button12.setText(String.valueOf(singleletter[1]));
                button13.setText(String.valueOf(singleletter[2]));
                button14.setText(String.valueOf(singleletter[3]));
                button15.setText(String.valueOf(singleletter[4]));
                button16.setText(String.valueOf(singleletter[5]));
                button17.setText(String.valueOf(singleletter[6]));
                button18.setText(String.valueOf(singleletter[7]));
            }});
    }
}
