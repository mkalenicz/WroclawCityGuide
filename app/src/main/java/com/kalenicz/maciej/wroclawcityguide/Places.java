package com.kalenicz.maciej.wroclawcityguide;

/**
 * Created by maciej on 30.12.2017.
 */

public class Places {
   private String placeName;
    private String placeDescription;
    private int placeImage;

    public Places(String placeName, String placeDescription, int placeImage) {
        this.placeName = placeName;
        this.placeDescription = placeDescription;
        this.placeImage = placeImage;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public int getPlaceImage() {
        return placeImage;
    }

}


