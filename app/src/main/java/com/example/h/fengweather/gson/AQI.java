package com.example.h.fengweather.gson;

/**
 * Created by H on 2017/8/10.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
