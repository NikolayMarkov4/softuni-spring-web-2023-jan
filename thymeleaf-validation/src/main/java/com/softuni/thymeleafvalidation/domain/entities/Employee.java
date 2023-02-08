package com.softuni.thymeleafvalidation.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // – a char sequence

    @Column
    private Date birthdate; // – a date. Cannot be null.

    @Column
    private String educationLevel; // – a char sequence. Cannot be null.

    @Column
    private String firstName; // – a char sequence. Cannot be null. Must be at least 2 characters. Cannot be null.

    @Column
    private String jobTitle; // – a char sequence. Cannot be null.

    @Column
    private String lastName; // – a char sequence. Cannot be null. Must be at least 2 characters. Cannot be null.

    @Column(precision = 19, scale = 2)
    private BigDecimal salary; // – a number (must be a positive number). Cannot be null.

    @OneToOne
    private Company company; // – a number (must be a positive number). Cannot be null.

}
