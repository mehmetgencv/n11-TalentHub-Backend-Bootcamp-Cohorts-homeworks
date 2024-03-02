package com.mehmetgenc.homework03.client;

import com.mehmetgenc.homework03.model.Weather;
import com.mehmetgenc.homework03.model.WeatherResponse;
import org.json.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "OpenWeatherMap", url = "https://api.openweathermap.org")
public interface OpenWeatherMapClient {

    @GetMapping("/data/2.5/weather")
    WeatherResponse getWeather(@RequestParam("q") String query, @RequestParam("appid") String apiKey);

    @GetMapping("/data/2.5/forecast")
    String getWeatherForecast(@RequestParam("q") String query, @RequestParam("appid") String apiKey);
}