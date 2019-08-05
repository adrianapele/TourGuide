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

public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_museums, container, false);

        ArrayList<MyPlace> places = new ArrayList<>();
        places.add(new MyPlace(getString(R.string.muzeul_tarii_name), getString(R.string.muzeul_tarii_address), getString(R.string.muzeul_tarii_phone_nr), R.drawable.museutarii));
        places.add(new MyPlace(getString(R.string.muzeul_iosif_name), getString(R.string.muzeuk_iosif_address), getString(R.string.muzeul_iosif_phone_nr), R.drawable.iosifvulcan));
        places.add(new MyPlace(getString(R.string.muzeul_endre_name), getString(R.string.muzeul_endre_address), getString(R.string.muzeul_endre_phone_nr), R.drawable.adyendre));
        places.add(new MyPlace(getString(R.string.muzeul_lazar_name), getString(R.string.muzeul_lazar_address), getString(R.string.muzeul_lazar_phone_nr), R.drawable.aurellazar));
        places.add(new MyPlace(getString(R.string.muzeul_militar_name), getString(R.string.muzeul_militar_address), getString(R.string.muzeul_militar_phone_nr), R.drawable.muzeumilitar));

        PlaceAdapter adapter = new PlaceAdapter(getContext(), places);

        RecyclerView recyclerView = (RecyclerView ) view.findViewById(R.id.recyclerViewMuseums);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
