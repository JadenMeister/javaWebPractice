package com.example.javaWebPractice.entity;


@Entity
@Table(name = "users")
public class User {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;
    private String role;
}
