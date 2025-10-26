package com.chandu.fleet.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.chandu.fleet.filter.JwtAuthFilter;
import com.chandu.fleet.service.EmployeeInfoUserDetailsService;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

	@Autowired
	private JwtAuthFilter authFilter;
	
	
    @Bean
    public UserDetailsService userDetailsService() {
        return new EmployeeInfoUserDetailsService();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable()) // ✅ Disable CSRF for testing
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/bank/hi","/bank/cacheData", "/employee/register","/api/fleet-loan/authenticate","/fleet/repayments/repayment","/actuator/**").permitAll() // ✅ Public access
                        .requestMatchers(HttpMethod.POST, "/bank/create-account").hasRole("ADMIN") // ✅ Only ADMIN can create
                        .requestMatchers("/bank/all-accounts").hasRole("ADMIN") // ✅ Only ADMIN can get all accounts
                        .requestMatchers("/bank/account/**").hasAnyRole("USER", "ADMIN") // ✅ USER & ADMIN can fetch accounts
                        .requestMatchers(HttpMethod.PUT,"/account/update-account/{id}").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE,"/account/delete/{accountNumber}").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.POST, "/api/fleet-loan/apply").hasRole("USER") // ✅ USER can apply for fleet loan
                        .requestMatchers(HttpMethod.GET, "/api/fleet-loan/user/**").hasRole("USER") // ✅ USER can view their loans
                        .requestMatchers(HttpMethod.PUT, "/api/fleet-loan/approve/**").hasRole("ADMIN") // ✅ ADMIN can approve fleet loan
                        .requestMatchers(HttpMethod.PUT, "/api/fleet-loan/reject/**").hasRole("ADMIN") // ✅ ADMIN can reject fleet loan
                        .requestMatchers(HttpMethod.POST, "/fleet/repayments/pay/**").hasAnyRole("USER", "ADMIN") // ✅ Both can make repayments
                        .requestMatchers(HttpMethod.GET, "/fleet/repayments/history/**").hasAnyRole("USER", "ADMIN") // ✅ Both can view repayment history
                        .requestMatchers(HttpMethod.GET, "/Hr/import").hasRole("ADMIN")
                        .anyRequest().authenticated() // ✅ Other requests require authentication
                )
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authenticationProvider(authenticationProvider())
                .addFilterBefore(authFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(userDetailsService());
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        return daoAuthenticationProvider;
    }
    
    
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
    	return  configuration.getAuthenticationManager();
    }
}
