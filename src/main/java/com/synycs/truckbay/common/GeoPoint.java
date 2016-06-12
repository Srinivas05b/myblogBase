package com.synycs.truckbay.common;

/**
 * Created by hadoop on 19/08/15.
 */
public class GeoPoint {
    private double latitude;
    private double longitude;
   public GeoPoint(){

    }
    public GeoPoint(double latitude,double longitude){
        this.latitude=latitude;
        this.longitude=longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

}
