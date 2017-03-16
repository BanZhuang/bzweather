package com.example.vivian.bzweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vivian on 2017/3/15.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
