package com.mehmetgenc.homework01.service;

import com.mehmetgenc.homework01.entity.Residence;
import com.mehmetgenc.homework01.entity.ResidenceType;

import java.util.List;
import java.util.stream.Collectors;

public class ResidenceService {
    private final List<Residence> residenceList;

    public ResidenceService(List<Residence> residenceList) {
        this.residenceList = residenceList;
    }

    public double getTotalPriceByResidenceType(ResidenceType residenceType) {
        return residenceList.stream()
                .filter(residence -> residence.getResidenceType() == residenceType)
                .mapToDouble(Residence::getPrice)
                .sum();
    }

    public double getTotalPriceAllResidences() {
        return residenceList.stream()
                .mapToDouble(Residence::getPrice)
                .sum();
    }

    public Double getAverageSquareMetersByResidenceType(ResidenceType residenceType) {
        return residenceList.stream()
                .filter(residence -> residence.getResidenceType() == residenceType)
                .mapToDouble(Residence::getSquareMeter)
                .average()
                .orElse(0);
    }

    public Double getAverageSquareMetersAllResidences() {
        return residenceList.stream()
                .mapToDouble(Residence::getSquareMeter)
                .average()
                .orElse(0);
    }

    public List<Residence> filterResidencesByRoomAndLivingRoom(ResidenceType residenceType, int numberOfRooms, int numberOfLivingRooms) {
        return residenceList.stream()
                .filter(residence ->
                        residence.getResidenceType() == residenceType &&
                        residence.getNumberOfRooms() == numberOfRooms &&
                        residence.getNumberOfLivingRooms() == numberOfLivingRooms)
                .collect(Collectors.toList());
    }


}
