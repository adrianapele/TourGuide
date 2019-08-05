package com.example.adriana.tourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment
{
    public RestaurantsFragment()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);

        ArrayList<MyPlace> places = new ArrayList<>();
        places.add(new MyPlace(getString(R.string.crinul_name), getString(R.string.crinul_address), getString(R.string.crinul_phone_nr), R.drawable.crin));
        places.add(new MyPlace(getString(R.string.corsarul_name), getString(R.string.corsarul_address), getString(R.string.corsarul_phone_nr), R.drawable.corsarul));
        places.add(new MyPlace(getString(R.string.cyrano_name), getString(R.string.cyrano_address), getString(R.string.cyrano_phone_nr), R.drawable.cyrano));
        places.add(new MyPlace(getString(R.string.rivo_name), getString(R.string.rivo_address), getString(R.string.rivo_phone_nr), R.drawable.rivo));
        places.add(new MyPlace(getString(R.string.ciuperca_name), getString(R.string.ciuperca_address), getString(R.string.ciuperca), R.drawable.ciupercarestaurant));
        places.add(new MyPlace(getString(R.string.baretti_name), getString(R.string.barettin_address), getString(R.string.baretti_phone_nr), R.drawable.baretti));
        places.add(new MyPlace(getString(R.string.barrow_name), getString(R.string.barrow_address), getString(R.string.barrow_phone_nr), R.drawable.barrow));

        PlaceAdapter adapter = new PlaceAdapter(getContext(), places);

        RecyclerView recyclerView = (RecyclerView ) view.findViewById(R.id.recyclerViewRestaurants);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
