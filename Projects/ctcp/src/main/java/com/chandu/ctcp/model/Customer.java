package com.chandu.ctcp.model;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    private String corporateId;
    private String userId;
    private String password;

    private String role = "ROLE_CUSTOMER"; // Assigning Role
}
