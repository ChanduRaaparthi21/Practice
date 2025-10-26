package com.chandu.ctcp.controller;


import com.chandu.ctcp.model.Complaint;
import com.chandu.ctcp.service.ComplaintService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/complaints")
@RequiredArgsConstructor
public class ComplaintController {

    @Autowired
    private  ComplaintService complaintService;

//    // 1️⃣ Customer: Register a complaint
//    @PostMapping("/register")
//    public Complaint registerComplaint(@RequestBody Complaint complaint) {
//        return complaintService.registerComplaint(complaint);
//    }

//    // 2️⃣ Customer: View their own complaints
//    @GetMapping("/{corporateId}")
//    public List<Complaint> getCustomerComplaints(@PathVariable String corporateId) {
//        return complaintService.getCustomerComplaints(corporateId);
//    }

    // 3️⃣ Staff: Resolve a complaint
    @PutMapping("/resolve/{id}")
    public Complaint resolveComplaint(@PathVariable Long id) {
        return complaintService.resolveComplaint(id);
    }

    // 4️⃣ Admin: Fetch all complaints
    @GetMapping("/all")
    public List<Complaint> getAllComplaints() {
        return complaintService.getAllComplaints();
    }
}
