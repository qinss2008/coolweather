package com.example.coolweather.gson;

/**
 * Created by Administrator on 2017/10/12 0012.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
