package tn.esprit.springprod.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springprod.entities.Etudiant;

@Repository

public interface IEtudiantRepository extends CrudRepository<Etudiant, Long> {
}
