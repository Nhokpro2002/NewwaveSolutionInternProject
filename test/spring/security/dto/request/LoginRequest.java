package test.spring.security.dto.request;

import lombok.Getter;

@Getter
public class LoginRequest {
    private String userName;
    private String password;
}
