package com.kalenicz.maciej.wroclawcityguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by maciej on 30.12.2017.
 */

public class PlacesAdapter  extends ArrayAdapter<Places> {
    public PlacesAdapter(@NonNull Context context, ArrayList<Places> placesArrayList) {
        super(context, 0, placesArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       Places places = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_places, parent, false);
        }

        TextView placeName = convertView.findViewById(R.id.placeName);
        TextView placeDescription = convertView.findViewById(R.id.placeDescription);
        ImageView placeImage = convertView.findViewById(R.id.placeImage);

        placeName.setText(places.getPlaceName());
        placeDescription.setText(places.getPlaceDescription());
        placeImage.setImageResource(places.getPlaceImage());

        return convertView;
    }
}
