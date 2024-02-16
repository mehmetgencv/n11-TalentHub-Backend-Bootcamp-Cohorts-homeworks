package com.mehmetgenc.homework01.entity;

public class Residence {
    private Integer Id;
    private Double price;
    private Double squareMeter;
    private Integer numberOfRooms;
    private Integer numberOfLivingRooms;
    protected  ResidenceType residenceType;

    public Residence(Integer id, Double price, Double squareMeter, Integer numberOfRooms, Integer numberOfLivingRooms) {
        Id = id;
        this.price = price;
        this.squareMeter = squareMeter;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public ResidenceType getResidenceType() {
        return residenceType;
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

    @Override
    public String toString() {
        return "Residence{" +
                "price=" + price +
                ", squareMeter=" + squareMeter +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfLivingRooms=" + numberOfLivingRooms +
                ", residenceType=" + residenceType +
                '}';
    }
}
