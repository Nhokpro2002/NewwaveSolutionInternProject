package test.spring.security.serivce.implement;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import test.spring.security.dto.UserDTO;
import test.spring.security.dto.request.LoginRequest;
import test.spring.security.dto.request.RegisterRequest;
import test.spring.security.dto.response.AuthenticationResponse;
import test.spring.security.entity.Role;
import test.spring.security.entity.TokenEntity;
import test.spring.security.entity.UserEntity;
import test.spring.security.mapper.UserMapper;
import test.spring.security.repository.TokenEntityRepository;
import test.spring.security.repository.UserEntityRepository;
import test.spring.security.serivce.AuthenticationService;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImplement implements AuthenticationService {

    private final UserEntityRepository userEntityRepository;
    private final TokenEntityRepository tokenEntityRepository;
    private final JwtServiceImplement jwtServiceImplement;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    @Override
    public AuthenticationResponse register(RegisterRequest registerRequest) {
        // Kiểm tra xem user đã tồn tại chưa
        Optional<UserEntity> existingUser = userEntityRepository.findByUserName(registerRequest.getUserName());
        if (existingUser.isPresent()) {
            throw new RuntimeException("User already exists!");
        }

        // Tạo user mới và lưu vào database
        UserEntity newUser = UserEntity.builder()
                .userName(registerRequest.getUserName())
                .password(passwordEncoder.encode(registerRequest.getPassword())) // Mã hóa mật khẩu
                .role(Role.USER) // Có thể cho user chọn role thay vì mặc định ADMIN
                .build();

        UserEntity createdUser = userEntityRepository.save(newUser);
        UserDTO newUserDto = UserMapper.map(createdUser);

        return AuthenticationResponse.builder()
                .userDTO(newUserDto)
                .token(null)
                .build();
    }

    @Override
    public String login(LoginRequest loginRequest) {
           UserEntity userEntity = userEntityRepository.findByUserName(loginRequest.getUserName())
                   .orElseThrow(() -> new RuntimeException("User not found!"));

           if (passwordEncoder.matches(loginRequest.getPassword(), userEntity.getPassword())) {
               String jwtToken = jwtServiceImplement.generateToken(userEntity);

               TokenEntity tokenEntity = TokenEntity.builder()
                       .token(jwtToken)
                       .expired(false)
                       .revoked(false)
                       .build();
               tokenEntityRepository.save(tokenEntity);

               return jwtToken;

           }
           return null;

    }

   /* private boolean authenticate(LoginRequest loginRequest) {
        UserEntity userEntity = userEntityRepository.findByUserName(loginRequest.getUserName())
                .orElseThrow(() -> new RuntimeException("User not found"));

        return passwordEncoder.matches(loginRequest.getPassword(), userEntity.getPassword());
    }*/
}
