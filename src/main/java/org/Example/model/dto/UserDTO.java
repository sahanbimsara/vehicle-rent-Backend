package org.Example.model.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor


public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private  String phone;
    private String password;
}
