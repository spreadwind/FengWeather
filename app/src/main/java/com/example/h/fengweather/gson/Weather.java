package com.example.h.fengweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by H on 2017/8/10.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forcecast> forcecastList;
}
