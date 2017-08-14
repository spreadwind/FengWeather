package com.example.h.fengweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by H on 2017/8/10.
 */

public class Forcecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }
    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
