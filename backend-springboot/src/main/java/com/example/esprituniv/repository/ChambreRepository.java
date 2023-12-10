package com.example.esprituniv.repository;

import com.example.esprituniv.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    Chambre findChambreByNumeroChambre(Long numChambre);
}
