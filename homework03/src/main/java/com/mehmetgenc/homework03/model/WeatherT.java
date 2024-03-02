package com.mehmetgenc.homework03.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherT {
    private int id;
    private String main;
    private String description;
    private String icon;
}
