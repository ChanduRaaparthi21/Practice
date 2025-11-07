package com.example.notes.service;
import com.example.notes.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {
  private final UserRepository repo;
  public CustomUserDetailsService(UserRepository repo){ this.repo = repo; }
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    var user = repo.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
    return org.springframework.security.core.userdetails.User.withUsername(user.getUsername())
           .password(user.getPassword())
           .authorities(Collections.singleton(new SimpleGrantedAuthority(user.getRole().name())))
           .build();
  }
}
