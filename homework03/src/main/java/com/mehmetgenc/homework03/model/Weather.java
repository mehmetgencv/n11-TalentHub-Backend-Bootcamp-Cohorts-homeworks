package com.mehmetgenc.homework03.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.xml.transform.sax.SAXResult;
import java.lang.reflect.Array;
import java.util.ArrayList;

@Getter
@RequiredArgsConstructor
@Setter

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    private String city;
    private double temperature;
    private String description;
    private double humidity;
    private double windSpeed;
    private double pressure;


}
