package org.Example.model.entity;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class PaymentrEntity {

    private Long id;
    private String paymentDate;
    private Double amount;
    private  String paymentMethod;
    private String paymentStatus;

}
