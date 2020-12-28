package com.example.edtech;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class venueadapter3 extends RecyclerView.Adapter<venueadapter3.MyViewHolder> {

    private ArrayList<String> city ;
    private ArrayList<String> seat;
    private ArrayList<String> ground_name;
    private ArrayList<String> home_ground;

    private Context context;

    public venueadapter3(Context context, ArrayList<String> city, ArrayList<String> seat, ArrayList<String> ground_name, ArrayList<String> home_ground) {
        this.context = context;
        this.city = city ;
        this.seat= seat;
        this.ground_name = ground_name;
        this.home_ground =home_ground;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.ipl_venue_layout3, parent, false);
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // set the data in ite
        holder.city  .setText(city.get(position));
        holder.seat  .setText(seat.get(position));
        holder.ground_name.setText(ground_name.get(position));
        holder.home_ground .setText(home_ground.get(position));

    }


    @Override
    public int getItemCount() {
        return ground_name.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView city,seat,ground_name,home_ground;
        public MyViewHolder(View itemView) {
            super(itemView);

            // get the reference of item view's
            city         = (TextView) itemView.findViewById(R.id.city);
            seat         = (TextView) itemView.findViewById(R.id.seat );
            ground_name  = (TextView) itemView.findViewById(R.id.ground_name);
            home_ground  = (TextView) itemView.findViewById(R.id.home_ground);

        }
    }
}

