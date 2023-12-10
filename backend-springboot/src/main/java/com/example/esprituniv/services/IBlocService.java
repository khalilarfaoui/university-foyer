package com.example.esprituniv.services;

import com.example.esprituniv.entities.Bloc;
import com.example.esprituniv.entities.Chambre;
import com.example.esprituniv.entities.Foyer;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveBlocs();

    Bloc updateBloc (Bloc bloc);

    Bloc addBloc (Bloc bloc);

    Bloc retrieveBloc (long idBloc);


    Foyer addFoyerWithBloc(Foyer f);
}
