package com.chandu.fleet.dto;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.chandu.fleet.entity.Employee;

public class EmployeeInfoUserDetails implements UserDetails {
    private String username;
    private String password;
    private List<GrantedAuthority> authorities;

    public EmployeeInfoUserDetails(Employee employee) {
        this.username = employee.getUsername();
        this.password = employee.getPassword();
        this.authorities = Arrays.stream(employee.getRoles().split(","))
                .map(role -> new SimpleGrantedAuthority("ROLE_" + role.trim())) // ✅ Add "ROLE_" prefix
                .collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }
}
