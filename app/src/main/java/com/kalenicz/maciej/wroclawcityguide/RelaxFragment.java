package com.kalenicz.maciej.wroclawcityguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RelaxFragment extends Fragment {
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate view object
        view = inflater.inflate(R.layout.fragment_relax, container, false);

        ArrayList<Places> relax = PlacesList.getRelax();
        PlacesAdapter relaxAdapter = new PlacesAdapter(getActivity(), relax);

        // Attach the adapter to a ListView
        ListView listViewRelax = view.findViewById(R.id.list_relax);
        listViewRelax.setAdapter(relaxAdapter);

        return view;
    }
}
