package com.veirn.tourism;

import android.content.Context;
import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class LondonAdapter extends RecyclerView.Adapter<LondonAdapter.MyViewHolder> {

        private List<london> list;
        Context Context ;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView name1, litdescp ;
            public ImageView imageView;
            public RatingBar ratingBar;

            public MyViewHolder(View view) {
                super(view);
                name1 = (TextView) view.findViewById(R.id.name1);
               ratingBar = (RatingBar) view.findViewById(R.id.rate);
                litdescp = (TextView) view.findViewById(R.id.littledesc);
                imageView = (ImageView)view.findViewById(R.id.Image);

            }
        }


        public LondonAdapter(List<london> moviesList , Context Context)
        {
            this.Context = Context;
            this.list = moviesList;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.listitem, parent, false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, final int position) {

            holder.name1.setText(list.get(position).getName());
            holder.ratingBar.setRating(Float.valueOf(list.get(position).getRating()));
            holder.litdescp.setText(list.get(position).getLittledescrp());

            String g = list.get(position).getName();
            if(g.contains("Big Ben")){
                Glide.with(Context)
                        .load(R.drawable.bigben)
                        .into(holder.imageView);


            }
            else  if(g.contains("London Eye")){
                Glide.with(Context)
                        .load(R.drawable.londoneye)
                        .into(holder.imageView);


            }
            else  if(g.contains("Buckingham Palace")){
                Glide.with(Context)
                        .load(R.drawable.buckinghampalace)
                        .into(holder.imageView);


            }
            else  if(g.contains("Tower of London")){
                Glide.with(Context)
                        .load(R.drawable.toweroflondon)
                        .into(holder.imageView);


            }
            else  if(g.contains("Tower Bridge")){
                Glide.with(Context)
                        .load(R.drawable.towerbridge)
                        .into(holder.imageView);


            }
            else  if(g.contains("Palace of Westminster")){
                Glide.with(Context)
                        .load(R.drawable.palaceofwestminster)
                        .into(holder.imageView);


            }
            else  if(g.contains("River Thames")){
                Glide.with(Context)
                        .load(R.drawable.riverthames)
                        .into(holder.imageView);


            }
            else  if(g.contains("Westminster Abbey")){
                Glide.with(Context)
                        .load(R.drawable.westminsterabbey)
                        .into(holder.imageView);


            }
            else  if(g.contains("St Paul's Cathedral")){
                Glide.with(Context)
                        .load(R.drawable.stpaulcathedral)
                        .into(holder.imageView);


            }
            else  if(g.contains("Hyde Park")){
                Glide.with(Context)
                        .load(R.drawable.hydepark)
                        .into(holder.imageView);


            }
            else  if(g.contains("British Museum")){
                Glide.with(Context)
                        .load(R.drawable.britishmuseum)
                        .into(holder.imageView);


            }
            else  if(g.contains("London Bridge")){
                Glide.with(Context)
                        .load(R.drawable.londonbridge)
                        .into(holder.imageView);


            }
            else  if(g.contains("Natural History Museum")){
                Glide.with(Context)
                        .load(R.drawable.naturalhistory)
                        .into(holder.imageView);


            }
            else  if(g.contains("National Gallery")){
                Glide.with(Context)
                        .load(R.drawable.nationalgallery)
                        .into(holder.imageView);


            }
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(Context, DetailActivity.class).putExtra("model",list.get(position));
                    Context.startActivity(intent);



                }
            });
        }


        @Override
        public int getItemCount() {
            return list.size();
        }
    }

