package test.security.controller;

import test.security.model.AuthenticationRequest;
import test.security.model.AuthenticationResponse;
import test.security.model.RegisterRequest;
import test.security.service.AuthenticationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/auth")
@RestController
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationServiceImpl authenticationServiceImpl;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest registerRequest
    ) {
        AuthenticationResponse response = authenticationServiceImpl.register(registerRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(
            @RequestBody AuthenticationRequest request)
    {
        AuthenticationResponse response = authenticationServiceImpl.login(request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}