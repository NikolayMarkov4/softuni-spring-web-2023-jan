package com.softuni.thymeleafvalidation.domain.models;

import com.softuni.thymeleafvalidation.domain.entities.Company;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class CompanyAddModel {

    @NotNull
    @DecimalMin(value = "1")
    @DecimalMax(value = "100000000000000")
    private BigDecimal budget; // – a number. (must be a positive number). Cannot be null.

    @Size(min = 10)
    private String description; // – a very long char sequence. Cannot be null. Must be at least 10 characters.

    @Size(min = 2, max = 10)
    private String name; // – a char sequence. Must be unique and cannot be null. Must be between 2 and 10 characters.

    @Size(min = 2, max = 10)
    private String town; // – a char sequence. Cannot be null. Must be between 2 and 10 characters.

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Company toCompany() {
        return Company.builder()
                .budget(budget)
                .description(description)
                .name(name)
                .town(town)
                .build();
    }
}
