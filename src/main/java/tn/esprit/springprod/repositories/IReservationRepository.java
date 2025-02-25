package tn.esprit.springprod.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springprod.entities.Reservation;

@Repository

public interface IReservationRepository extends CrudRepository<Reservation, String> {
}
