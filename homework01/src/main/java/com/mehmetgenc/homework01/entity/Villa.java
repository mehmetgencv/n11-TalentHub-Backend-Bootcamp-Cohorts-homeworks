package com.mehmetgenc.homework01.entity;

public class Villa  extends Residence {
    public Villa(Integer id, Double price, Double squareMeter, Integer numberOfRooms, Integer numberOfLivingRooms) {
        super(id, price, squareMeter, numberOfRooms, numberOfLivingRooms);
        this.residenceType = ResidenceType.Villa;
    }
}