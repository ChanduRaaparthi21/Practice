package com.chandu.ctcp.repository;




import com.chandu.ctcp.enums.ComplaintStatus;
import com.chandu.ctcp.model.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
    List<Complaint> findByCorporateId(String corporateId);
    List<Complaint> findByStatus(ComplaintStatus status);
}
