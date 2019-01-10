package com.veirn.tourism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ResturantActivity extends AppCompatActivity {
    private List<london> list = new ArrayList<>() ;
    private RecyclerView recyclerView ;
    private resturantadapter mAdapter ;
    DividerItemDecoration mDividerItemDecoration;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturant);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_viewr);

        mAdapter = new resturantadapter(list , ResturantActivity.this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        mDividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                ((LinearLayoutManager) layoutManager).VERTICAL);
        recyclerView.addItemDecoration(mDividerItemDecoration);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        preparetourData();



    }
    private void preparetourData() {
        london tour = new london("The Ledbury", "4.7", "Modern European restaurant","Chef Brett Graham's innovative cooking, paired with fine wines in a smart, modern setting.","http://www.theledbury.com/contact-2/");
        list.add(tour);
        tour = new london("Gymkhana", "4.6", "Indian restaurant","Tandoor oven roasts, sigri charcoal grills and seasonal curries at Raj-era themed Indian restaurant.","https://gymkhanalondon.com/");
        list.add(tour);
        tour = new london("St. John", "4.6", "Modern British restaurant","Whitewashed ex-smokehouse where Fergus Henderson pioneered the resurgent interest in offal dishes.","https://stjohnrestaurant.com/");
        list.add(tour);
        tour = new london("The Wolseley", "4.6", "European restaurant","Media types descend here for Modern European food, afternoon tea and grand art deco glamour.","https://www.thewolseley.com/");
        list.add(tour);
        tour = new london("Hawksmoor", "5", "Steak house","High-end steak specialist serving British dry-aged T-bone, D-rump and porterhouse, plus seafood.","https://thehawksmoor.com/locations/seven-dials/");
        list.add(tour);
        tour = new london("The Clove Club", "4.6", "British restaurant","Cutting-edge restaurant and bar for innovative British menu using often-overlooked ingredients.","https://thecloveclub.com/");
        list.add(tour);
        tour = new london("Kiln", "4.5", "Thai restaurant","Casual open kitchen cooking noodles & Thai-inspired dishes using wood-burning ovens and grills.","http://www.kilnsoho.com/");
        list.add(tour);


        mAdapter.notifyDataSetChanged();
    }
}