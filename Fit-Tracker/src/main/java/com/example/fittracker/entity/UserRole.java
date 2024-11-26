//package com.example.fittracker.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//import org.springframework.security.core.GrantedAuthority;
//
//@Entity
//@Data
//@Table(name = "user_roles")
//public class UserRole implements GrantedAuthority {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String role;
//
//    @Override
//    public String getAuthority() {
//        return role;
//    }
//}
