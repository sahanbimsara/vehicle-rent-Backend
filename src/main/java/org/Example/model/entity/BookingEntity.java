package org.Example.model.entity;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class BookingEntity {

    private Long id;
    private String bookingStatus;
    private  String startDate;
    private String endDate;
    private Double totalAmont;
}
