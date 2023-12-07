package com.beergarden.beergardenbackend.repository;

import com.beergarden.beergardenbackend.model.BeerGardenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerGardenRepository extends JpaRepository<BeerGardenEntity, Long> {
}
