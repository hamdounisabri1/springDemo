package tn.esprit.springprod.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springprod.entities.Etudiant;
import tn.esprit.springprod.repositories.IEtudiantRepository;

import java.util.List;

@Service
public class EtudiantService implements IEtudiantService{


    @Autowired
    IEtudiantRepository etudiantRepository;


    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>) etudiantRepository.findAll();
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return (List<Etudiant>) etudiantRepository.saveAll(etudiants);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElseThrow(() -> new EntityNotFoundException("Etudiant not found"));
    }

    @Override
    public void removeEtudiant(long idEtudiant) {
             etudiantRepository.deleteById(idEtudiant);
    }
}
