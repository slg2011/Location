package com.example.catalin.licenta_ultimate.listener;

import com.example.catalin.licenta_ultimate.data.LocationResult;

public interface GeocodingServiceListener {
    void geocodeSuccess(LocationResult location);

    void geocodeFailure(Exception exception);
}
