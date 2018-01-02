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

        ArrayList<Places> dining;
        dining = new ArrayList<>();
        dining.add(new Places(getString(R.string.pasibus_name), getString(R.string.pasibus_description), R.drawable.pasibus));
        dining.add(new Places(getString(R.string.pizzeria_si_name), getString(R.string.pizzeria_si_description), R.drawable.pizzeria_si));
        PlacesAdapter diningAdapter = new PlacesAdapter(getActivity(), dining);

        // Attach the adapter to a ListView
        ListView listViewDining = view.findViewById(R.id.list_dining);
        listViewDining.setAdapter(diningAdapter);

        return view;
    }
}
