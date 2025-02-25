package tn.esprit.springprod.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springprod.entities.Chambre;

@Repository
public interface IChambreRepository extends CrudRepository<Chambre, Long> {
}
