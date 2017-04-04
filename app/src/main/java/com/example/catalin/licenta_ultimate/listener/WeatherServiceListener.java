package com.example.catalin.licenta_ultimate.listener;

import com.example.catalin.licenta_ultimate.data.Channel;

public interface WeatherServiceListener {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
