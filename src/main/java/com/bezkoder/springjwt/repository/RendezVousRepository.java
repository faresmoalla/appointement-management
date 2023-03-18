package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.RendezVous;


@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {

}
