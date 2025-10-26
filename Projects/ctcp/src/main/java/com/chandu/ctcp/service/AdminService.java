package com.chandu.ctcp.service;

import com.chandu.ctcp.model.Admin;
import com.chandu.ctcp.model.Customer;
import com.chandu.ctcp.repository.AdminRepo;
import com.chandu.ctcp.repository.CustomerRepo;
import com.chandu.ctcp.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class AdminService implements UserDetailsService {

    @Autowired
    private AdminRepo adminRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private CustomerRepo customerRepo;

    // ✅ Register Admin
    public Admin addAdmin(Admin admin) {
        admin.setPassword(passwordEncoder.encode(admin.getPassword())); // Encrypt password
        return adminRepo.save(admin);
    }

    // ✅ Authenticate Admin and Generate Token with Role
    public String authenticate(String name, String password, JwtUtil jwtUtil) {
        Optional<Admin> adminOptional = adminRepo.findByName(name);

        if (adminOptional.isPresent()) {
            Admin admin = adminOptional.get();
            if (passwordEncoder.matches(password, admin.getPassword())) {
                return jwtUtil.generateToken(admin.getName(), "ADMIN"); // ✅ Pass "ADMIN" role
            }
        }
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin = adminRepo.findByName(username)
                .orElseThrow(() -> new UsernameNotFoundException("Admin not found!"));
        return new User(admin.getName(), admin.getPassword(), Collections.singletonList(new SimpleGrantedAuthority("ROLE_ADMIN")));
    }

    public String updateAdmin(int intExact, Admin updatedAdmin) {
        Optional<Admin> existingAdminOptional = adminRepo.findById(intExact);
        if (existingAdminOptional.isPresent()) {
            Admin existingAdmin = existingAdminOptional.get();
            existingAdmin.setName(updatedAdmin.getName());
            existingAdmin.setPassword(updatedAdmin.getPassword());
            adminRepo.save(existingAdmin);
            return "Update Successful!";
        }
        return "Update Failed!";
    }

    public List<Admin> findAllAdmins(Admin admin) {

        return adminRepo.findAll();
    }



    public List<Customer> findAllCustomers() {
        return customerRepo.findAll();
    }
}
