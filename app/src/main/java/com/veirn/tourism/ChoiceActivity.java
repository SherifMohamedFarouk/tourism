package com.veirn.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ChoiceActivity extends AppCompatActivity {

    @BindView(R.id.toursist)
    ImageButton toursist;
    @BindView(R.id.hotels)
    ImageButton hotels;
    @BindView(R.id.Resturant)
    ImageButton Resturant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.toursist, R.id.hotels, R.id.Resturant})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.toursist:
                Intent intent = new Intent(ChoiceActivity.this , MainActivity.class);
                startActivity(intent);
                break;
            case R.id.hotels:
                break;
            case R.id.Resturant:
                break;
        }
    }
}
