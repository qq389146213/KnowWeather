package com.silencedut.knowweather.api;

import com.silencedut.knowweather.entity.AqiEntity;
import com.silencedut.knowweather.entity.HeWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by SilenceDut on 16/10/28.
 */

public interface NetWeatherApi {

    String sHeyWeatherKey = "ed50836662bc435eab798583776a4a30";

    @GET("weather")
    Call<HeWeather> getWeather(@Query("key") String key, @Query("location") String location);

    @GET("air/now")
    Call<AqiEntity> getAqi(@Query("key") String key, @Query("location") String location);
}
