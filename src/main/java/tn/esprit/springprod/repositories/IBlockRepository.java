package tn.esprit.springprod.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springprod.entities.Bloc;


@Repository
public interface IBlockRepository extends CrudRepository<Bloc, Long> {


}
