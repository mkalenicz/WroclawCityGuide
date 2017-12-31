package com.kalenicz.maciej.wroclawcityguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_hotels, container, false);

        ArrayList<Places> hotels = PlacesList.getHotels();
        PlacesAdapter hotelsAdapter = new PlacesAdapter(getActivity(), hotels);

        // Attach the adapter to a ListView
        ListView listViewHotels = view.findViewById(R.id.list_hotels);
        listViewHotels.setAdapter(hotelsAdapter);

        return view;
    }
}
