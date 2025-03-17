package test.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.security.entity.Token;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {
}
