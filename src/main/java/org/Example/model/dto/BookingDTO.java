package org.Example.model.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class BookingDTO {

    private Long id;
    private String bookingStatus;
    private  String startDate;
    private String endDate;
    private Double totalAmont;
}
