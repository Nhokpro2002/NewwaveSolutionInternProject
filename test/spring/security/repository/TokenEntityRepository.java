package test.spring.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.spring.security.entity.TokenEntity;

public interface TokenEntityRepository extends JpaRepository<TokenEntity, Long> {
}
