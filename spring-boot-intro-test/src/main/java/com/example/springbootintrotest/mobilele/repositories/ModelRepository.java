package com.example.springbootintrotest.mobilele.repositories;

import com.example.springbootintrotest.mobilele.domain.enitities.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model, String> {
}
