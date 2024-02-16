package com.mehmetgenc.homework01.entity;

public class Residence {
    private Integer Id;
    private Double price;
    private Double squareMeter;
    private Integer numberOfRooms;
    private Integer numberOfLivingRooms;
    private ResidenceType residenceType;

    public ResidenceType getResidenceType() {
        return residenceType;
    }

    public void setResidenceType(ResidenceType residenceType) {
        this.residenceType = residenceType;
    }

    public Residence(Integer id, Double price, Double squareMeter, Integer numberOfRooms, Integer numberOfLivingRooms) {
        Id = id;
        this.price = price;
        this.squareMeter = squareMeter;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
    }


    public Integer getId() {
        return Id;
    }

    public Double getPrice() {
        return price;
    }

    public Double getSquareMeter() {
        return squareMeter;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public Integer getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }
}
