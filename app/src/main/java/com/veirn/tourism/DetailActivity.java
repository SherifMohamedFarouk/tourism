package com.veirn.tourism;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class DetailActivity extends AppCompatActivity {
     public TextView textView , descrp  ;
     public ImageView imageView ;
     Context Context ;
     Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Context = DetailActivity.this ;

        london list = getIntent().getParcelableExtra("model");
      textView = (TextView) findViewById(R.id.dname);
      imageView = (ImageView) findViewById(R.id.dimage);
       textView.setText(String.valueOf(list.getName()));
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingbar);
        ratingBar.setRating(Float.valueOf(list.getRating()));
        descrp = (TextView)findViewById(R.id.descrp) ;
        descrp.setText(list.getDescription());
        final String a = list.getWkipdeia();
        button = (Button)findViewById(R.id.wekapdia);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(a);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        String g = list.getName();
        if(g.contains("Big Ben")){
            Glide.with(Context)
                    .load(R.drawable.bigben)
                    .into(imageView);


        }
        else  if(g.contains("London Eye")){
            Glide.with(Context)
                    .load(R.drawable.londoneye)
                    .into(imageView);


        }
        else  if(g.contains("Buckingham Palace")){
            Glide.with(Context)
                    .load(R.drawable.buckinghampalace)
                    .into(imageView);


        }
        else  if(g.contains("Tower of London")){
            Glide.with(Context)
                    .load(R.drawable.toweroflondon)
                    .into(imageView);


        }
        else  if(g.contains("Tower Bridge")){
            Glide.with(Context)
                    .load(R.drawable.towerbridge)
                    .into(imageView);


        }
        else  if(g.contains("Palace of Westminster")){
            Glide.with(Context)
                    .load(R.drawable.palaceofwestminster)
                    .into(imageView);


        }
        else  if(g.contains("River Thames")){
            Glide.with(Context)
                    .load(R.drawable.riverthames)
                    .into(imageView);


        }
        else  if(g.contains("Westminster Abbey")){
            Glide.with(Context)
                    .load(R.drawable.westminsterabbey)
                    .into(imageView);


        }
        else  if(g.contains("St Paul's Cathedral")){
            Glide.with(Context)
                    .load(R.drawable.stpaulcathedral)
                    .into(imageView);


        }
        else  if(g.contains("Hyde Park")){
            Glide.with(Context)
                    .load(R.drawable.hydepark)
                    .into(imageView);


        }
        else  if(g.contains("British Museum")){
            Glide.with(Context)
                    .load(R.drawable.britishmuseum)
                    .into(imageView);


        }
        else  if(g.contains("London Bridge")){
            Glide.with(Context)
                    .load(R.drawable.londonbridge)
                    .into(imageView);


        }
        else  if(g.contains("Natural History Museum")){
            Glide.with(Context)
                    .load(R.drawable.naturalhistory)
                    .into(imageView);


        }
        else  if(g.contains("National Gallery")){
            Glide.with(Context)
                    .load(R.drawable.nationalgallery)
                    .into(imageView);


        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.Location:
                london list = getIntent().getParcelableExtra("model");
                String g= list.getName();
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q="+g+" London"));
                startActivity(intent);
                return true;
            case android.R.id.home:
                super.onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



}

