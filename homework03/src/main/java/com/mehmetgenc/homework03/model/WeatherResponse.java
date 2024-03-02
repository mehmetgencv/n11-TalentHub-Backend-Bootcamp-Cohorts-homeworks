package com.mehmetgenc.homework03.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@Getter
@Setter
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private Coord coord;
    private WeatherT[] weather;
    private String base;
    private MainT main;
    private Integer visibility;
    private Wind wind;
    private Clouds clouds;
    private long dt;
    private SysT sys;
    private Integer timezone;
    private Integer id;
    private String name;
    private Integer cod;
}
