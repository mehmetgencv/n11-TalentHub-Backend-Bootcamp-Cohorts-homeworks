package com.mehmetgenc.homework01;

import com.mehmetgenc.homework01.entity.*;
import com.mehmetgenc.homework01.service.ResidenceService;

import java.util.ArrayList;
import java.util.List;


public class Homework01Application {

	public static void main(String[] args) {
		List<Residence> exampleResidenceList = new ArrayList<>();

		exampleResidenceList.add(new House(1, 1200.0, 100.0, 1, 1));
		exampleResidenceList.add(new House(2, 2040.0, 2500.0, 3, 2));
		exampleResidenceList.add(new House(3, 3090.0, 3050.0, 3, 2));
		exampleResidenceList.add(new House(1, 1200.0, 150.0, 1, 1));

		exampleResidenceList.add(new Villa(1, 1080.0, 1200.0, 5, 1));
		exampleResidenceList.add(new Villa(2, 2070.0, 2400.0, 6, 2));
		exampleResidenceList.add(new Villa(3, 3006.0, 3300.0, 7, 2));

		exampleResidenceList.add(new SummerCottage(1, 15500.0, 1700.0, 1, 1));
		exampleResidenceList.add(new SummerCottage(2, 2005.0, 2400.0, 2, 0));
		exampleResidenceList.add(new SummerCottage(3, 3050.0, 3050.0, 3, 1));
		ResidenceService residenceService = new ResidenceService(exampleResidenceList);

		System.out.println("Application Started");
		System.out.println("------------------------------------------------------------");

		System.out.printf("The total price of Houses: %s%n", residenceService.getTotalPriceByResidenceType(ResidenceType.House));
		System.out.printf("The total price of Villas: %s%n", residenceService.getTotalPriceByResidenceType(ResidenceType.Villa));
		System.out.printf("The total price of Summer Cottages: %s%n", residenceService.getTotalPriceByResidenceType(ResidenceType.SummerCottage));
		System.out.printf("The total price of all residences: %s%n", residenceService.getTotalPriceAllResidences());
		System.out.println("------------------------------------------------------------");

		System.out.printf("The average square meter of Houses: %s%n", residenceService.getAverageSquareMetersByResidenceType(ResidenceType.House));
		System.out.printf("The average square meter of Villas: %s%n", residenceService.getAverageSquareMetersByResidenceType(ResidenceType.Villa));
		System.out.printf("The average square meter of Summer Cottages: %s%n", residenceService.getAverageSquareMetersByResidenceType(ResidenceType.SummerCottage));
		System.out.printf("The average square meter of all residences: %s%n", residenceService.getAverageSquareMetersAllResidences());
		System.out.println("------------------------------------------------------------");

		List<Residence> filteredExample1 = residenceService.filterResidencesByRoomAndLivingRoom(ResidenceType.House, 1,1);
		List<Residence> filteredExample2 = residenceService.filterResidencesByRoomAndLivingRoom(ResidenceType.Villa, 5,1);
		List<Residence> filteredExample3 = residenceService.filterResidencesByRoomAndLivingRoom(ResidenceType.SummerCottage, 2,1);

		System.out.println("Filter Houses to 1 Room and 1 Living Room");
		if (filteredExample1.isEmpty()) {
			System.out.println("Not found");
		} else {
			filteredExample1.forEach(System.out::println);
		}

		System.out.println("Filter Villa to 5 Room and 1 Living Room");
		if (filteredExample2.isEmpty()) {
			System.out.println("Not found");
		} else {
			filteredExample2.forEach(System.out::println);
		}

		System.out.println("Filter SummerCottage to 2 Room and 1 Living Room");
		if (filteredExample3.isEmpty()) {
			System.out.println("Not found");
		} else {
			filteredExample3.forEach(System.out::println);
		}
	}

}
