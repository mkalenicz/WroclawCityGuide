package com.kalenicz.maciej.wroclawcityguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class SightsFragment extends Fragment {
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate view object
        view = inflater.inflate(R.layout.fragment_sights, container, false);

        ArrayList<Places> sights = PlacesList.getSights();
        PlacesAdapter sightsAdapter = new PlacesAdapter(getActivity(), sights);

        // Attach the adapter to a ListView
        ListView listViewSights = view.findViewById(R.id.list_sights);
        listViewSights.setAdapter(sightsAdapter);

        return view;
    }

}
