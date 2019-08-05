package com.example.adriana.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class BuildingsFragment extends Fragment
{
    public BuildingsFragment()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_buildings, container, false);

        ArrayList<MyPlace> places = new ArrayList<>();
        places.add(new MyPlace(getString(R.string.palatul_baroc_name), getString(R.string.palatul_baroc_address), getString(R.string.palattul_baroc_phone_nr), R.drawable.palatbaroc));
        places.add(new MyPlace(getString(R.string.palat_vulturul_name), getString(R.string.palat_vulturul_address), getString(R.string.palat_vulturul_phone_nr), R.drawable.palatvulturul));
        places.add(new MyPlace(getString(R.string.sinagoga_name), getString(R.string.sinagago_address), getString(R.string.sinagoga_phone_nr), R.drawable.sinagoganeologa));

        PlaceAdapter adapter = new PlaceAdapter(getContext(), places);

        RecyclerView recyclerView = (RecyclerView ) view.findViewById(R.id.recyclerViewBuildings);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
