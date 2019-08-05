package com.example.adriana.tourguide;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Adriana on 6/3/2018.
 */

public class PlaceViewHolder extends RecyclerView.ViewHolder
{
    ImageView imageView;
    TextView place_name, place_address, place_phone;

    public PlaceViewHolder(View itemView)
    {
        super(itemView);

        imageView = itemView.findViewById(R.id.locationImageView);
        place_name = itemView.findViewById(R.id.locationNameView);
        place_address = itemView.findViewById(R.id.locationAddressView);
        place_phone = itemView.findViewById(R.id.locationPhoneView);
    }
}
