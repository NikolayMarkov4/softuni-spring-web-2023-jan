package com.example.springbootintrotest.mobilele.repositories;

import com.example.springbootintrotest.mobilele.domain.enitities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<UserRole, String> {
}
