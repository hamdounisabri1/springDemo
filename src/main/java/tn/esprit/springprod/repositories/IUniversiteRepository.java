package tn.esprit.springprod.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springprod.entities.Universite;

@Repository

public interface IUniversiteRepository extends CrudRepository<Universite, Long> {
    public Universite findByNomUniversite(String name);
}
