package com.example.h.fengweather.db;

/**
 * Created by H on 2017/8/8.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getcityName() {
        return cityName;
    }
    public void setcityName(String provinceName) {
        this.cityName = cityName;
    }
    public int getCityCode() {
        return cityCode;
    }
    public void setCityCode(int provinceCode) {
        this.cityCode = cityCode;
    }
    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
