package test.spring.security.serivce.implement;

import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.jwt.*;
import org.springframework.stereotype.Service;
import test.spring.security.entity.UserEntity;
import test.spring.security.serivce.JwtService;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class JwtServiceImplement implements JwtService {

    private final JwtEncoder jwtEncoder;

    @Override
    public String generateToken(UserEntity userEntity) {
        Instant now = Instant.now();
        JwtClaimsSet claims = JwtClaimsSet.builder()
                .issuer("http://localhost:8080")  // Tên ứng dụng của bạn
                .issuedAt(now)
                .expiresAt(now.plusSeconds(3600)) // Token hết hạn sau 1 giờ
                .subject(userEntity.getUserName())
                .claim("Role", userEntity.getRole())
                .build();
        JwsHeader jwsHeader = JwsHeader.with(() -> "HS256").build();
        Jwt jwt = jwtEncoder.encode(JwtEncoderParameters.from(jwsHeader, claims));
        return jwt.getTokenValue();

        //return jwtEncoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
    }

}
