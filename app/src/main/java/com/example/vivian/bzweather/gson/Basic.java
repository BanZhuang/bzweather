package com.example.vivian.bzweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vivian on 2017/3/15.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
