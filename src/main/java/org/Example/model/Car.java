package org.Example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Car {

    private Long id;

    private String brand;

    private String model;

    private String color;

    private String registrationNumber;

    private Integer year;

    private String fuelType;

    private Integer seatCount;

    private String transmission;

    private Double rentalPricePerDay;
}
