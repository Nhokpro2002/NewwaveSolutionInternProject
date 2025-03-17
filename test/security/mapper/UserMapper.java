package test.security.mapper;

import test.security.dto.UserDto;
import test.security.entity.User;

public class UserMapper {
    public static UserDto mapToUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getUserId());
        userDto.setUsername(user.getUsername());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setRole(user.getRole());
        return userDto;
    }
}
