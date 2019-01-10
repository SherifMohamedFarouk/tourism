package com.veirn.tourism;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.content.Context;

import com.bumptech.glide.Glide;

import java.util.List;

public class resturantadapter extends RecyclerView.Adapter<resturantadapter.MyViewHolder> {
        private List<london> list;
        Context Context ;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView name1, litdescp ;
            public ImageView imageView;
            public RatingBar ratingBar;

            public MyViewHolder(View view) {
                super(view);
                name1 = (TextView) view.findViewById(R.id.name1r);
                ratingBar = (RatingBar) view.findViewById(R.id.rater);
                litdescp = (TextView) view.findViewById(R.id.littledescr);
                imageView = (ImageView)view.findViewById(R.id.Imager);

            }
        }


        public resturantadapter(List<london> moviesList , Context Context)
        {
            this.Context = Context;
            this.list = moviesList;
        }

        @Override
        public resturantadapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.listitemr, parent, false);

            return new resturantadapter.MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(resturantadapter.MyViewHolder holder, final int position) {

            holder.name1.setText(list.get(position).getName());
            holder.ratingBar.setRating(Float.valueOf(list.get(position).getRating()));
            holder.litdescp.setText(list.get(position).getLittledescrp());

            String g = list.get(position).getName();
            if(g.contains("The Ledbury")){
                Glide.with(Context)
                        .load(R.drawable.theledbury)
                        .into(holder.imageView);


            }
            else  if(g.contains("Gymkhana")){
                Glide.with(Context)
                        .load(R.drawable.gymkhana)
                        .into(holder.imageView);


            }
            else  if(g.contains("St. John")){
                Glide.with(Context)
                        .load(R.drawable.stjhon)
                        .into(holder.imageView);


            }
            else  if(g.contains("The Wolseley")){
                Glide.with(Context)
                        .load(R.drawable.thewolseley)
                        .into(holder.imageView);


            }
            else  if(g.contains("Hawksmoor")){
                Glide.with(Context)
                        .load(R.drawable.hawksmoor)
                        .into(holder.imageView);


            }
            else  if(g.contains("The Clove Club")){
                Glide.with(Context)
                        .load(R.drawable.thecloveclub)
                        .into(holder.imageView);


            }
            else  if(g.contains("Kiln")){
                Glide.with(Context)
                        .load(R.drawable.kiln)
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

