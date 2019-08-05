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

public class HotelsFragment extends Fragment
{
    public HotelsFragment()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
       View view = inflater.inflate(R.layout.fragment_hotels, container, false);

        ArrayList<MyPlace> places = new ArrayList<>();
        places.add(new MyPlace(getString(R.string.continental_name), getString(R.string.continental_address), getString(R.string.continental_phone_nr), R.drawable.continental));
        places.add(new MyPlace(getString(R.string.double_tree_name), getString(R.string.double_tree_address), getString(R.string.double_tree_phone_nr), R.drawable.doubletree));
        places.add(new MyPlace(getString(R.string.nevis_name), getString(R.string.nevis_address), getString(R.string.nevis_phone_nr), R.drawable.nevis));
        places.add(new MyPlace(getString(R.string.ramada_name), getString(R.string.ramada_address), getString(R.string.ramada_phone_nr), R.drawable.ramada));
        places.add(new MyPlace(getString(R.string.silver_name), getString(R.string.silver_address), getString(R.string.silver_phone_nr), R.drawable.silver));

        PlaceAdapter adapter = new PlaceAdapter(getContext(), places);

        RecyclerView recyclerView = (RecyclerView ) view.findViewById(R.id.recyclerViewHotels);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

       return view;
    }

}
