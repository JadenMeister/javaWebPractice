package com.example.javaWebPractice.service;


import com.example.javaWebPractice.dto.request.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.DuplicateFormatFlagsException;

@Service
@Transactional

public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmailService emailService;

    public User createUser(RegisterRequest RegisterRequest){
        if(userRepository.exitsByUsername(RegisterRequest.getUsername())){
            throw new DuplicateFormatFlagsException("이미 존재하는 사용자 이름");
        }

        String encodedPassword = PasswordEncoder.encode(RegisterRequest.getPassword());




    }
}
