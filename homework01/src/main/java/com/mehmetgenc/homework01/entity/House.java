package com.mehmetgenc.homework01.entity;

public class House extends Residence {
    public House(Integer id, Double price, Double squareMeter, Integer numberOfRooms, Integer numberOfLivingRooms) {
        super(id, price, squareMeter, numberOfRooms, numberOfLivingRooms);
    }

    @Override
    public ResidenceType getResidenceType() {
        return ResidenceType.House;
    }
}
