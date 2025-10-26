package com.chandu.ctcp.service;

import com.chandu.ctcp.model.Admin;
import com.chandu.ctcp.model.Staff;
import com.chandu.ctcp.repository.StaffRepo;
import com.chandu.ctcp.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StaffService {

    @Autowired
    private StaffRepo staffRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Staff addStaff(Staff staff) {
        // Encrypt password before saving
        staff.setPassword(passwordEncoder.encode(staff.getPassword()));
        return staffRepo.save(staff);
    }

    public Staff updateStaff(int id, Staff updatedStaff) {
        Optional<Staff> existingStaffOptional = staffRepo.findById(id);
        if (existingStaffOptional.isPresent()) {
            Staff existingStaff = existingStaffOptional.get();
            existingStaff.setName(updatedStaff.getName());
            existingStaff.setRole(updatedStaff.getRole());

            if (updatedStaff.getPassword() != null) {
                existingStaff.setPassword(passwordEncoder.encode(updatedStaff.getPassword())); // Hash password
            }
            return staffRepo.save(existingStaff);
        }
        return null;
    }

    public String authenticate(String name, String password, String role, JwtUtil jwtUtil) {
        Optional<Staff> staffOpt = staffRepo.findByNameAndRole(name, role);

        if (staffOpt.isPresent()) {
            Staff staff = staffOpt.get();
            if (passwordEncoder.matches(password, staff.getPassword())) {
                return jwtUtil.generateToken(staff.getName(), "CUSTOMER"); // ✅ Pass "ROLE_CUSTOMER" role
            }
        }
        return null;
    }
}
