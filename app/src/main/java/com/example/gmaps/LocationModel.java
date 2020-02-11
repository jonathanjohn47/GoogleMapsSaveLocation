package com.example.gmaps;

public class LocationModel {
    String latitude, longitude, time;

    public LocationModel(String latitude, String longitude, String time) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.time = time;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getTime() {
        return time;
    }
}
