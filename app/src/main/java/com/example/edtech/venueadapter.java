package com.example.edtech;


import android.content.Context;
import android.media.Image;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class venueadapter extends RecyclerView.Adapter<venueadapter.MyViewHolder> {

    private ArrayList<String> city ;
    private ArrayList<String> seat;
    private ArrayList<String> ground_name;
    private ArrayList<String> home_ground;
    private ArrayList<String> start;
    private ArrayList<String> end;
    private ArrayList<Integer> mentorImage;

    private Context context;

    public venueadapter(Context context, ArrayList<String> city, ArrayList<String> seat, ArrayList<String> ground_name,ArrayList<String> home_ground,ArrayList<String> start,ArrayList<String> end,ArrayList<Integer> mentorImage) {
        this.context = context;
        this.city = city ;
        this.seat= seat;
        this.ground_name = ground_name;
        this.home_ground =home_ground;
        this.start =start;
        this.end =end;
        this.mentorImage =mentorImage;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.ipl_venue_layout, parent, false);
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
        holder.start .setText(start.get(position));
        holder.end .setText(end.get(position));
      //  holder.mentorImage .setImageResource(mentorImage.get(position));

    }


    @Override
    public int getItemCount() {
        return ground_name.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView city,seat,ground_name,home_ground,start,end;
        ImageView mentorImage;
        public MyViewHolder(View itemView) {
            super(itemView);

            // get the reference of item view's
            city         = (TextView) itemView.findViewById(R.id.likes);
      //      mentorImage  =  itemView.findViewById(R.id.mentor_image );
            ground_name  = (TextView) itemView.findViewById(R.id.mentor_name);
            home_ground  = (TextView) itemView.findViewById(R.id.designation);
            seat  = (TextView) itemView.findViewById(R.id.slot);
            start  = (TextView) itemView.findViewById(R.id.start_time);
            end  = (TextView) itemView.findViewById(R.id.end_time);

        }
    }
}

