package com.mehmetgenc.homework03.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mehmetgenc.homework03.client.OpenWeatherMapClient;
import com.mehmetgenc.homework03.model.Weather;
import com.mehmetgenc.homework03.model.WeatherResponse;

import org.json.JSONObject;
import com.mehmetgenc.homework03.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    private final OpenWeatherMapClient openWeatherMapClient;
    private final WeatherService weatherService;

    public WeatherController(OpenWeatherMapClient openWeatherMapClient, WeatherService weatherService) {
        this.openWeatherMapClient = openWeatherMapClient;
        this.weatherService = weatherService;
    }

    @GetMapping
    public Weather getWeather(@RequestParam("city") String city, @RequestParam("apiKey") String apiKey) throws JsonProcessingException {
        WeatherResponse apiResponse = openWeatherMapClient.getWeather(city, apiKey);
        Weather weather = weatherService.getWeather(apiResponse);
        return weather;

    }

    @GetMapping("/forecast")
    public String getWeatherForecast(@RequestParam("city") String city, @RequestParam("apiKey") String apiKey) {
        String apiResponse = openWeatherMapClient.getWeatherForecast(city, apiKey);
        Weather weather = weatherService.getWeatherForecast(apiResponse);
        return
    }


}
