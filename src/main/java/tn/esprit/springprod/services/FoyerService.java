package tn.esprit.springprod.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springprod.entities.Foyer;
import tn.esprit.springprod.repositories.IFoyerRepository;

import java.util.List;

@Service
public class FoyerService implements IFoyerService{

    @Autowired
    IFoyerRepository foyerRepository;

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
}
