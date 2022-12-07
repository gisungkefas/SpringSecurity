package com.kefas.SpringSecurity.pojos.user;
import lombok.Data;
@Data
public class SignupRequest {
    private String name;
    private String emailAddress;
    private String password;
}
