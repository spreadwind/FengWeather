package com.example.h.fengweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by H on 2017/8/10.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    public Sport sport;

    @SerializedName("drsg")
    public Dress dress;

    public Flu flu;

    @SerializedName("cw")
    public CarWash carWash;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }
    public class Sport {
        @SerializedName("txt")
        public String info;
    }
    public class Dress {
        @SerializedName("txt")
        public String info;
    }
    public class Flu {
        @SerializedName("txt")
        public String info;
    }
    public class CarWash {
        @SerializedName("txt")
        public String info;
    }
}
