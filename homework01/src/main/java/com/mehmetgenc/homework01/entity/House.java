package com.mehmetgenc.homework01.entity;

public class House extends Residence {
    public House(Integer id, Double price, Double squareMeter, Integer numberOfRooms, Integer numberOfLivingRooms) {
        super(id, price, squareMeter, numberOfRooms, numberOfLivingRooms);
        this.residenceType = ResidenceType.House;
    }

}
