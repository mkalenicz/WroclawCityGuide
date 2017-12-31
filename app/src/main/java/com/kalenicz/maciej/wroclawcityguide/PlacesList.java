package com.kalenicz.maciej.wroclawcityguide;

import java.util.ArrayList;

/**
 * Created by maciej on 30.12.2017.
 */

public class PlacesList {

    public static ArrayList<Places> getSights(){
        ArrayList<Places> sights;
        sights = new ArrayList<>();
        sights.add(new Places("Most grunwaldzki"));
        return sights;
    }

    public static ArrayList<Places> getRelax(){
        ArrayList<Places> relax;
        relax = new ArrayList<>();
        relax.add(new Places("Crossfit Black Star"));
        return relax;
    }

    public static ArrayList<Places> getDining(){
        ArrayList<Places> dining;
        dining = new ArrayList<>();
        dining.add(new Places("Pasibus"));
        return dining;
    }

    public static ArrayList<Places> getHotels(){
        ArrayList<Places> hotels;
        hotels = new ArrayList<>();
        hotels.add(new Places("Wroclove Apartment"));
        return hotels;
    }
}
