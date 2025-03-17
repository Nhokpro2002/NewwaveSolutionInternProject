package test.security.service;

import test.security.entity.User;

public interface JwtService {
    String generateToken(User user);
    String extractUsername(String token);
}
