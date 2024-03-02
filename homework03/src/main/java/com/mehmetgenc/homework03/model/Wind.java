package com.mehmetgenc.homework03.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
@Setter
public class Wind {
    private double speed;
    private int deg;
    private double gust;

}
