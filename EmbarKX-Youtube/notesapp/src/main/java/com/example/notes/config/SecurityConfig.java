package com.example.notes.config;
import com.example.notes.security.JwtAuthFilter;
import com.example.notes.service.CustomUserDetailsService;
import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.authentication.*;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {
  private final JwtAuthFilter jwtAuthFilter;
  private final CustomUserDetailsService uds;
  public SecurityConfig(JwtAuthFilter f, CustomUserDetailsService u){ this.jwtAuthFilter = f; this.uds = u; }

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.csrf(csrf -> csrf.disable())
        .authorizeHttpRequests(auth -> auth
            .requestMatchers("/api/auth/**","/h2-console/**").permitAll()
            .anyRequest().authenticated()
        )
        .headers(h -> h.frameOptions(f -> f.sameOrigin()))
        .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);
    return http.build();
  }

  @Bean public PasswordEncoder passwordEncoder(){ return new BCryptPasswordEncoder(); }

  @Bean
  public AuthenticationManager authenticationManager(){
    DaoAuthenticationProvider p = new DaoAuthenticationProvider();
    p.setUserDetailsService(uds);
    p.setPasswordEncoder(passwordEncoder());
    return new ProviderManager(p);
  }
}
