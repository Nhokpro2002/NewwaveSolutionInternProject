package test.spring.security.mapper;

import test.spring.security.dto.UserDTO;
import test.spring.security.entity.UserEntity;

public class UserMapper {

    public static UserDTO map(UserEntity user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserName(user.getUserName());
        return userDTO;
    }
}
