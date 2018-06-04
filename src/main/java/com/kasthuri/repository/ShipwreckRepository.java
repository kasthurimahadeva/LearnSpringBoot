package com.kasthuri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kasthuri.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
