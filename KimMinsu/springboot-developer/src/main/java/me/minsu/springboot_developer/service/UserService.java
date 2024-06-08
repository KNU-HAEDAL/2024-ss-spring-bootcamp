package me.minsu.springboot_developer.service;

import lombok.RequiredArgsConstructor;
import me.minsu.springboot_developer.domain.User;
import me.minsu.springboot_developer.dto.AddUserRequest;
import me.minsu.springboot_developer.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Long save(AddUserRequest dto) {
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }
}
