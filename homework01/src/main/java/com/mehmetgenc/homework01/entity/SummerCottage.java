package com.mehmetgenc.homework01.entity;

public class SummerCottage  extends Residence {
    public SummerCottage(Integer id, Double price, Double squareMeter, Integer numberOfRooms, Integer numberOfLivingRooms) {
        super(id, price, squareMeter, numberOfRooms, numberOfLivingRooms);
        this.residenceType = ResidenceType.SummerCottage;
    }
}