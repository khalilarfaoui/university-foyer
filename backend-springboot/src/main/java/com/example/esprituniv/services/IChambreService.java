package com.example.esprituniv.services;

import com.example.esprituniv.entities.Bloc;
import com.example.esprituniv.entities.Chambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c);

    Chambre updateChambre (Chambre c);

    Chambre retrieveChambre (long idChambre);


    Bloc affecterChambreABloc(List<Long> numChambre, String nomBloc);
}
