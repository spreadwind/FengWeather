package com.example.h.fengweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by H on 2017/8/10.
 */

public class Basic {
    @SerializedName("city")
    public  String cityName;
    @SerializedName("id")
    public String weathingId;
    public Update update;
    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
