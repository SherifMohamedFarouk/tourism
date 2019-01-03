package com.veirn.tourism;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;


import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<london> list = new ArrayList<>() ;
    private RecyclerView recyclerView ;
    private LondonAdapter mAdapter ;
    DividerItemDecoration mDividerItemDecoration;
    LinearLayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new LondonAdapter(list , MainActivity.this);
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
        london tour = new london("Big Ben", "4.5", "London's iconic national timepiece","16-storey Gothic clocktower and national symbol at the Eastern end of the Houses of Parliament.","https://en.wikipedia.org/wiki/Big_Ben");
        list.add(tour);
         tour = new london("London Eye ", "4", "Iconic riverside observation wheel","Huge observation wheel giving passengers a privileged bird's-eye view of the city's landmarks.","https://en.wikipedia.org/wiki/London_Eye");
        list.add(tour);
         tour = new london("Buckingham Palace", "4.5", "Home of the British Queen & State Rooms","Visitors can tour the palace's opulent private and state rooms or watch the changing of the guard.","https://en.wikipedia.org/wiki/Buckingham_Palace");
        list.add(tour);
        tour = new london("Tower of London", "4.6", "Medieval castle housing the Crown Jewels","Centuries of bloody history around a medieval castle, home to Crown Jewels and iconic Beefeaters.","https://en.wikipedia.org/wiki/Tower_of_London");
        list.add(tour);
        tour = new london("Tower Bridge", "5", "Iconic Victorian turreted bridge","Panoramic views from high level walkways and behind-the-scenes access to original lifting machinery.","https://en.wikipedia.org/wiki/Tower_Bridge");
        list.add(tour);
        tour = new london("Palace of Westminster", "4.6", "Iconic home of UK parliament","Neo-Gothic masterpiece and seat of the UK government. Guided tours on Saturdays and in summer.","https://en.wikipedia.org/wiki/Palace_of_Westminster");
        list.add(tour);
        tour = new london("Trafalgar Square", "4.6", "Nelson's Column, fountains & lions","Nelson's Column rises above this iconic square's LED-lit fountains, artworks and lion statues","https://en.wikipedia.org/wiki/Trafalgar_Square");
        list.add(tour);
        tour = new london("River Thames", "4", "Rivers, estuaries, canals, and palaces","The River Thames, known alternatively in parts as the Isis, is a river that flows through southern England including London. At 215 miles, it is the longest ","https://en.wikipedia.org/wiki/River_Thames");
        list.add(tour);
        tour = new london("Westminster Abbey", "4.6", "Gothic church & site for coronations","Protestant abbey hosting daily services and every English and British coronation since 1066.","https://en.wikipedia.org/wiki/Westminster_Abbey_Museum");
        list.add(tour);
        tour = new london("St Paul's Cathedral", "5", "conic cathedral's churchyard & garden","Churchyard and gardens outside Saint Paul's cathedral, with a floor-plan of the original building.","https://en.wikipedia.org/wiki/St_Paul's_Cathedral");
        list.add(tour);
        tour = new london("Hyde Park", "4.6", "Acres of greenery in Central London","Huge green space, home to Diana Memorial Fountain, with boating and swimming in the Serpentine lake.","https://en.wikipedia.org/wiki/Hyde_Park,_London");
        list.add(tour);
        tour = new london("British Museum", "5", "A historian's treasure trove","Huge showcase for global antiquities, including Egyptian mummies and ancient Greek sculptures.","https://en.wikipedia.org/wiki/British_Museum");
        list.add(tour);
        tour = new london("London Bridge", "4.5", "1970s bridge spanning the River Thames","Concrete pedestrian and traffic bridge that gave a major railway station its name.","https://en.wikipedia.org/wiki/London_Bridge");
        list.add(tour);
        tour = new london("Natural History Museum", "4.7", "Natural phenomena & hands-on activities","Landmark museum of animals and natural phenomena, with hands-on exhibits and animatronic dinosaurs.","https://en.wikipedia.org/wiki/Natural_History_Museum,_London");
        list.add(tour);
        tour = new london("National Gallery", "4.7", "Major art from 13th to 19th centuries","Trafalgar Square art museum whose masterworks trace the development of Western European painting.","https://en.wikipedia.org/wiki/National_Gallery");
        list.add(tour);






        mAdapter.notifyDataSetChanged();
    }
}
