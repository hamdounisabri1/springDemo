package tn.esprit.springprod.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springprod.entities.Foyer;


@Repository

public interface IFoyerRepository extends CrudRepository<Foyer,Long> {
}
