package com.kalenicz.maciej.wroclawcityguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RelaxFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate view object
        View view = inflater.inflate(R.layout.fragment_relax, container, false);

        ArrayList<Places> relax;
        relax = new ArrayList<>();
        relax.add(new Places(getString(R.string.crossfit_name), getString(R.string.crossfit_description), R.drawable.crossfit));
        relax.add(new Places(getString(R.string.aquapark_name), getString(R.string.aquapark_description), R.drawable.aquapark));
        PlacesAdapter relaxAdapter = new PlacesAdapter(getActivity(), relax);

        // Attach the adapter to a ListView
        ListView listViewRelax = view.findViewById(R.id.list_relax);
        listViewRelax.setAdapter(relaxAdapter);

        return view;
    }
}
