package com.mehmetgenc.homework03.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
@Setter
public class SysT {
    private int type;
    private int id;
    private String country;
    private long sunrise;
    private long sunset;
}
