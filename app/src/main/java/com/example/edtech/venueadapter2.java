package com.example.edtech;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class venueadapter2 extends RecyclerView.Adapter<venueadapter2.MyViewHolder> {

    private ArrayList<String> views ;
    private ArrayList<String> headline;
    private ArrayList<String> spokenBy;


    private Context context;

    public venueadapter2(Context context, ArrayList<String> views, ArrayList<String> headline, ArrayList<String> spokenBy) {
        this.context = context;
        this.views = views ;
        this.headline= headline;
        this.spokenBy = spokenBy;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.ipl_venue_layout2, parent, false);
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // set the data in ite
        holder.views  .setText(views.get(position));
        holder.headline  .setText(headline.get(position));
        holder.spokenBy.setText(spokenBy.get(position));


    }


    @Override
    public int getItemCount() {
        return views.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView views,headline,spokenBy;
        public MyViewHolder(View itemView) {
            super(itemView);

            // get the reference of item view's
            views         = (TextView) itemView.findViewById(R.id.views);
            headline         = (TextView) itemView.findViewById(R.id.headline );
            spokenBy         = (TextView) itemView.findViewById(R.id.spokenBy );


        }
    }
}

