package com.example.springbootintrotest.mobilele.repositories;

import com.example.springbootintrotest.mobilele.domain.enitities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<Offer, String> {
}
