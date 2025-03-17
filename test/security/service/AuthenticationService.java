package test.security.service;

import test.security.model.RegisterRequest;
import test.security.model.AuthenticationResponse;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);
}
