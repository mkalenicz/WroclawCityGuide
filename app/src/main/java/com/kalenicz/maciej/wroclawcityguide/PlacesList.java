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
}
