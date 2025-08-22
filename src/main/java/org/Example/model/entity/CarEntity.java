package org.Example.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="car")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

   // @OneToMany(mappedBy = "selectedCar", cascade = CascadeType.ALL)
   // private List<>
}
