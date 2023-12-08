package com.example.lb_6;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.drawable.AnimationDrawable;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;

import android.widget.ImageView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*ImageView animationView = findViewById(R.id.animationView);
        animationView.setBackgroundResource(R.drawable.my_animation);
        AnimationDrawable animationDrawable = (AnimationDrawable) animationView.getBackground();
        animationDrawable.start();*/


        // Анимация падения яблока
        ImageView appleImageView = findViewById(R.id.appleImageView);
        Animation fallAnimation = AnimationUtils.loadAnimation(this, R.anim.fall_animation);
        appleImageView.startAnimation(fallAnimation);
    }
}