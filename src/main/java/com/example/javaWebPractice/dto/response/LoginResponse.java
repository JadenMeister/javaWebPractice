package com.example.javaWebPractice.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {
    private String token;  // JWT 토큰 또는 세션 ID
    private UserResponse user;  // 로그인한 사용자 정보
    private String message;  // 로그인 성공/실패 메시지
}
