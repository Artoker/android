package com.example.sunrise_savvin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView sunImageview = (ImageView)findViewById(R.id.sun);
        Animation sunRizeAnimation = AnimationUtils.loadAnimation( this, R.anim.sun_rise);

        ImageView clockImageView = (ImageView)findViewById(R.id.clock);
        Animation clockTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn);

        ImageView hourIImageView = (ImageView) findViewById(R.id.hour_hand);
        Animation hourTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_turn);

        sunImageview.startAnimation(sunRizeAnimation);
        clockImageView.startAnimation(clockTurnAnimation);
        hourIImageView.startAnimation(hourTurnAnimation);
    }
}