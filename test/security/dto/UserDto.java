package test.security.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private String username;
    @Enumerated(EnumType.STRING)
    private Role role;
}

