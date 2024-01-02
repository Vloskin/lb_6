package com.example.lb_6;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private AnimationDrawable mAnimationDrawable;
    ImageView imageView;
    ImageView imageView2;
    boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button btnfirst = findViewById(R.id.firsAnim);
        final Button btnsecond = findViewById(R.id.secondAnim);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.second_anim);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.first_anim);
        mAnimationDrawable = (AnimationDrawable) imageView.getBackground();
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setBackgroundResource(R.drawable.babochka);
        imageView.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        btnfirst.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v){

                if(flag)
                {
                    flag =!flag;
                    imageView.setVisibility(View.VISIBLE);
                    mAnimationDrawable.start();

                }
                else if(!flag)
                {
                    flag =!flag;
                    imageView.setVisibility(View.INVISIBLE);
                    mAnimationDrawable.stop();
                }

            }
        });

        btnsecond.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v){

                imageView.setVisibility(View.INVISIBLE);
                imageView2.startAnimation(animation);

            }
        });

    }



}