package test.spring.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.spring.security.entity.UserEntity;

import java.util.Optional;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUserName(String userName);
}
