package test.spring.security.serivce;

import test.spring.security.entity.UserEntity;

public interface JwtService {
    String generateToken(UserEntity userEntity);
}
