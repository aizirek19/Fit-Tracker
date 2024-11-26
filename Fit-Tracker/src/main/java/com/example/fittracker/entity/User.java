//package com.example.fittracker.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//@Entity
//@Data
//@Table(name = "users")
//public class User implements UserDetails {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false, unique = true)
//    private String username;
//
//    @Column(nullable = false)
//    private String password;
//
//    private boolean enabled;
//
//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id")
//    private Set<UserRole> roles;
//
//    @Override
//    public Collection<UserRole> getAuthorities() {
//        return roles;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//}

