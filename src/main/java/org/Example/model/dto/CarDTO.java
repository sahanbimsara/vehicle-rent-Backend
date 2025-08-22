package org.Example.model.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor


public class CarDTO {

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
    private boolean available;
    private  Double dailyRate;
}
