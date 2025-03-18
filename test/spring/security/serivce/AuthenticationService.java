package test.spring.security.serivce;

import test.spring.security.dto.request.LoginRequest;
import test.spring.security.dto.request.RegisterRequest;
import test.spring.security.dto.response.AuthenticationResponse;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest registerRequest);

    String login(LoginRequest loginRequest);
}
