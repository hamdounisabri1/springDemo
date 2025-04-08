package tn.esprit.springprod.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springprod.entities.Bloc;
import tn.esprit.springprod.entities.Foyer;
import tn.esprit.springprod.entities.Universite;
import tn.esprit.springprod.repositories.IFoyerRepository;
import tn.esprit.springprod.repositories.IUniversiteRepository;

import java.util.List;

@Service
public class FoyerService implements IFoyerService{

    @Autowired
    IFoyerRepository foyerRepository;
    @Autowired
    IUniversiteRepository universiteRepository;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return (List<Foyer>) foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepository.findById(idFoyer).orElseThrow(() -> new EntityNotFoundException("Foyer not found"));
    }

    @Override
    public void removeFoyer(long idFoyer) {
                foyerRepository.deleteById(idFoyer);
    }

    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        foyer.setUniversite(universite);

        for(Bloc bloc : foyer.getBlocs()) {
            bloc.setFoyer(foyer);
        }
        foyerRepository.save(foyer);
        return foyer;
    }
}
