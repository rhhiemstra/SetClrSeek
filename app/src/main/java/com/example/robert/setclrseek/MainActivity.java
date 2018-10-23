package com.example.robert.setclrseek;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    SeekBar redSB, blueSB, greenSB, alphaSB;
    TextView tv, redTV, blueTV, greenTV, alphaTV;
    Button setClr;

    int red = 100;
    int blue = 100;
    int green = 100;
    int alpha = 255;

    NumberFormat alphaPercent;
    String alphaStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redSB = findViewById(R.id.redSB);
        blueSB = findViewById(R.id.blueSB);
        greenSB = findViewById(R.id.greenSB);
        alphaSB = findViewById(R.id.alphaSB);
        redTV = findViewById(R.id.redTV);
        blueTV = findViewById(R.id.blueTV);
        greenTV = findViewById(R.id.greenTV);
        alphaTV = findViewById(R.id.alphaTV);

        tv = findViewById(R.id.tv);
        setClr = findViewById(R.id.setClr);

        alphaPercent=NumberFormat.getPercentInstance();


        tv.setBackgroundColor(Color.rgb(red, green, blue));
        tv.getBackground().setAlpha(alpha);



        redSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                red=redSB.getProgress();
                redTV.setText(String.valueOf(red));
                tv.setBackgroundColor(Color.rgb(red, green, blue));
                tv.getBackground().setAlpha(alpha);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                red=redSB.getProgress();
                redTV.setText(String.valueOf(red));
                tv.setBackgroundColor(Color.rgb(red, green, blue));
                tv.getBackground().setAlpha(alpha);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                red=redSB.getProgress();
                redTV.setText(String.valueOf(red));
                tv.setBackgroundColor(Color.rgb(red, green, blue));
                tv.getBackground().setAlpha(alpha);
            }
        });
        greenSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                green=greenSB.getProgress();
                greenTV.setText(String.valueOf(green));
                tv.setBackgroundColor(Color.rgb(red, green, blue));
                tv.getBackground().setAlpha(alpha);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                green=greenSB.getProgress();
                greenTV.setText(String.valueOf(green));
                tv.setBackgroundColor(Color.rgb(red, green, blue));
                tv.getBackground().setAlpha(alpha);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                green=greenSB.getProgress();
                greenTV.setText(String.valueOf(green));
                tv.setBackgroundColor(Color.rgb(red, green, blue));
                tv.getBackground().setAlpha(alpha);
            }
        });
        blueSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                blue=blueSB.getProgress();
                blueTV.setText(String.valueOf(blue));
                tv.setBackgroundColor(Color.rgb(red, green, blue));
                tv.getBackground().setAlpha(alpha);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                blue=blueSB.getProgress();
                blueTV.setText(String.valueOf(blue));
                tv.setBackgroundColor(Color.rgb(red, green, blue));
                tv.getBackground().setAlpha(alpha);

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                blue=blueSB.getProgress();
                blueTV.setText(String.valueOf(blue));
                tv.setBackgroundColor(Color.rgb(red, green, blue));
                tv.getBackground().setAlpha(alpha);

            }
        });
        alphaSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                alpha=alphaSB.getProgress();
                alphaStr=alphaPercent.format(alpha/255.0);
                alphaTV.setText(alphaStr);
                tv.setBackgroundColor(Color.rgb(red, green, blue));
                tv.getBackground().setAlpha(alpha);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                alpha=alphaSB.getProgress();
                alphaStr=alphaPercent.format(alpha/255.0);
                alphaTV.setText(alphaStr);
                tv.setBackgroundColor(Color.rgb(red, green, blue));
                tv.getBackground().setAlpha(alpha);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                alpha=alphaSB.getProgress();
                alphaStr=alphaPercent.format(alpha/255.0);
                alphaTV.setText(alphaStr);
                tv.setBackgroundColor(Color.rgb(red, green, blue));
                tv.getBackground().setAlpha(alpha);
            }
        });

        setClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                red=redSB.getProgress();
                blue=blueSB.getProgress();
                green=greenSB.getProgress();
                alpha=alphaSB.getProgress();
                tv.setBackgroundColor(Color.rgb(red, green, blue));
                redTV.setText(String.valueOf(red));
                blueTV.setText(String.valueOf(blue));
                greenTV.setText(String.valueOf(green));
                alphaStr=alphaPercent.format(alpha/255.0);
                alphaTV.setText(alphaStr);
                tv.getBackground().setAlpha(alpha);
            }
        });



    }
}
