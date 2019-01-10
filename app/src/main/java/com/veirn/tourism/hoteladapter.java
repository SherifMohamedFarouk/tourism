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

public class hoteladapter extends RecyclerView.Adapter<hoteladapter.MyViewHolder> {


        private List<london> list;
        Context Context ;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView name1, litdescp ;
            public ImageView imageView;
            public RatingBar ratingBar;

            public MyViewHolder(View view) {
                super(view);
                name1 = (TextView) view.findViewById(R.id.name1h);
                ratingBar = (RatingBar) view.findViewById(R.id.rateh);
                litdescp = (TextView) view.findViewById(R.id.littledesch);
                imageView = (ImageView)view.findViewById(R.id.Imageh);

            }
        }


        public hoteladapter(List<london> moviesList , Context Context)
        {
            this.Context = Context;
            this.list = moviesList;
        }

        @Override
        public hoteladapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.listitemh, parent, false);

            return new hoteladapter.MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(hoteladapter.MyViewHolder holder, final int position) {

            holder.name1.setText(list.get(position).getName());
            holder.ratingBar.setRating(Float.valueOf(list.get(position).getRating()));
            holder.litdescp.setText(list.get(position).getLittledescrp());

            String g = list.get(position).getName();
            if(g.contains("The Savoy")){
                Glide.with(Context)
                        .load(R.drawable.savoy)
                        .into(holder.imageView);


            }
            else  if(g.contains("The Ritz London")){
                Glide.with(Context)
                        .load(R.drawable.theritz)
                        .into(holder.imageView);


            }
            else  if(g.contains("Corinthia Hotel London")){
                Glide.with(Context)
                        .load(R.drawable.corinthiahotel)
                        .into(holder.imageView);


            }
            else  if(g.contains("Park Plaza Westminster Bridge London")){
                Glide.with(Context)
                        .load(R.drawable.parkplaza)
                        .into(holder.imageView);


            }
            else  if(g.contains("The Langham, London")){
                Glide.with(Context)
                        .load(R.drawable.thelangham)
                        .into(holder.imageView);


            }
            else  if(g.contains("Sofitel London St James")){
                Glide.with(Context)
                        .load(R.drawable.sofitellondon)
                        .into(holder.imageView);


            }
            else  if(g.contains("Hilton London Bankside")){
                Glide.with(Context)
                        .load(R.drawable.hiltonlodon)
                        .into(holder.imageView);


            }
            else  if(g.contains("Ace Hotel")){
                Glide.with(Context)
                        .load(R.drawable.acehotel)
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



