package com.softuni.pathfinder.repository;

import com.softuni.pathfinder.domain.entities.Role;
import com.softuni.pathfinder.domain.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
    Optional<Role> findByRole(RoleName role);

    List<Role> findAll();
}
