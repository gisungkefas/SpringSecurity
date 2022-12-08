package com.kefas.SpringSecurity.pojos.user;

import lombok.Data;

@Data
public class AuthRequest {
    private String emailAddress;
    private String password;
}
