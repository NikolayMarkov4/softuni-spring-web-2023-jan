package com.softuni.thymeleafvalidation.repositories;

import com.softuni.thymeleafvalidation.domain.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
