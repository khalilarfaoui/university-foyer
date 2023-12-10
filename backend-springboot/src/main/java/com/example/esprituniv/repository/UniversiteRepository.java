package com.example.esprituniv.repository;

import com.example.esprituniv.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {

    public Universite findByNomUniversite(String nom);

    List<Universite> findByFoyerIsNull();

}
