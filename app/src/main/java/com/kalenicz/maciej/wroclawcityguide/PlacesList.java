package com.kalenicz.maciej.wroclawcityguide;

import java.util.ArrayList;

/**
 * Created by maciej on 30.12.2017.
 */

public class PlacesList {

    public static ArrayList<Places> getSights(){
        ArrayList<Places> sights;
        sights = new ArrayList<>();
        sights.add(new Places("Market Square", "The heart of a pedestrian zone. The square is rectangular with the dimensions 213 by 178 metres.", R.drawable.rynek));
        sights.add(new Places("Racławice Panorama", "The Racławice Panorama is a monumental (15 × 114 meter) cycloramic painting depicting the Battle of Racławice, during the Kościuszko Uprising.", R.drawable.panorama));
        return sights;
    }

    public static ArrayList<Places> getRelax(){
        ArrayList<Places> relax;
        relax = new ArrayList<>();
        relax.add(new Places("Crossfit Black Star", "CrossFit Black Star is a place with passionate approach to physical activity, health and nutrition.", R.drawable.crossfit));
        relax.add(new Places("Aquapark Wroclaw", "Aquapark Wrocław opened in February 2008. Until today it remains one of the best and most frequently visited water parks in Europe.", R.drawable.aquapark));
        return relax;
    }

    public static ArrayList<Places> getDining(){
        ArrayList<Places> dining;
        dining = new ArrayList<>();
        dining.add(new Places("Pasibus", "The best of the best burgers in Wroclaw!", R.drawable.pasibus));
        dining.add(new Places("Pizzeria Si", "Real italian Pizza, you have to try !", R.drawable.pizzeria_si));
        return dining;
    }

    public static ArrayList<Places> getHotels(){
        ArrayList<Places> hotels;
        hotels = new ArrayList<>();
        hotels.add(new Places("Wroclove Apartment", "Confortable apartment in center of Wroclaw", R.drawable.apartment));
        return hotels;
    }
}
