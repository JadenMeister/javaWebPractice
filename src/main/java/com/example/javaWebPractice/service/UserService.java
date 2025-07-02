package com.example.javaWebPractice.service;


import com.example.javaWebPractice.dto.request.RegisterRequest;
import com.example.javaWebPractice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.javaWebPractice.entity.User;
import com.example.javaWebPractice.util.PasswordEncoder;


import java.util.DuplicateFormatFlagsException;

@Service
@Transactional

public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmailService emailService;

    public User createUser(RegisterRequest request){
        if(userRepository.existsByUsername(request.getUsername())){
            throw new DuplicateFormatFlagsException("이미 존재하는 사용자 이름");
        }

//        String encodedPassword = PasswordEncoder.encode(RegisterRequest.getPassword());

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());
        user.setRole("USER"); // 기본 역할 설정


        return userRepository.save(user);



    }
}
