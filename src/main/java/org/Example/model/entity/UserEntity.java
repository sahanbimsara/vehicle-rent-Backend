package org.Example.model.entity;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor


public class UserEntity {

    private Long id;
    private String name;
    private String email;
    private  String phone;
    private String password;
}
