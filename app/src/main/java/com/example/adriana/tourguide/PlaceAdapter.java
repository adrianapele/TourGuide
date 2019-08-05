package com.example.adriana.tourguide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Adriana on 6/3/2018.
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceViewHolder>
{
    private Context context;
    private List<MyPlace> places;

    public PlaceAdapter(Context context, List<MyPlace> places)
    {
        this.context = context;
        this.places = places;
    }

    @Override
    public PlaceViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list, null);

        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PlaceViewHolder holder, int position)
    {
        MyPlace currentPlace = places.get(position);

        holder.place_name.setText(currentPlace.getName());
        holder.place_address.setText(currentPlace.getAddress());
        holder.place_phone.setText(currentPlace.getPhone());
        holder.imageView.setImageResource(currentPlace.getImgResource());
    }

    @Override
    public int getItemCount()
    {
        return places.size();
    }
}
