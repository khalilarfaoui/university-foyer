package com.example.esprituniv.repository;

import com.example.esprituniv.entities.Bloc;
import com.example.esprituniv.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
    public Bloc findBlocByNomBloc(String nomBloc);


}
