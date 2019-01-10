package com.veirn.tourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LottieActivity extends AppCompatActivity {
    @BindView(R.id.av_from_code)
    LottieAnimationView avFromCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie);
        ButterKnife.bind(this);
        avFromCode.setAnimation("Plane.json");
        avFromCode.playAnimation();
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(LottieActivity.this, ChoiceActivity.class);
                startActivity(intent);
            }
        }, 2500);
    }
}
