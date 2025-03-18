package test.spring.security.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.spring.security.dto.request.LoginRequest;
import test.spring.security.dto.request.RegisterRequest;
import test.spring.security.dto.response.AuthenticationResponse;
import test.spring.security.serivce.implement.AuthenticationServiceImplement;

@RestController
@RequestMapping("api/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationServiceImplement authenticationServiceImplement;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest registerRequest) {
        AuthenticationResponse registerResponse = authenticationServiceImplement.register(registerRequest);
        if (registerResponse == null) {
            return ResponseEntity.status(HttpStatus.CREATED).build(); // Check return empty response
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(registerResponse);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        String loginResponse = authenticationServiceImplement.login(loginRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(loginResponse);

    }
}
