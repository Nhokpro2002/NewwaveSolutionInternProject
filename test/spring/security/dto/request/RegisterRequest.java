package test.spring.security.dto.request;

import lombok.Getter;
import test.spring.security.entity.Role;

@Getter
public class RegisterRequest {
    private String userName;
    private String password;
    private Role role;

}
