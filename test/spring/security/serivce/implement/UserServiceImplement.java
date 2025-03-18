package test.spring.security.serivce.implement;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.spring.security.dto.UserDTO;
import test.spring.security.entity.UserEntity;
import test.spring.security.mapper.UserMapper;
import test.spring.security.repository.UserEntityRepository;
import test.spring.security.serivce.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImplement implements UserService {

    private final UserEntityRepository userEntityRepository;

    public UserDTO getUser(Long userId) {
        UserEntity userEntity =  userEntityRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return UserMapper.map(userEntity);
    }

}
