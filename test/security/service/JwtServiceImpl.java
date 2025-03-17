package test.security.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;
import test.security.entity.User;

import java.security.Key;
import java.time.Instant;
import java.util.Base64;
import java.util.Date;

@Service
public class JwtServiceImpl implements JwtService {

    // Sử dụng một Base64-encoded key hợp lệ (Tạo key mới nếu cần)
    private static final String SECRET_KEY = "lE23G/N8yFjKw9fP7bR0qXUsQYtO1mL2lE23G/N8yFjKw9fP7bR0qXU";

    @Override
    public String generateToken(User user) {
        return Jwts
                .builder()
                .setSubject(user.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 1000)) // Token hết hạn sau 1 giờ
                .signWith(getSignInKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    @Override
    public String extractUsername(String token) {
        Claims claims = extractClaims(token);
        if (claims != null) {
            Date expirationTime = claims.getExpiration();
            boolean isExpired = expirationTime.before(Date.from(Instant.now()));
            if (!isExpired) {
                return claims.getSubject();
            } else return null;
        }
        return null;
    }

    private Claims extractClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(getSignInKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private Key getSignInKey() {
        byte[] keyBytes = Base64.getDecoder().decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
