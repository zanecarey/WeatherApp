package com.example.zane.weatherapp.services;

import com.example.zane.weatherapp.data.Channel;
public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}