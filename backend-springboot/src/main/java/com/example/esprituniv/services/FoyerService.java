package com.example.esprituniv.services;

import com.example.esprituniv.entities.Foyer;
import com.example.esprituniv.entities.TunisianGovernorate;
import com.example.esprituniv.entities.TypeFoyer;
import com.example.esprituniv.entities.Universite;
import com.example.esprituniv.repository.BlocRepository;
import com.example.esprituniv.repository.FoyerRepository;
import com.example.esprituniv.repository.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FoyerService  implements IFoyerService {

    FoyerRepository foyerRepository;
    BlocRepository blocRepository;
    UniversiteRepository universiteRepository;


    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }


    @Override
    public List<Foyer> getAllFoyersByGrouvenerat(TunisianGovernorate grouvenerat) {
        return foyerRepository.findAllFoyersByGrouvenerat(grouvenerat);
    }
    @Override
    public Long countFoyersByGrouvenerat(TunisianGovernorate grouvenerat) {
        return foyerRepository.countFoyersByGrouvenerat(grouvenerat);
    }
    @Override
    public List<Foyer> getFoyersByType(TypeFoyer type) {
        return foyerRepository.findFoyersByType(type);
    }
    @Override
    public Map<TypeFoyer, Long> countFoyersByType() {
        List<Object[]> results = foyerRepository.countFoyersByType();

        return results.stream()
                .collect(Collectors.toMap(
                        arr -> (TypeFoyer) arr[0],
                        arr -> (Long) arr[1]
                ));
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
;
        return foyerRepository.save(f);

    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }


    @Override
    public void archiverFoyer(long idFoyer) {

    }




}
