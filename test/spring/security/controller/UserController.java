package test.spring.security.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.spring.security.dto.UserDTO;
import test.spring.security.serivce.implement.UserServiceImplement;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserServiceImplement userServiceImplement;

    @GetMapping("/userId/{userId}")
    public UserDTO getUser(@PathVariable Long userId) {
        return userServiceImplement.getUser(userId);
    }

}
