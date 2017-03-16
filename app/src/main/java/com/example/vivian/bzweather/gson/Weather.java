package com.example.vivian.bzweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Vivian on 2017/3/15.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast>forecastList;
}
