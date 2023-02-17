package com.softuni.thymeleafvalidation.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeControlLer {

    @GetMapping("/add")
    public String getAddPage() {
        return "employee-add";
    }

    @GetMapping("/all")
    public String getAllEmployeesPage() {
        return "employee-all";
    }
}