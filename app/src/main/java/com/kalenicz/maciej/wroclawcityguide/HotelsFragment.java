package com.kalenicz.maciej.wroclawcityguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hotels, container, false);

        ArrayList<Places> hotels;
        hotels = new ArrayList<>();
        hotels.add(new Places(getString(R.string.wroclove_apartment_name), getString(R.string.wroclove_apartment_description), R.drawable.apartment));
        PlacesAdapter hotelsAdapter = new PlacesAdapter(getActivity(), hotels);

        // Attach the adapter to a ListView
        ListView listViewHotels = view.findViewById(R.id.list_hotels);
        listViewHotels.setAdapter(hotelsAdapter);

        return view;
    }
}
