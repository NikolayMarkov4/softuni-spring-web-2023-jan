package com.softuni.thymeleafvalidation.domain.entities;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // – a char sequence

    @Column(precision = 15, scale = 2)
    private BigDecimal budget; // – a number. (must be a positive number). Cannot be null.

    @Column(columnDefinition = "TEXT")
    private String description; // – a very long char sequence. Cannot be null. Must be at least 10 characters.

    @Column
    private String name; // – a char sequence. Must be unique and cannot be null. Must be between 2 and 10 characters.

    @Column
    private String town; // – a char sequence. Cannot be null. Must be between 2 and 10 characters.

}
