package com.example.esprituniv.services;

import com.example.esprituniv.entities.Bloc;
import com.example.esprituniv.entities.Chambre;
import com.example.esprituniv.repository.BlocRepository;
import com.example.esprituniv.repository.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ChambreService implements IChambreService{
    ChambreRepository chambreRepository;
    BlocRepository blocRepository;


    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public Bloc affecterChambreABloc(List<Long> numChambre, String nomBloc) {
        //recuperer le bloc
        Bloc bloc = blocRepository.findBlocByNomBloc(nomBloc);
        for ( int i = 0 ; i<numChambre.size(); i++){
            //recuperer chambre
            Chambre chambre = chambreRepository.findChambreByNumeroChambre(numChambre.get(i));
            //afftecter le bloc a chambre
            chambre.setBloc(bloc);
            //enregistrer les midification de la chambre
            chambreRepository.save(chambre);
        }
        return bloc;
    }


}
