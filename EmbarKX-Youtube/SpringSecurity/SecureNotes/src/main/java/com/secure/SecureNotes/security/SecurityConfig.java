package com.secure.SecureNotes.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	
	@Bean
	SecurityFilterChain deaultSecurityFilterChain(HttpSecurity httpSecurity) throws Exception{
		
		httpSecurity.authorizeHttpRequests(request->request
				.requestMatchers("/welcome").permitAll()
				.anyRequest().authenticated());
//		httpSecurity.formLogin(withDefaults());
		httpSecurity.sessionManagement(session ->
		session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		httpSecurity.httpBasic(withDefaults());
		return httpSecurity.build();
		
		
	}
	

}
