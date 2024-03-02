package com.mehmetgenc.homework03.service;

import com.mehmetgenc.homework03.model.Weather;
import com.mehmetgenc.homework03.model.WeatherResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherService {

    public Weather getWeather(WeatherResponse response) {

        Weather weather = new Weather();
        weather.setCity(response.getName());
        weather.setTemperature(response.getMain().getTemp() -273.15 );
        weather.setWindSpeed(response.getWind().getSpeed());
        weather.setHumidity(response.getMain().getHumidity());
        weather.setDescription(response.getWeather()[0].getDescription());
        weather.setPressure(response.getMain().getPressure());

        return weather;
    }
}
