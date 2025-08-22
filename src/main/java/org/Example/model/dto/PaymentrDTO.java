package org.Example.model.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor


public class PaymentrDTO {

    private Long id;
    private String paymentDate;
    private Double amount;
    private  String paymentMethod;
    private String paymentStatus;

}
