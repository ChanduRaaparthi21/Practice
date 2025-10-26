package com.chandu.ctcp.service;


import com.chandu.ctcp.enums.ComplaintStatus;
import com.chandu.ctcp.model.Complaint;
import com.chandu.ctcp.repository.ComplaintRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ComplaintService {

    private final ComplaintRepository complaintRepository;

    // Customer registers a new complaint
    public Complaint registerComplaint(Complaint complaint) {
        complaint.setStatus(ComplaintStatus.PENDING);
        return complaintRepository.save(complaint);
    }

    // Get complaints for a specific corporate user
    public List<Complaint> getCustomerComplaints(String corporateId) {
        return complaintRepository.findByCorporateId(corporateId);
    }

    // Staff resolves a complaint
    public Complaint resolveComplaint(Long id) {
        Complaint complaint = complaintRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Complaint not found"));

        complaint.setStatus(ComplaintStatus.RESOLVED);
        complaint.setResolvedAt(LocalDateTime.now());
        return complaintRepository.save(complaint);
    }

    // Admin fetches all complaints
    public List<Complaint> getAllComplaints() {
        return complaintRepository.findAll();
    }
}
