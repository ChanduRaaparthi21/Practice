package com.chandu.ctcp.model;

import com.chandu.ctcp.enums.ComplaintStatus;
import com.chandu.ctcp.enums.ComplaintType;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "complaints")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String corporateId;  // Corporate ID of the customer
    private String userId;  // User ID of the customer

    @Enumerated(EnumType.STRING)
    private ComplaintType complaintType; // Type of issue (LC, Bill, Remittance)

    private String description; // Complaint details

    @Enumerated(EnumType.STRING)
    private ComplaintStatus status = ComplaintStatus.PENDING; // Default status

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime resolvedAt;
}
