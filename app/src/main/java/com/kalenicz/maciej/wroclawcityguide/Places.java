package com.kalenicz.maciej.wroclawcityguide;

/**
 * Created by maciej on 30.12.2017.
 */

public class Places {
   public String placeName;
    private String placeDescription;
    private int placeImage;

    public Places(String placeName, String placeDescription, int placeImage) {
        this.placeName = placeName;
        this.placeDescription = placeDescription;
        this.placeImage = placeImage;
    }

    public Places(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public void setPlaceDescription(String placeDescription) {
        this.placeDescription = placeDescription;
    }

    public int getPlaceImage() {
        return placeImage;
    }

    public void setPlaceImage(int placeImage) {
        this.placeImage = placeImage;
    }
}


