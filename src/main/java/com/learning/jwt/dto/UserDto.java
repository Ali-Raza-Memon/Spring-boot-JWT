package com.learning.jwt.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String password;


}
