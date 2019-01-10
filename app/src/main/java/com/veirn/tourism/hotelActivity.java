package com.veirn.tourism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class hotelActivity extends AppCompatActivity {
    private List<london> list = new ArrayList<>() ;
    private RecyclerView recyclerView ;
    private hoteladapter mAdapter ;
    DividerItemDecoration mDividerItemDecoration;
    LinearLayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_viewh);

        mAdapter = new hoteladapter(list , hotelActivity.this);
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
        london tour = new london("The Savoy", "4.7", "5-star hotel","Landmark 19th-century lodging with luxe rooms and suites, plus a Gordon Ramsay restaurant and a spa.","https://www.thesavoylondon.com/");
        list.add(tour);
        tour = new london("The Ritz London", "4.6", "5-star hotel","Ornate quarters, some with grand pianos, in a luxurious hotel offering acclaimed dining & a spa.","https://www.theritzlondon.com/");
        list.add(tour);
        tour = new london("Corinthia Hotel London", "4.6", "5-star hotel","Posh hotel with chic quarters, dining and an elegant bar, plus a spa, an indoor pool and a gym.","https://www.corinthia.com/en/hotels/london");
        list.add(tour);
        tour = new london("Park Plaza Westminster Bridge London", "4.6", "5-star hotel","Polished lodging with streamlined rooms, plus refined restaurants, a spa and an indoor pool.","https://www.parkplaza.com/london-hotel-gb-se1-7ut/gbwestmi");
        list.add(tour);
        tour = new london("The Langham, London", "5", "5-star hotel","Refined quarters in an iconic 1865 hotel with French dining & a polished pub, plus an indoor pool.","http://www.langhamhotels.com/en/the-langham/london/?htl=tllon&src=plist&eng=yext&size=na&cid=yext_profile");
        list.add(tour);
        tour = new london("Sofitel London St James", "4.6", "5-star hotel","Chic, posh lodging offering a grand brasserie, a bar and a lounge serving afternoon tea.","https://www.accorhotels.com/gb/hotel-3144-sofitel-london-st-james/index.shtml");
        list.add(tour);
        tour = new london("Hilton London Bankside", "4.5", "5-star hotel","Polished lodging with free Wi-Fi, plus an indoor pool, a sleek restaurant and a hip bar.","https://www3.hilton.com/en/hotels/united-kingdom/hilton-london-bankside-LONSBHI/index.html?WT.mc_id=zELWAKN0EMEA1HI2DMH3LocalSearch4DGGenericx6LONSBHI");
        list.add(tour);
        tour = new london("Ace Hotel", "4", "5-star hotel","Trendy hotel with cool rooms and free Wi-Fi, plus a lobby cafe, a 7th-floor bar and a brasserie.","https://www.acehotel.com/london/");
        list.add(tour);

        mAdapter.notifyDataSetChanged();
    }
}
