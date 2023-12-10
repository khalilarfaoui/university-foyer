package com.example.esprituniv.repository;

import com.example.esprituniv.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
   public Etudiant findEtudiantByNomEtAndPrenomEt(String nomEt, String prenomEt);
}
