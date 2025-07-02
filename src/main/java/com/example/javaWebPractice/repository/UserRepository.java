package com.example.javaWebPractice.repository;


import com.example.javaWebPractice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //유니크일때 Optional 쓰는게 가장 흔한 패턴

    // 데이터 조회할때만 Optional 사용
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);

    // 중복체크용 (가입 시 검증)
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);


    // 여러개일땐 List
}
