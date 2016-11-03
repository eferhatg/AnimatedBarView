package com.eferhatg.animatedbarview;

import android.graphics.Color;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.eferhatg.core.AnimatedBarView;

public class MainActivity extends AppCompatActivity {


    AnimatedBarView animatedBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        animatedBar = (AnimatedBarView) findViewById(R.id.AnimatedBarView);

        animatedBar.setRightValue(60);
        animatedBar.setLeftValue(40);

        animatedBar.setTitleList("X List");
        animatedBar.setRightBarColor(Color.MAGENTA);


        animatedBar.showResult();

        LinearLayout layout = (LinearLayout) findViewById(R.id.ll);
        Animation scaleAnimation = AnimationUtils.loadAnimation(this
                , R.anim.scale_anim);
        layout.startAnimation(scaleAnimation);



    }
}
