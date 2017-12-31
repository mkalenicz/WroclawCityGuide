package com.kalenicz.maciej.wroclawcityguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DiningFragment extends Fragment {
private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_dining, container, false);

        ArrayList<Places> dining = PlacesList.getDining();
        PlacesAdapter diningAdapter = new PlacesAdapter(getActivity(), dining);

        // Attach the adapter to a ListView
        ListView listViewDining = view.findViewById(R.id.list_dining);
        listViewDining.setAdapter(diningAdapter);

        return view;
    }
}
