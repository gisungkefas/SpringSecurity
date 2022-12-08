package com.kefas.SpringSecurity.pojos.user;

import com.kefas.SpringSecurity.entities.User;
import lombok.Data;

@Data
public class AuthResponse {
    private String token;
    private User user;
}
