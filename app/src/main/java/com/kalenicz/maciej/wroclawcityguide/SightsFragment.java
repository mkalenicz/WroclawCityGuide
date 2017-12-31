package com.kalenicz.maciej.wroclawcityguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class SightsFragment extends Fragment {
    private static final String TAG = "MyActivity";
    private ListView listView;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate view object
        view = inflater.inflate(R.layout.fragment_sights, container, false);

        ArrayList<Places> placesArrayList = new ArrayList<Places>();
        placesArrayList.add(new Places("Most Grunwaldzki"));

        PlacesAdapter placesAdapter = new PlacesAdapter(getActivity(), placesArrayList);

// Attach the adapter to a ListView
        listView = view.findViewById(R.id.list_sights);
        listView.setAdapter(placesAdapter);

        return view;
    }

}
